package com.example.weatherui.utils

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.weatherui.screen.SplashComponent


@Composable
fun setUpNavController(navController: NavController) {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = NavRoutes.SplashScreen.routes) {


        composable(
            NavRoutes.SplashScreen.routes
        ){
            SplashComponent(navController = navController)
        }





    }


}
