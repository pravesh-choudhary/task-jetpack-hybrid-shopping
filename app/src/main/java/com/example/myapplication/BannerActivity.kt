package com.example.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.taskjetpack.Screen

@Composable
fun BannerActivity(navController: NavController){
    Box(
        modifier = Modifier.fillMaxSize()
            .background(Color.Blue)
    ){}
}