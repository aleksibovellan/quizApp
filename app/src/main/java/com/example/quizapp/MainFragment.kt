package com.example.quizapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class MainFragment : Fragment(R.layout.fragment_main) {

}

val vastaukset = mutableListOf("-", "-", "-")
val oikeatvastaukset = mutableListOf("B", "B", "C")
var onnistuminen = 0
