package com.example.taskjetpack

sealed class Screen(val route:String){
    object SplashActivity:Screen("splash")
    object LoginActivity:Screen("login")
    object BannerActivity:Screen("banner")
}