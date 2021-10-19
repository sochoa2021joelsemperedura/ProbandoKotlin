package com.example.prueba
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.prueba.MainActivity.Constantes.EXTRA_NOMBRE

class MainActivity : AppCompatActivity() {


    //lateinit para asignar objetos View en onViewCreated
    lateinit var tvMiNombre : TextView
    lateinit var btnEnviar : Button

    //las constantes se declaran dentro de un objeto y con val que es inmutable
    object Constantes{
        const val EXTRA_NOMBRE = "MainActivity.NOMBRE"
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        iniciaViews()

        btnEnviar.setOnClickListener(){
            run{
                val mensageAEnviar = tvMiNombre.text.toString()
                val intent = Intent(this,MainActivity2::class.java).apply{
                    putExtra(EXTRA_NOMBRE,mensageAEnviar)
                }
                startActivity(intent)
            }
        }
    }
    fun iniciaViews(){
        tvMiNombre=findViewById(R.id.tvMiNombre)
        btnEnviar=findViewById(R.id.btnEnviar)

    }
}