package com.example.taskjetpack

import android.os.Handler
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.example.myapplication.R
import kotlinx.coroutines.delay

@Composable
fun Splash(navController: NavController){
    LaunchedEffect(Unit) {
        while(true) {
            navController.navigate("login")
            delay(5000)
        }
    }
    navController.navigate("login")
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ){
        Image(
            painter= painterResource(id = R.drawable.logo_dummy),
            contentDescription = null
        )
    }
}