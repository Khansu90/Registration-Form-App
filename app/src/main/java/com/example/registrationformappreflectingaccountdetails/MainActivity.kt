package com.example.registrationformappreflectingaccountdetails

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        spinnerAdapter()
        button_create_account.setOnClickListener {
            clickListener()


        }


    }

    private fun spinnerAdapter() {
        val spinnerValues = arrayOf("Mr","Ms","Mrs","Miss","Prof")
        val spinnerAdapter = ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,spinnerValues)
        spinner_user.adapter = spinnerAdapter

    }

    private fun clickListener() {
        val user = User (spinner_user.selectedItem?.toString(),edit_text_first_name.text.toString(),edit_text_last_name.text.toString(),edit_text_email_address.text.toString(),edit_text_phone_number.text.toString(),edit_text_password.text.toString())
        val myIntentActivity = Intent(this,SummaryActivity::class.java)
        myIntentActivity.putExtra("User",user)
        startActivity(myIntentActivity)

    }


}