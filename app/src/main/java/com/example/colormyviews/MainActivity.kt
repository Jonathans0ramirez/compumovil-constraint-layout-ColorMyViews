package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun makeColored(view: View, width: Int, height: Int) {
        when (view.id) {
            // Boxes using Color class colors for the background
            R.id.box_one_text -> {
                view.setBackgroundResource(R.drawable.hollow_knight_6)
                view.layoutParams.width = width
                view.layoutParams.height = height
            }
            R.id.box_two_text -> {
                view.setBackgroundResource(R.drawable.hollow_knight_3)
                view.layoutParams.width = width
                view.layoutParams.height = height
            }
            R.id.box_three_text -> {
                view.setBackgroundResource(R.drawable.hollow_knight_5)
                view.layoutParams.width = width
                view.layoutParams.height = height
            }
            R.id.box_four_text -> {
                view.setBackgroundResource(R.drawable.hollow_knight_4)
                view.layoutParams.width = width
                view.layoutParams.height = height
            }
            R.id.box_five_text -> {
                view.setBackgroundResource(R.drawable.hollow_knight_2)
                view.layoutParams.width = width
                view.layoutParams.height = height
            }
            else -> {
                view.setBackgroundResource(R.drawable.hollow_knight_1)
                view.layoutParams.width = width
                view.layoutParams.height = height
            }
        }
    }

    private fun setListeners() {

        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)

        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)

        val clickableViews: List<View> =
            listOf(
                boxOneText, boxTwoText, boxThreeText,
                boxFourText, boxFiveText, rootConstraintLayout
            )

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it, item.width, item.height) }
        }
    }
}