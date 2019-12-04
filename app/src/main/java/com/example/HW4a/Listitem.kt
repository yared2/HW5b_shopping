package com.example.HW4a

//import android.support.v4.app.AppCompatActivity
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.get
import com.example.hw3b.R
import kotlinx.android.synthetic.main.activity_listitem.*
import java.lang.reflect.Array.get

class Listitem : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listitem)
        var elctronics = arrayOf("TV", "Radio", "video game", "Cooker", "Microwave oven", "Refrigerator", "Robotic vacuum cleaner",
                "Tablet", " Telephone", "Television", " Water heater", " Washing machine", "TV", "Radio", "video game", "Cooker", "Microwave oven", "Refrigerator")
        var cloths = arrayOf("T-shert", "suit", "tie", "T-shert", "suit", "tie", "T-shert", "suit", "tie", "T-shert", "suit", "tie")
        var food = arrayOf("chips", "banana", "mango", "orange", "pinaple", "chips", "banana", "mango", "chips", "banana", "mango", "chips", "banana", "mango", "chips", "banana", "mango")
        var beauty = arrayOf("Lipstick", "lip gloss", "lip liner", "lip plumper", "lip balm", "Lipstick", "lip gloss", "lip liner", "lip plumper", "lip balm")

        var valuefood = intent.getStringExtra("picfood")
        var valuecloth = intent.getStringExtra("piccloth")
        var valueelectronic = intent.getStringExtra(("piceclectronics"))
        var valuebueaty = intent.getStringExtra("picbueaty")

        if (valuefood == "food") {
            var adapterf = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, food)

            var text = TextView(this)
            text.setText("food")
            text.textSize = 25f
            text.setTextColor(Color.parseColor("#ff0000"))
            text.setBackgroundColor(100)
            listid.addHeaderView(text)
            listid.adapter = adapterf
            listid.setOnItemClickListener { parent, view, postion, id ->
                Toast.makeText(this, "you selected " + parent.getItemAtPosition(postion), Toast.LENGTH_LONG).show()
            }
        }
            if (valueelectronic == "electronics") {
                var adapterE = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, elctronics)
                var text = TextView(this)
                text.setText("Electroincs")
                text.textSize = 25f
                text.setTextColor(Color.parseColor("#ff0000"))
                text.setBackgroundColor(100)
                listid.addHeaderView(text)
                listid.adapter = adapterE
                listid.setOnItemClickListener { parent, view, postion, id ->
                    Toast.makeText(this, "you selected " + parent.getItemAtPosition(postion), Toast.LENGTH_LONG).show()
                }
            }
                if (valuecloth == "cloths") {
                    var adapterc = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, cloths)
                    var text = TextView(this)
                    text.setText("Cloths")
                    text.textSize = 25f
                    text.setTextColor(Color.parseColor("#ff0000"))
                    text.setBackgroundColor(100)
                    listid.addHeaderView(text)
                    listid.adapter = adapterc

                    listid.setOnItemClickListener { parent, view, postion, id ->
                        Toast.makeText(this, "you selected " + parent.getItemAtPosition(postion), Toast.LENGTH_LONG).show()


                    }
                }
                if (valuebueaty == "bueaty") {
                    var adapterb = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, beauty)
                    var text = TextView(this)
                    text.setText("Beauty")
                    text.textSize = 25f
                    text.setTextColor(Color.parseColor("#ff0000"))
                    listid.addHeaderView(text)
                    listid.adapter = adapterb
                    listid.setOnItemClickListener { parent, view, postion, id ->
                        Toast.makeText(this, "you selected " + parent.getItemAtPosition(postion), Toast.LENGTH_LONG).show()
                    }




                }


            }

        }




