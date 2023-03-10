package com.example.otpverification

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class SendOTPActivity : AppCompatActivity() {
    private lateinit var btnGetOtp : Button
    private lateinit var inputMobile : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_send_otpactivity)

        btnGetOtp = findViewById(R.id.btn_GetOtp)
        inputMobile = findViewById(R.id.inputMobile)

        btnGetOtp.setOnClickListener{
            if(inputMobile.getText().toString().trim().isEmpty()){
                Toast.makeText(this, "Please Enter Valid Mobile Number", Toast.LENGTH_SHORT).show()
            }else{
                val intent=Intent(this@SendOTPActivity,VerifyOTPActivity::class.java)
                intent.putExtra("mobile",inputMobile.getText().toString())
                Toast.makeText(this, inputMobile.text.toString(), Toast.LENGTH_SHORT).show()
                startActivity(intent)
            }
        }


    }
}

