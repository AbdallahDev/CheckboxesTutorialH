package com.example.abdallahsarayrah.checkboxestutorialh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var selections = ArrayList<String>()

        checkBoxOne.setOnClickListener {
            when (checkBoxOne.isChecked) {
                true -> selections.add("ioniq")
                false -> selections.remove("ioniq")
            }
        }
        checkBoxTwo.setOnClickListener {
            when (checkBoxTwo.isChecked) {
                true -> selections.add("tesla")
                false -> selections.remove("tesla")
            }
        }
        checkBoxThree.setOnClickListener {
            when (checkBoxThree.isChecked) {
                true -> selections.add("leaf")
                false -> selections.remove("leaf")
            }
        }

        buttonResult.setOnClickListener {
            if (selections.size > 0) {
                textViewResult.text = ""
                for (selection in selections) {
                    if (selection != selections[selections.size - 1]) textViewResult.text = textViewResult.text.toString() + selection + " \\ "
                    else textViewResult.text = textViewResult.text.toString() + selection
                }
            } else textViewResult.text = "nothing choosed"
        }
    }
}
