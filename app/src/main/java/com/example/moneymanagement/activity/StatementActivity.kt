package com.example.moneymanagement.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.moneymanagement.adapter.StatementAdapter
import com.example.moneymanagement.databinding.ActivityStatmentBinding

class StatementActivity : AppCompatActivity() {

    lateinit var binding: ActivityStatmentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityStatmentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initView()
    }

    private fun initView() {
        binding.header.btnBackArrow.setOnClickListener {
            finish()
        }
        binding.header.txtAddIncomeTitle.text = "Statement"


        val statementAdapter = StatementAdapter(this)
        val manager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.RcvList.layoutManager = manager
        binding.RcvList.adapter = statementAdapter
    }
}