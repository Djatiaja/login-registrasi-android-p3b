package com.example.login

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.login.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val Button_submit: Button = binding.SubmitButton;
        Button_submit.setOnClickListener(){

            var email = binding.InputEmail.text;
            var fullname = binding.InputFullname.text;
            var  username = binding.InputUsername.text;
            var  password = binding.InputPassword.text;

            Toast.makeText(this, "email : "+ email, Toast.LENGTH_SHORT).show()
            Toast.makeText(this, "fullname : "+ fullname, Toast.LENGTH_SHORT).show()
            Toast.makeText(this, "username : "+ username, Toast.LENGTH_SHORT).show()
            Toast.makeText(this, "password : "+ password, Toast.LENGTH_SHORT).show()

        }
    }
}