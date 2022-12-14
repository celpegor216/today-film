package com.example.todayfilm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel: ViewModel() {
    private var isPlay: MutableLiveData<Boolean> = MutableLiveData()
    private var isPrepared: MutableLiveData<Int> = MutableLiveData(0)
    private var articleIdx: MutableLiveData<String> = MutableLiveData()

    fun getIsPlay(): LiveData<Boolean> {
        return isPlay
    }

    fun setIsPlay(boolean: Boolean) {
        isPlay.value = boolean
    }

    fun getArticleIdx(): LiveData<String> {
        return articleIdx
    }

    fun setArticleIdx(string: String) {
        articleIdx.value = string
    }

    fun getIsPrepared(): LiveData<Int> {
        return isPrepared
    }

    fun setIsPrepared(int: Int) {
        isPrepared.value = isPrepared.value?.plus(int)
    }
}