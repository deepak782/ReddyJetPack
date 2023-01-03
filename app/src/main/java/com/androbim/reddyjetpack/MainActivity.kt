package com.androbim.reddyjetpack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.androbim.reddyjetpack.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding

    lateinit var numString: String
    lateinit var mailString: String
    lateinit var idString: String
    private var idInt=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.apply {
            SubmitBtn.setOnClickListener {
                myModel=UserModel()
            }
        }
    }

    private fun UserModel(): DataBindingModel{
        numString=binding.numberEdt.text.toString()
        mailString=binding.mailEdt.text.toString()
        idString=binding.IdEdt.text.toString()
        idInt=idString.toInt()
        return DataBindingModel(idInt,numString,mailString)
    }
}