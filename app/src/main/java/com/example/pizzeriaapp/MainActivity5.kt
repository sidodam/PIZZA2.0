package com.example.pizzeriaapp

import android.app.ActionBar.LayoutParams
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintSet
import androidx.constraintlayout.widget.ConstraintSet.Layout
import androidx.core.content.ContextCompat
import com.example.pizzeriaapp.databinding.ActivityMain3Binding
import com.example.pizzeriaapp.databinding.ActivityMain5Binding
import com.example.pizzeriaapp.databinding.ActivityMainBinding

class MainActivity5 : AppCompatActivity() {
    private lateinit var binding: ActivityMain5Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain5Binding.inflate(layoutInflater)
        setContentView(binding.root)
        val bundle = intent.extras

        var masPaperoni = 1
        var masQueso = 1
        var masPimiento = 1


        val imageView = ImageView(this)
      imageView.layoutParams = LinearLayout.LayoutParams(750 , 750) // wdith , height respectively

        imageView.setImageResource(R.mipmap.psba_foreground)

        binding.layoutt.addView(imageView)

           binding.masPaperoni.setOnClickListener{

               binding.paperoniCont.setText(masPaperoni.toString())
               masPaperoni++
           }


        binding.masQueso.setOnClickListener{

            binding.quesoCont.setText(masQueso.toString())
            masQueso++
        }


        binding.masPimiento.setOnClickListener{

            binding.quesoCont.setText(masQueso.toString())
            masPimiento++
        }


        binding.menosPaperoni.setOnClickListener{

            binding.paperoniCont.setText(masPimiento.toString())
            masPaperoni--
        }



        binding.menosQueso.setOnClickListener{

            binding.quesoCont.setText(masQueso.toString())
            masQueso--
        }


        binding.menosPimiento.setOnClickListener{

            binding.pimientoCont.setText(masPimiento.toString())
            masPimiento--
        }




    }
}