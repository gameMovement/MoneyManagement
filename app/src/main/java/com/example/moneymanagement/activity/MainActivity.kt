package com.example.moneymanagement.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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


            val intent = Intent(this, AddInExActivity::class.java)
            intent.putExtra("type", "Income")
            startActivity(intent)
        }
        binding.btnAddExpense.setOnClickListener {
            val intent = Intent(this, AddInExActivity::class.java)
            intent.putExtra("type", "Expense")
            startActivity(intent)
        }
        binding.btnStatement.setOnClickListener {
            val intent = Intent(this, StatementActivity::class.java)
            startActivity(intent)
        }
        binding.imgPieChart.setOnClickListener {
            val intent = Intent(this, ChartActivity::class.java)
            startActivity(intent)
        }

    }
}