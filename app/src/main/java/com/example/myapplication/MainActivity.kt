package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.widget.Toolbar
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    private lateinit var editTextUsername: EditText
    private lateinit var editTextPassword: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Ustawienie tytułu na pasku narzędzi
        supportActionBar?.title = getString(R.string.app_name)

        // Pobranie referencji do elementów interfejsu
        editTextUsername = findViewById(R.id.editTextUsername)
        editTextPassword = findViewById(R.id.editTextPassword)

        // Ustawienie akcji dla przycisku "Login"
        val buttonLogin: Button = findViewById(R.id.buttonLogin)
        buttonLogin.setOnClickListener {
            val login = editTextUsername.text.toString()
            val haslo = editTextPassword.text.toString()

            if (login == "admin" && haslo == "password") {
                val intent = Intent(this, UserInfo::class.java)
                startActivity(intent)
            }
            else {
                // Wyświetlenie komunikatu o błędnym loginie lub haśle
                Toast.makeText(this, "Logowanie nieudane", Toast.LENGTH_SHORT).show()
            }
        }
    }

}