package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var edtNum1:EditText = findViewById(R.id.edtNum1)
        var edtNum2 :EditText = findViewById(R.id.edtNum2)
        var txtResult :TextView = findViewById(R.id.txtResult)
        var btnPlus : Button = findViewById(R.id.btnPlus)
        var btnMinus :Button = findViewById(R.id.btnMinus)
        var btnMultiply :Button = findViewById(R.id.btnMultiply)
        var btnDiv :Button = findViewById(R.id.btnDiv)

        var result:Int
        var num1:Int
        var num2:Int

           btnPlus.setOnClickListener {
               num1 =  edtNum1.text.toString().toInt()
               num2 = edtNum2.text.toString().toInt()
               result = num1 + num2
               txtResult.text = result.toString()
               edtNum1.text.clear()
               edtNum2.text.clear()
           }

           btnMinus.setOnClickListener {
               num1 =  edtNum1.text.toString().toInt()
               num2 = edtNum2.text.toString().toInt()
               result = num1 - num2
               txtResult.text = result.toString()
               edtNum1.text.clear()
               edtNum2.text.clear()
           }
           btnMultiply.setOnClickListener {
               num1 =  edtNum1.text.toString().toInt()
               num2 = edtNum2.text.toString().toInt()
               result = num1 * num2
               txtResult.text = result.toString()
               edtNum1.text.clear()
               edtNum2.text.clear()
           }
           btnDiv.setOnClickListener {
               num1 =  edtNum1.text.toString().toInt()
               num2 = edtNum2.text.toString().toInt()
               result = num1 / num2
               txtResult.text = result.toString()
               edtNum1.text.clear()
               edtNum2.text.clear()
           }

    }
}