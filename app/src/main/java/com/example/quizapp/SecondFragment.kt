package com.example.quizapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class SecondFragment : Fragment(R.layout.fragment_second) {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_second, container, false)

        val rawShowChoice = root.findViewById(R.id.tvSecondChoice) as TextView
        rawShowChoice.text = vastaukset[1]

        if (vastaukset == oikeatvastaukset) {
            onnistuminen = 1
        } else {
            onnistuminen = 0
        }

        val button4Result = root.findViewById(R.id.btnTest4) as Button
        button4Result.setOnClickListener() {
            vastaukset.set(1, "A")
            val rawShowChoice = root.findViewById(R.id.tvSecondChoice) as TextView
            rawShowChoice.text = vastaukset[1]


            if (vastaukset == oikeatvastaukset) {
                onnistuminen = 1
            } else {
                onnistuminen = 0
            }
        }
        val button5Result = root.findViewById(R.id.btnTest5) as Button
        button5Result.setOnClickListener() {
            vastaukset.set(1, "B")
            val rawShowChoice = root.findViewById(R.id.tvSecondChoice) as TextView
            rawShowChoice.text = vastaukset[1]


            if (vastaukset == oikeatvastaukset) {
                onnistuminen = 1
            } else {
                onnistuminen = 0
            }
        }
        val button6Result = root.findViewById(R.id.btnTest6) as Button
        button6Result.setOnClickListener() {
            vastaukset.set(1, "C")
            val rawShowChoice = root.findViewById(R.id.tvSecondChoice) as TextView
            rawShowChoice.text = vastaukset[1]


            if (vastaukset == oikeatvastaukset) {
                onnistuminen = 1
            } else {
                onnistuminen = 0
            }
        }

        return root
    }

}
