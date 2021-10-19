package com.example.prueba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.prueba.MainActivity.Constantes.EXTRA_NOMBRE

class MainActivity2 : AppCompatActivity() {
    lateinit var tvRecibeNombre : TextView;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        iniciaViews()
        //recibe el texto de la otra view
        tvRecibeNombre.setText(intent.getStringExtra(EXTRA_NOMBRE).toString())
    }
    fun iniciaViews(){
        tvRecibeNombre= findViewById(R.id.tvRecibeNombre)
    }

}