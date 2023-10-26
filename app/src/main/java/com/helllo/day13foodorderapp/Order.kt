package com.helllo.day13foodorderapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class Order : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        //Yha maine ek variable "ordersOFCustomer" bnaya h, joki "intent' ke trough "MainActivity" se KEY ko le rha h
        val ordersOFCustomer = intent.getStringExtra(MainActivity.KEY)

        //Yha maine ek Variable "food" bnaya h, joki ek "TextView" h, Or iske under hum Main Activity se
        //liye gye "string ko Print kra rhe h

        val food= findViewById<TextView>(R.id.foodOrder)

        food.text= "Order Placed " + ordersOFCustomer.toString()
    }
}