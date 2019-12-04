package com.example.hw3b

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.HW4a.Listitem
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_shopping_category.*

class ShoppingCategory : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping_category)
        val reciveIntent=intent
        var recivmsag=reciveIntent.getStringExtra("user")?.toString()
        var recivmsg2:String="welcome "+recivmsag
        textView6.text=recivmsg2

    }

    fun pic4(view: View) {
//        Toast.makeText(this,"You  have  chosen  the  Food  category  of  shopping",Toast.LENGTH_LONG).show()
       var intent1=Intent(this,Listitem::class.java)
        intent1.putExtra("picfood","food")
        startActivity(intent1)

    }
    fun pic2(view: View) {
//        Toast.makeText(this,"You  have  chosen  the  Beauty  category  of  shopping",Toast.LENGTH_LONG).show()
        var intent1=Intent(this,Listitem::class.java)
        intent1.putExtra("piccloth","cloths")
        startActivity(intent1)
    }
    fun pic3(view: View) {
//        Toast.makeText(this,"You  have  chosen  the  Clothing  category  of  shopping",Toast.LENGTH_LONG).show()

        var intent1=Intent(this,Listitem::class.java)
        intent1.putExtra("picbueaty","bueaty")
        startActivity(intent1)
    }
    fun pic1(view: View) {
//        Toast.makeText(this,"You  have  chosen  the  Electronics  category  of  shopping",Toast.LENGTH_LONG).show()

        var intent1=Intent(this,Listitem::class.java)
        intent1.putExtra("piceclectronics","electronics")
        startActivity(intent1)
    }
}
