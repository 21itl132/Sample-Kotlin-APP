package com.example.samplekotlinapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() , View.OnClickListener {
    lateinit var  btnadd :Button
    lateinit var  btnsub :Button
    lateinit var  btnmul :Button
    lateinit var  btndiv :Button
    lateinit var etA :  EditText
    lateinit var etB : EditText
    lateinit var resultTv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnadd = findViewById(R.id.btn_add)
        btnsub = findViewById(R.id.btn_sub)
        btnmul = findViewById(R.id.btn_mul)
        btndiv = findViewById(R.id.btn_div)
        etA = findViewById(R.id.et_a)
        etB = findViewById(R.id.et_b)
        resultTv = findViewById(R.id.result_Tv)

        btnadd.setOnClickListener(this)
        btnsub.setOnClickListener(this)
        btnmul.setOnClickListener(this)
        btndiv.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        val a = etA.text.toString().toDouble()
        val b = etB.text.toString().toDouble()
        var result = 0.0
        when(v?.id){
            R.id.btn_add ->{
                result = a+b
            }
            R.id.btn_sub ->{
                result = a-b
            }
            R.id.btn_mul ->{
                result = a*b
            }
            R.id.btn_div ->{
                result = a/b
            }
        }
        resultTv.text="Result is $result"
    }
}