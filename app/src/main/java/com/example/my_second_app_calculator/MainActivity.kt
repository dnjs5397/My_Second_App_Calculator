package com.example.my_second_app_calculator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.my_second_app_calculator.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var new = ""
        var old = "0"
        var value = ""
        var resulton : Boolean = false
        binding.clear.setOnClickListener {
            new = ""
            old = "0"
            value = ""
            binding.middleResult.setText("")
            binding.result.setText(value)
            resulton = false
        }

        binding.no0.setOnClickListener {
            if (binding.result.text != "0" && new != "") {
                value += "0"
                new += "0"
                binding.result.setText(value)
            }
        }

        binding.no1.setOnClickListener {
            value += "1"
            new += "1"
            binding.result.setText(value)
        }

        binding.no2.setOnClickListener {
            value += "2"
            new += "2"
            binding.result.setText(value)
        }

        binding.no3.setOnClickListener {
            value += "3"
            new += "3"
            binding.result.setText(value)
        }

        binding.no4.setOnClickListener {
            value += "4"
            new += "4"
            binding.result.setText(value)
        }

        binding.no5.setOnClickListener {
            value += "5"
            new += "5"
            binding.result.setText(value)
        }

        binding.no6.setOnClickListener {
            value += "6"
            new += "6"
            binding.result.setText(value)
        }
        binding.no7.setOnClickListener {
            value += "7"
            new += "7"
            binding.result.setText(value)
        }

        binding.no8.setOnClickListener {
            value += "8"
            new += "8"
            binding.result.setText(value)
        }

        binding.no9.setOnClickListener {
            value += "9"
            new += "9"
            binding.result.setText(value)
        }

        binding.equal.setOnClickListener {
            if (!value.endsWith("+") && !value.endsWith("-") && !resulton &&
                !value.endsWith("%") && !value.endsWith("×")) {
                old = binding.middleResult.text as String
                value = binding.middleResult.text as String
                binding.result.setText((binding.middleResult.text))
                binding.middleResult.setText("")
                new = ""
                resulton = true
            }
        }

        binding.plus.setOnClickListener {
            if (!value.endsWith("+") && value != "") {
                value += "+"
                binding.result.setText(value)
                if (new != "") {
                    old = ((old.toInt() + new.toInt()).toString())
                    new = ""
                    binding.middleResult.setText(old)
                }
                else
                    resulton = false
            }

        }
    }
}

