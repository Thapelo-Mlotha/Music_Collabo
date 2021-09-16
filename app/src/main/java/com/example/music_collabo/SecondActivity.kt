package com.example.music_collabo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class SecondActivity : AppCompatActivity() {

    lateinit var toggle:ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val btnMn:Button = findViewById(R.id.button2ndScr2)
        val btnMn2:Button = findViewById(R.id.button2ndScr)
        btnMn.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        btnMn2.setOnClickListener{
            val intent = Intent(this, ThirdScreen::class.java)
            startActivity(intent)
            finish()
        }

        //navigation drawer
        val drawerLayout : DrawerLayout = findViewById(R.id.drawerlayout2)
        val navView: NavigationView = findViewById(R.id.nav_view)

        toggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open,R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navView.setNavigationItemSelectedListener {


            when(it.itemId){
                R.id.nav_home -> Toast.makeText(applicationContext,"Clicked HOME", Toast.LENGTH_SHORT).show()



            }
            true
        }
    }
}