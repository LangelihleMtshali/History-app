package com.example.myhistoryapp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etAge = findViewById<EditText>(R.id.etAge)
        val btnGenerate = findViewById<Button>(R.id.btnGenerate)
        val btnClear = findViewById<Button>(R.id.btnClear)

        val tvDisplay = findViewById<TextView>(R.id.tvDisplay)

                btnGenerate.setOnClickListener {
                    val userAge = etAge.text.toString().toIntOrNull()

                    if (userAge != null && userAge in 20 until 100) {
                        val historicalFigures = mapOf(
                            20 to "James Dean",
                            30 to "Amelia Earhart",
                            40 to "John Lennon",
                            50 to "Michael Jackson",
                            60 to "Robin Williams",
                            70 to "David Carradine",
                            80 to "Mahatma Gandhi",
                            90 to "Nelson Mandela"
                        )

                        val matchedFigure = historicalFigures[userAge]
                        if (matchedFigure != null) {
                            tvDisplay.text = "Historical figure who passed away at the age of $userAge: $matchedFigure"
                        } else {
                            tvDisplay.text = "There are no historical figures who passed away at the age of $userAge."
                        }
                    } else {
                        tvDisplay.text = "Invalid age entered."
                    }
                }

                btnClear.setOnClickListener {
                    etAge.text.clear()
                    tvDisplay.text = ""
                }
            }

    }

