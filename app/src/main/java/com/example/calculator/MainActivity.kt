package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var str = ""
        var temp = "0"
        var operation = 0
        //binding.tvAns.text = str

        binding.btnClear.setOnClickListener{
            str = ""
            temp = ""
            binding.tvAns.text = " "
        }
        binding.btn0.setOnClickListener {
            str += "0"
            binding.tvAns.text = str
        }
        binding.btn1.setOnClickListener {
            str += "1"
            binding.tvAns.text = str
        }
        binding.btn2.setOnClickListener {
            str += "2"
            binding.tvAns.text = str
        }
        binding.btn3.setOnClickListener {
            str += "3"
            binding.tvAns.text = str
        }
        binding.btn4.setOnClickListener {
            str += "4"
            binding.tvAns.text = str
        }
        binding.btn5.setOnClickListener {
            str += "5"
            binding.tvAns.text = str
        }
        binding.btn6.setOnClickListener {
            str += "6"
            binding.tvAns.text = str
        }
        binding.btn7.setOnClickListener {
            str += "7"
            binding.tvAns.text = str
        }
        binding.btn8.setOnClickListener {
            str += "8"
            binding.tvAns.text = str
        }
        binding.btn9.setOnClickListener {
            str += "9"
            binding.tvAns.text = str
        }

        binding.btnPlus.setOnClickListener {
            temp = str
            str = ""
            operation = 1
            binding.tvAns.text = str
        }
        binding.btnMinus.setOnClickListener {
            temp = str
            str = ""
            operation = 2
            binding.tvAns.text = str
        }
        binding.btnMul.setOnClickListener {
            temp = str
            str = ""
            operation = 3
            binding.tvAns.text = str
        }
        binding.btnDiv.setOnClickListener {
            temp = str
            str = ""
            operation = 4
            binding.tvAns.text = str
        }

        binding.btnAns.setOnClickListener {
            val first = temp.toDouble()
            val second = str.toDouble()
            when (operation) {
                1 -> {
                    binding.tvAns.text = (first + second).toString()
                }
                2 -> {
                    binding.tvAns.text = (first - second).toString()
                }
                3 -> {
                    binding.tvAns.text = (first * second).toString()
                }
                4 -> {
                    binding.tvAns.text = (first / second).toString()
                }
            }
        }
    }
}