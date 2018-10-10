package com.fake.testproject.ui.main

import android.util.Log
import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val TAG = "tag"

    var test = MutableLiveData<String>()

    fun buttonClicked(v: View) {
        Log.d(TAG, "Button Clicked")
        test.value = "Test"
    }
}
