package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toolbar
import com.google.firebase.firestore.auth.User

class UserInfo : AppCompatActivity() {
    private lateinit var user: User
    private lateinit var toolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_info)

        supportActionBar?.title = getString(R.string.app_name)
        //Ustawienie paska narzedzi jako ActionBar
        findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar()

    }

    private fun setSupportActionBar() {
        TODO("Not yet implemented")
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        // Ładowanie menu do paska narzędzi
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Obsługa kliknięć w opcje menu
        when (item.itemId) {
            R.id.action_user_info -> {
                val intent = Intent(this, UserInfo::class.java)
                startActivity(intent)
                return true
            }
            R.id.action_assessment_table -> {
                val intent = Intent(this, TabelaOcen::class.java)
                startActivity(intent)
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }
}
