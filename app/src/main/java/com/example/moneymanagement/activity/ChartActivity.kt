package com.example.moneymanagement.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.moneymanagement.R
import com.example.moneymanagement.databinding.ActivityChartBinding

class ChartActivity : AppCompatActivity() {

    lateinit var binding : ActivityChartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityChartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initView()
    }

    private fun initView() {


    }
}