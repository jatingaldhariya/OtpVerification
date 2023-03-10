package com.example.otpverification

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class VerifyOTPActivity : AppCompatActivity() {
    private lateinit var btnVerifyOtp : Button
    private lateinit var inputCode1: EditText
    private lateinit var inputCode2: EditText
    private lateinit var inputCode3: EditText
    private lateinit var inputCode4: EditText
    private lateinit var inputCode5: EditText
    private lateinit var inputCode6: EditText
    private lateinit var textMobile: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify_otpactivity)


        btnVerifyOtp = findViewById(R.id.btn_VerifyOtp)
        inputCode1 = findViewById(R.id.inputCode1)
        inputCode2 = findViewById(R.id.inputCode2)
        inputCode3 = findViewById(R.id.inputCode3)
        inputCode4 = findViewById(R.id.inputCode4)
        inputCode5 = findViewById(R.id.inputCode5)
        inputCode6 = findViewById(R.id.inputCode6)
        textMobile = findViewById(R.id.textMobile)

        val number = intent.getStringExtra("mobile")
        textMobile.text = "+91-" + number;



        setupOTPInputs()
    }
    private fun setupOTPInputs() {


        inputCode1.addTextChangedListener(object : TextWatcher {
                override fun afterTextChanged(s: Editable?) {
                }
                override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                }

                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                    if(s.toString().trim().isNotEmpty()){
                        inputCode2.requestFocus()
                    }

                }
            })

        inputCode2.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
            }
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if(s.toString().trim().isNotEmpty()){
                    inputCode3.requestFocus()
                }
            }
        })

        inputCode3.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
            }
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if(s.toString().trim().isNotEmpty()){
                    inputCode4.requestFocus()
                }
            }
        })

        inputCode4.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
            }
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if(s.toString().trim().isNotEmpty()){
                    inputCode5.requestFocus()
                }
            }
        })

        inputCode5.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
            }
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if(s.toString().trim().isNotEmpty()){
                    inputCode6.requestFocus()
                }
            }
        })






        }

    }
