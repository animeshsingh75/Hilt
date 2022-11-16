package com.example.hilt

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import javax.inject.Named

@HiltViewModel
class MainActivityViewModel @Inject constructor(@Named("String1") testString2: String) :
    ViewModel() {
    init {
        Log.d("MainActivityViewModel", "$testString2")
    }
}