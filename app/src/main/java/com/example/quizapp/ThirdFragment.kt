package com.example.quizapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.graphics.toColorInt


class ThirdFragment : Fragment(R.layout.fragment_third) {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_third, container, false)

        val rawShowChoice = root.findViewById(R.id.tvThirdChoice) as TextView
        rawShowChoice.text = vastaukset[2]

        if (vastaukset == oikeatvastaukset) {
            onnistuminen = 1
        } else {
            onnistuminen = 0
        }


        val button7Result = root.findViewById(R.id.btnTest7) as Button
        button7Result.setOnClickListener() {
            vastaukset.set(2, "A")
            val rawShowChoice = root.findViewById(R.id.tvThirdChoice) as TextView
            rawShowChoice.text = vastaukset[2]


            if (vastaukset == oikeatvastaukset) {
                onnistuminen = 1
            } else {
                onnistuminen = 0
            }
            var finalResultBox = root.findViewById(R.id.tvFinalResults) as TextView
            if (onnistuminen == 1) {
                finalResultBox.setTextColor("#00CC00".toColorInt())
                finalResultBox.text = "ONNEKSI OLKOON, KAIKKI OIKEIN!"

            } else {
                finalResultBox.setTextColor("#000000".toColorInt())
                finalResultBox.text = "Odotellaan oikeita vastauksia..."

            }
        }
        val button8Result = root.findViewById(R.id.btnTest8) as Button
        button8Result.setOnClickListener() {
            vastaukset.set(2, "B")
            val rawShowChoice = root.findViewById(R.id.tvThirdChoice) as TextView
            rawShowChoice.text = vastaukset[2]


            if (vastaukset == oikeatvastaukset) {
                onnistuminen = 1
            } else {
                onnistuminen = 0
            }
            var finalResultBox = root.findViewById(R.id.tvFinalResults) as TextView
            if (onnistuminen == 1) {
                finalResultBox.setTextColor("#00CC00".toColorInt())
                finalResultBox.text = "ONNEKSI OLKOON, KAIKKI OIKEIN!"

            } else {
                finalResultBox.setTextColor("#000000".toColorInt())
                finalResultBox.text = "Odotellaan oikeita vastauksia..."

            }
        }
        val button9Result = root.findViewById(R.id.btnTest9) as Button
        button9Result.setOnClickListener() {
            vastaukset.set(2, "C")
            val rawShowChoice = root.findViewById(R.id.tvThirdChoice) as TextView
            rawShowChoice.text = vastaukset[2]


            if (vastaukset == oikeatvastaukset) {
                onnistuminen = 1
            } else {
                onnistuminen = 0
            }
            var finalResultBox = root.findViewById(R.id.tvFinalResults) as TextView
            if (onnistuminen == 1) {
                finalResultBox.setTextColor("#00CC00".toColorInt())
                finalResultBox.text = "ONNEKSI OLKOON, KAIKKI OIKEIN!"

            } else {
                finalResultBox.setTextColor("#000000".toColorInt())
                finalResultBox.text = "Odotellaan oikeita vastauksia..."

            }

        }

        var finalResultBox = root.findViewById(R.id.tvFinalResults) as TextView
        if (onnistuminen == 1) {
            finalResultBox.setTextColor("#00CC00".toColorInt())
            finalResultBox.text = "ONNEKSI OLKOON, KAIKKI OIKEIN!"

        } else {
            finalResultBox.setTextColor("#000000".toColorInt())
            finalResultBox.text = "Odotellaan oikeita vastauksia..."

        }

        return root
    }


}
