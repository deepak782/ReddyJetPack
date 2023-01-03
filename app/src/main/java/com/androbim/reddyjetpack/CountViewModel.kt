package com.androbim.reddyjetpack

import androidx.lifecycle.ViewModel

class CountViewModel: ViewModel() {
    private var count=0

    fun getCurrentCount():Int{
        return  count
    }

    fun updatedCount():Int{
        return ++count
    }
}