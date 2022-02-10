package com.example.taskjetpack

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.BannerActivity

@Composable
fun NavigationController() {
    val navController= rememberNavController()
    NavHost(navController = navController, startDestination =Screen.SplashActivity.route){
        composable(Screen.SplashActivity.route){
            Splash(navController = navController)
        }
        composable(Screen.LoginActivity.route){
            LoginActivity(navController = navController)
        }
        composable(Screen.BannerActivity.route){
            BannerActivity(navController=navController)
        }
    }
}