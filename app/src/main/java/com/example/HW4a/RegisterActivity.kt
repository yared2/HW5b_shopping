package com.example.hw3b

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_register.*
import kotlinx.android.synthetic.main.activity_register.email

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
    }

    fun creatacc(view: View) {
        if(firstName.text.toString().isNullOrEmpty()|| lastName.text.toString().isNullOrEmpty()||
                email.text.toString().isNullOrEmpty()|| passwordr.text.toString().isNullOrEmpty()){
            Toast.makeText(this,"Please fill the fields",Toast.LENGTH_LONG).show()
        }else{

            val fname=firstName.text.toString()
            val lname=lastName.text.toString()
            val eml=email.text.toString()
            val pwrd=passwordr.text.toString()

         val userRegstered=User(fname,lname,eml,pwrd)

            val intentRegster=Intent(this,MainActivity::class.java)
            intentRegster.putExtra("userRegester",userRegstered)
            setResult(Activity.RESULT_OK,intentRegster)
            finish()



        }
    }
}
