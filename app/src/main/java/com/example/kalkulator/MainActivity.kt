package com.example.luas_segitiga

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.kalkulator.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputBase: EditText = findViewById(R.id.input_base)
        val inputHeight: EditText = findViewById(R.id.input_height)
        val btnCalculate: Button = findViewById(R.id.btn_calculate)
        val resultText: TextView = findViewById(R.id.result_text)

        btnCalculate.setOnClickListener {
            val base = inputBase.text.toString().toDoubleOrNull()
            val height = inputHeight.text.toString().toDoubleOrNull()

            if (base != null && height != null) {
                val area = 0.5 * base * height
                resultText.text = "Hasil: Luas segitiga adalah $area"
            } else {
                Toast.makeText(this, "Mohon masukkan angka yang valid", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
