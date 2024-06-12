package com.example.donjoaco

import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    //Variables
    private var edtUsername: EditText?=null
    private var edtPassword: TextInputEditText?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edtUsername = findViewById(R.id.edtUsername)
        edtPassword = findViewById(R.id.edtPassword)

    }

    fun onLogin(buttomLogin: View) {
        val messagepassword=getString(R.string.messagepassword)
        val messageusername=getString(R.string.messageusername)
        val userName : String= edtUsername!!.text.toString()

        if (userName=="Alan@correo.com" || userName=="Alan@correo.co")
        {
            if (edtPassword!!.text.toString()=="panda")
            {
                val negativeButton ={_:DialogInterface,_:Int->}

                val positiveButton = {dialog:DialogInterface, which:Int->
                        val intent = Intent(this,WelcomeActivity::class.java)
                        startActivity(intent)
                    }

                val dialog=AlertDialog.Builder(this)
                    .setTitle("Bienvenido")
                    .setMessage("User: "  + userName)
                    .setPositiveButton("ok",positiveButton)
                    .setNegativeButton("Cancelar",negativeButton)
                    .create()
                    .show()
            }
            else
            {
                val dialog=androidx.appcompat.app.AlertDialog.Builder(this)
                    .setTitle("Error")
                    .setMessage(messagepassword)
                    .create()
                    .show()
            }
        }
        else
        {
            /*
            val dialog=androidx.appcompat.app.AlertDialog.Builder(this)
                .setTitle("Error")
                .setMessage(messageusername)
                .create()
                .show()
             */
            Toast.makeText(this, messageusername,Toast.LENGTH_LONG).show()
        }
    }

    fun onRegister(view: View) {
        val intent = Intent(this,RegisterActivity::class.java)
        startActivity(intent)
    }
    fun onFacebook(view: View) {}
    fun onGoogle(view: View) {}
    fun onForgotpass(view: View) {}
}