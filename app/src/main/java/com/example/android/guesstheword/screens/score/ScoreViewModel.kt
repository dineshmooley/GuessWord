package com.example.android.guesstheword.screens.score

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScoreViewModel(finalScore: Int) : ViewModel() {

    private var _finalScore = MutableLiveData<Int>()
    val finalScore: LiveData<Int>
        get() = _finalScore

    private var _onPlay = MutableLiveData<Boolean>()
    val onPlay: LiveData<Boolean>
        get() = _onPlay

    init {
        _finalScore.value = finalScore
        _onPlay.value = false
    }

    fun onPlaying() {
        _onPlay.value = true
    }

    fun onPlayCompleted() {
        _onPlay.value = false
    }

}