package com.example.registrationformappreflectingaccountdetails

data class User(
    val title: String?,
    val firstName: String,
    val lastName: String,
    val email: String,
    val phoneNumber: String,
    val password: String
):java.io.Serializable{

    fun getYourFullName() = "$title,$firstName,$lastName"
}