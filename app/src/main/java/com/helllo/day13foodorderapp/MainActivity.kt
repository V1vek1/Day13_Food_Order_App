package com.helllo.day13foodorderapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {

    //Yha maine "kotlin" me "Global Variable" bnaya h, Jiske under me "Constant Variable" bnaya JIska Name h "KEY"
    //phir uske under me package name or Activity Name Diya bas
    companion object{
           const val KEY = "com.helllo.day13foodorderapp.MainActivity.KEY"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btn = findViewById<Button>(R.id.btnOrder)
        val btn1 = findViewById<EditText>(R.id.eT1)
        val btn2 = findViewById<EditText>(R.id.eT2)
        val btn3 = findViewById<EditText>(R.id.eT3)
        val btn4 = findViewById<EditText>(R.id.eT4)

        btn.setOnClickListener {

            val orderlist= btn1.text.toString() + " " + btn2.text.toString() + " " + btn3.text.toString() +
                      " " + btn4.text.toString()    //agar hum textke aage "toString" nahi bhi likhe to bhi code chalega
                                                    //kyuki sabhi "editText" "toString" me hi likhe hue h yani String
                                                   //String form mr hi likhe hue hai



              //Yha per mai Yeh code likha ki hum iss "activity" se Dusre "Activity" se attach kar rhe h or
              // 1st "Activity" ke data ko 2nd "activity" me bhej rhe h

              intent = Intent(this,Order::class.java)

              intent.putExtra(KEY, orderlist) //Yha per hum "This" ka matlab h ki hum "Iss Activity" se
                                              //values ko 2nd Activity me Show karna chate h, Yeh pura code yeh
                                              //h ki hamne "KEY" me kya kya VAlues Provide kiya h wo sab wha
                                              //Yahi 2nd Activity me Show ho

              startActivity(intent)           //Or yha maine Iss Activity ko Start kiya h
          }

    }
}