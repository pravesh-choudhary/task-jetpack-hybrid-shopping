package com.example.taskjetpack


import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.NavController
import com.example.myapplication.R
import java.util.regex.Pattern

@Composable
fun LoginActivity(navController: NavController){
    AndroidView(factory = {
        View.inflate(it, R.layout.activity_login,null)
    },
            modifier = Modifier.fillMaxSize(),
        update = {view->
            val txt:TextView=view.findViewById<TextView>(R.id.txtEmail)
            val btn:Button=view.findViewById<Button>(R.id.btnSubmit)
            txt.text="praves@gmail.com"
            btn.setOnClickListener {

                    navController.navigate("banner")

            }

        }
        )
}

val EMAIL_ADDRESS_PATTERN: Pattern = Pattern.compile(
    "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
            "\\@" +
            "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
            "(" +
            "\\." +
            "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
            ")+"
)