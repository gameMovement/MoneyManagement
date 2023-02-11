package com.example.moneymanagement

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.moneymanagement.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding  = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initView()
    }

    private fun initView() {

        binding.btnAddIncome.setOnClickListener {


            var intent = Intent(this, AddInExActivity::class.java)
            intent.putExtra("type", "Income")
            startActivity(intent)
        }
        binding.btnAddExpense.setOnClickListener {
            var intent = Intent(this, AddInExActivity::class.java)
            intent.putExtra("type", "Expense")
            startActivity(intent)
        }
    }
}