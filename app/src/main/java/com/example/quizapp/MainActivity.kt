package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.quizapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val mainFragment = MainFragment()
        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()
        val thirdFragment = ThirdFragment()

        if (vastaukset == oikeatvastaukset) {
            onnistuminen = 1
        } else {
            onnistuminen = 0
        }

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, mainFragment)
            commit()
        }


        binding.btnFragment1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, firstFragment)
                addToBackStack(null)
                commit()
            }
        }


        binding.btnFragment2.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, secondFragment)
                addToBackStack(null)
                commit()
            }
        }

        binding.btnFragment3.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, thirdFragment)
                addToBackStack(null)
                commit()
            }
        }


    }


}
