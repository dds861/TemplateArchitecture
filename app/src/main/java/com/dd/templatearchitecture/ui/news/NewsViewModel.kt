package com.dd.templatearchitecture.ui.news

import android.app.Application
import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.dd.domain.model.news.DomainResponseNewsTopHeadlinesModel
import com.dd.domain.usecases.news.GetNewsHeadlinesUseCase
import com.dd.domain.util.Resource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class NewsViewModel(
    private val app: Application,
    val getNewsHeadlinesUseCase: GetNewsHeadlinesUseCase
) :
    AndroidViewModel(app) {

    val newsHeadLines: MutableLiveData<Resource<DomainResponseNewsTopHeadlinesModel>> =
        MutableLiveData()

    fun getNewsHeadlines(country: String, page: Int) {
        viewModelScope.launch(Dispatchers.IO) {
            newsHeadLines.postValue(Resource.Loading())
            try {
                if (isNetworkAvailable(app)) {
                    val apiResult = getNewsHeadlinesUseCase.execute(country = country, page = page)
                    newsHeadLines.postValue(apiResult)
                } else {
                    newsHeadLines.postValue(Resource.Error("Internet is not available"))
                }
            } catch (e: Exception) {
                newsHeadLines.postValue(Resource.Error(e.message.toString()))
            }
        }

    }

    private fun isNetworkAvailable(context: Context?): Boolean {
        if (context == null) return false
        val connectivityManager =
            context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            val capabilities =
                connectivityManager.getNetworkCapabilities(connectivityManager.activeNetwork)
            if (capabilities != null) {
                when {
                    capabilities.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> {
                        return true
                    }
                    capabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> {
                        return true
                    }
                    capabilities.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET) -> {
                        return true
                    }
                }
            }
        } else {
            val activeNetworkInfo = connectivityManager.activeNetworkInfo
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected) {
                return true
            }
        }
        return false

    }
}