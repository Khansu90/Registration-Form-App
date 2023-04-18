package com.example.registrationformappreflectingaccountdetails

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_summary.*

class SummaryActivity : AppCompatActivity() {

   lateinit var user : User
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_summary)
        retrieveAdapter()
        clickListener()
        setupAdapter()
    }

    private fun retrieveAdapter() {
        user = intent.getSerializableExtra("User") as User

    }

    private fun clickListener() {
        text_view_your_fullname.text = user.getYourFullName()
        text_view_your_email_address.text = user.email
        text_view_your_phone_number.text = user.phoneNumber

    }

    private fun setupAdapter() {

        text_view_your_email_address.setOnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO)
            intent.data = Uri.parse("mailto: ${user.email}")
            startActivity(intent)

        }
        text_view_your_phone_number.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel: ${user.phoneNumber}")
            startActivity(intent)
        }

        }
        }


