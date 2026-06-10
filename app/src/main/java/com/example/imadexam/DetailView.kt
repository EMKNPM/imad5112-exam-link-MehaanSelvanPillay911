package com.example.imadexam

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailView : AppCompatActivity() {
    //decla
    private lateinit var btnReturn: Button
    private lateinit var tvGearList: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //type
        btnReturn = findViewById(R.id.btnReturn)
        tvGearList = findViewById(R.id.tvGearList)

        //Exits the app
        btnReturn.setOnClickListener {
            finishAffinity()
        }



        enableEdgeToEdge()
        setContentView(R.layout.activity_detail_view)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}