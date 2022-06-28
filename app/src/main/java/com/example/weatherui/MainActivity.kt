package com.example.weatherui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.weatherui.ui.theme.WeatherUITheme
import com.example.weatherui.utils.setUpNavController

class MainActivity : ComponentActivity() {

    lateinit var navHostController: NavHostController


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherUITheme {
                navHostController = rememberNavController()
                setUpNavController(navController = navHostController)
            }
        }
    }
}

