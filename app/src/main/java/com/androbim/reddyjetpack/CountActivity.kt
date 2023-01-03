package com.androbim.reddyjetpack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.androbim.reddyjetpack.databinding.ActivityCountBinding

class CountActivity : AppCompatActivity() {
    lateinit var binding: ActivityCountBinding
    lateinit var viewModel: CountViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_count)
        //Creating instance for ViewModel
        viewModel=ViewModelProvider(this).get(CountViewModel::class.java)
        binding.apply {
            countTxt.text=viewModel.getCurrentCount().toString()
            incrementBtn.setOnClickListener {
                countTxt.text=viewModel.updatedCount().toString()
            }
        }
    }
}