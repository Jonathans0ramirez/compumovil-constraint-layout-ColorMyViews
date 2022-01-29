package com.example.colormyviews

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var toggle = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {

        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)
        val boxSixText = findViewById<TextView>(R.id.box_six_text)
        val boxSevenText = findViewById<TextView>(R.id.box_seven_text)

        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)

        val clickableViews: List<View> =
            listOf(
                boxOneText, boxTwoText, boxThreeText,
                boxFourText, boxFiveText, boxSixText, boxSevenText, rootConstraintLayout
            )

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }

    private fun makeColored(view: View) {
        toggle = if (toggle) {
            // Boxes using Color class colors for the background
            box_one_text.setBackgroundColor(Color.DKGRAY)
            box_two_text.setBackgroundColor(Color.GRAY)

            box_three_text.setBackgroundColor(Color.BLUE)
            box_four_text.setBackgroundColor(Color.MAGENTA)
            box_five_text.setBackgroundColor(Color.BLUE)
            box_six_text.setBackgroundColor(Color.YELLOW)
            box_seven_text.setBackgroundColor(Color.CYAN)
            false
        } else {
            // Boxes using Color class colors for the background
            box_one_text.setBackgroundColor(Color.WHITE)
            box_two_text.setBackgroundColor(Color.WHITE)

            box_three_text.setBackgroundColor(Color.WHITE)
            box_four_text.setBackgroundColor(Color.WHITE)
            box_five_text.setBackgroundColor(Color.WHITE)
            box_six_text.setBackgroundColor(Color.WHITE)
            box_seven_text.setBackgroundColor(Color.WHITE)
            true
        }
    }
}