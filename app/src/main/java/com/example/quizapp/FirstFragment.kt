package com.example.quizapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class FirstFragment : Fragment(R.layout.fragment_first) {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_first, container, false)

        val rawShowChoice = root.findViewById(R.id.tvFirstChoice) as TextView
        rawShowChoice.text = vastaukset[0]

        if (vastaukset == oikeatvastaukset) {
            onnistuminen = 1
        } else {
            onnistuminen = 0
        }

        val button1Result = root.findViewById(R.id.btnTest1) as Button
        button1Result.setOnClickListener() {
            vastaukset.set(0, "A")
            val rawShowChoice = root.findViewById(R.id.tvFirstChoice) as TextView
            rawShowChoice.text = vastaukset[0]


            if (vastaukset == oikeatvastaukset) {
                onnistuminen = 1
            } else {
                onnistuminen = 0
            }
        }
        val button2Result = root.findViewById(R.id.btnTest2) as Button
        button2Result.setOnClickListener() {
            vastaukset.set(0, "B")
            val rawShowChoice = root.findViewById(R.id.tvFirstChoice) as TextView
            rawShowChoice.text = vastaukset[0]


            if (vastaukset == oikeatvastaukset) {
                onnistuminen = 1
            } else {
                onnistuminen = 0
            }
        }
        val button3Result = root.findViewById(R.id.btnTest3) as Button
        button3Result.setOnClickListener() {
            vastaukset.set(0, "C")
            val rawShowChoice = root.findViewById(R.id.tvFirstChoice) as TextView
            rawShowChoice.text = vastaukset[0]


            if (vastaukset == oikeatvastaukset) {
                onnistuminen = 1
            } else {
                onnistuminen = 0
            }
        }


        return root
    }

}

