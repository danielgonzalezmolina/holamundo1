package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.graphics.Color
import android.util.Log
import android.widget.Button


class MainActivity : AppCompatActivity() {
    //Opción 1: Inicializar a null y después en OnCreate hacer la llamada a findViewById
    //var tvGreeting : TextView? = null

    //Opción 2: Inicialización tardía
    private val tvGreeting: TextView by lazy { findViewById(R.id.tvGreeting) }
    private val tvBye: TextView by lazy { findViewById(R.id.tvBye) }
    private val btChange: Button by lazy { findViewById(R.id.btnAction) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Aquí enlazamos el XML con la Activity
        setContentView(R.layout.activity_main)
        tvGreeting.setText(R.string.tvBye)

        //Declaración de un objeto anónimo
        /**btChange.setOnClickListener (object : View.OnClickListener{
        override fun onClick(view: View?) {
        TODO("Por implementar")
        }
        })**/

        //Utilizando el nombre por defecto del único parámetro it
        //btChange.setOnClickListener { it.setBackgroundColor(Color.RED) }
        //Darle un nombre parámetreo de la función onClick()
        btChange.setOnClickListener { view -> view.setBackgroundColor(Color.RED) }
        Log.v("HelloWorldXML", "Se ha ejecutado el método onCreate")
    }
    //region Resto de métodos del ciclo de vida de una actividad
    override fun onStart() {
        super.onStart()
        Log.v("HelloWorldXML", "Se ha ejecutado el método onStart")
    }
    override fun onResume(){
        super.onResume()
        Log.v("HelloWorldXML", "Se ha ejecutado el método onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.v("HelloWorldXML", "Se ha ejecutado el método onPause")
    }
    override fun onStop() {
        super.onStop()
        Log.v("HelloWorldXML", "Se ha ejecutado el método onStop")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.v("HelloWorldXML", "Se ha ejecutado el método onDestroy")
    }
    //endregion
}