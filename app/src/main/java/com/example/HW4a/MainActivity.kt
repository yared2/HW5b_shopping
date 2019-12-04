package com.example.hw3b

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.app.ActivityCompat.startActivityForResult
import androidx.core.content.ContextCompat.startActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.io.Serializable

class MainActivity : AppCompatActivity() {
    val listOfUsers = ArrayList<User>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listOfUsers.add(User("yared", "beyen", "yared@gmail.com", "111"))
        listOfUsers.add(User("alex", "maichl", "maicle@gmial.com", "abc"))
        listOfUsers.add(User("marry", "wiliam", "marry@gmail.com", "123"))
        listOfUsers.add(User("sara", "jhon", "sara@gmail.com", "111"))
        listOfUsers.add(User("jhon", "laster", "jhon@gmail.com", "222"))

    }

    override fun onActivityResult(
        requestCode: Int,
        resultCode: Int,
        data: Intent?
    ) { //geting from the second activity
        super.onActivityResult(requestCode, resultCode, data)
        //  var intt = Intent()
        if (requestCode == 1) {
            if (resultCode == Activity.RESULT_OK) {

                if (data != null) {

                    listOfUsers.add(data.getSerializableExtra("userRegester") as User)
                    Toast.makeText(this, "new user created", Toast.LENGTH_LONG).show()


                }
            }
        }
    }

    fun sign(view: View) {

        val emailInput = email.text.toString().trim()
        val password1 = password.text.toString().trim()
        if (emailInput.isNullOrEmpty() && password1.isNullOrEmpty()) {
            Toast.makeText(this, "please Enter Email and password", Toast.LENGTH_LONG).show()
        } else {
            for (item in listOfUsers) if (emailInput == item.userName && password1 == item.password) {
                val send = Intent(this, ShoppingCategory::class.java)
                send.putExtra("user", emailInput)
                startActivity(send)
                break
            }
        }

    }

    fun register(view: View) {
        val rgst = Intent(this, RegisterActivity::class.java)
        startActivityForResult(rgst, 1)

    }

    fun toEmail(view: View) {
        val input = email.text.toString().trim()

        if (input.isNullOrBlank()) {
            Toast.makeText(this, "Enter email for Rest", Toast.LENGTH_LONG).show()
        } else {
            for (item in listOfUsers) if (input == item.userName ){
                var pass= item.password
                var intt = Intent()
        intt.type = "text/plain"
        intt.action = Intent.ACTION_SEND
        intt.putExtra(Intent.EXTRA_TEXT, pass) // this can send password to
         startActivity(intt)

                }
        }
    }
}



