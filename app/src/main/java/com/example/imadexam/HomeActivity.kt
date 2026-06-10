package com.example.imadexam

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomeActivity : AppCompatActivity() {
    //decla
    private lateinit var tvList: TextView
    private lateinit var edtGear: EditText
    private lateinit var btnDark: Button
    private lateinit var btnAdd: Button
    private lateinit var btnGear: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //type
        tvList = findViewById(R.id.tvList)
        edtGear = findViewById(R.id.edtGear)
        btnDark = findViewById(R.id.btnDark)
        btnAdd = findViewById(R.id.btnAdd)
        btnGear = findViewById(R.id.btnGear)

        // saves gear data
        btnGear.setOnClickListener {
            saveGeardata()
        }




        enableEdgeToEdge()
        setContentView(R.layout.activity_home)






        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}

private fun saveGeardata(){


    //Error handling to mae sure all input fields are completed
    if(`Gear listing`.isEmpty()){
        Toast.makeText(this,"Temperatures must be valid numbers",Toast.LENGTH_SHORT).show()
        return
    }

}




