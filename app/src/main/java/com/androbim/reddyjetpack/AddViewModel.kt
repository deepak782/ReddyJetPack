package com.androbim.reddyjetpack

import androidx.lifecycle.ViewModel

class AddViewModel:ViewModel() {
    private var totalCount=0;

    fun getPresentCount():Int{
        return totalCount
    }

    fun updatedTotalCount(input:Int){
        totalCount+=input
    }
}