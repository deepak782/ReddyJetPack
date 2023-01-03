package com.androbim.reddyjetpack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.androbim.reddyjetpack.databinding.ActivityAddBinding

class AddActivity : AppCompatActivity() {
    lateinit var binding: ActivityAddBinding
    lateinit var viewModel: AddViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_add)
        viewModel=ViewModelProvider(this).get(AddViewModel::class.java)
        binding.apply {
            resultTxt.text=viewModel.getPresentCount().toString()

            addBtn.setOnClickListener {
                viewModel.updatedTotalCount(numberEdt1.text.toString().toInt())
                resultTxt.text=viewModel.getPresentCount().toString()
            }

        }
    }
}