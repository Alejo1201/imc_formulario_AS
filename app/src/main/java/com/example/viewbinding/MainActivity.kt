package com.example.viewbinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnIMC.setOnClickListener(this)
    }

    override fun onClick(v: View?) {

        val peso: Double = binding.txtPeso.text.toString().toDouble();
        val estatura: Double = binding.txtAltura.text.toString().toDouble();

        val imc: Double = peso / (estatura * estatura);

        if(v!!.id == binding.btnIMC.id){
            var intent: Intent = Intent(this, SegundaPage::class.java)
            intent.putExtra("imc", imc)
            startActivity(intent)
        }


    }

}