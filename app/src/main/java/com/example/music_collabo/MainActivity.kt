package com.example.music_collabo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    lateinit var toggle:ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //my screen buttons
        val btnM:Button = findViewById(R.id.btnMain)
        val btnM2:Button = findViewById(R.id.btnMain2)
        btnM.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
            finish()
        }
        btnM2.setOnClickListener{
            val intent = Intent(this, ThirdScreen::class.java)
            startActivity(intent)
            finish()
        }

        //navigation drawer
        val drawerLayout : DrawerLayout = findViewById(R.id.drawerlayout)
        val navView:NavigationView = findViewById(R.id.nav_view)

        toggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open,R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.nav_home -> Toast.makeText(applicationContext,"Clicked HOME",Toast.LENGTH_SHORT).show()


            }
            true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}