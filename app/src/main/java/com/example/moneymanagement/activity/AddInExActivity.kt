package com.example.moneymanagement.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.moneymanagement.databinding.ActivityAddInExBinding

class AddInExActivity : AppCompatActivity() {

    lateinit var binding : ActivityAddInExBinding

    lateinit var type: String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAddInExBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initView()
    }

    private fun initView() {
        type = intent.getStringExtra("type").toString()


//        binding.txtAddIncomeTitle.setText("Add " + type)
//        binding.entIncome.setText(type)
//        binding.txtOther.text = ("Other " + type)
//        if (type == "Income") {
//            binding.entIncome.setTextColor(ContextCompat.getColor(this, R.color.Green))
//        } else {
//            binding.entIncome.setTextColor(ContextCompat.getColor(this, R.color.red))
//        }
    }
}