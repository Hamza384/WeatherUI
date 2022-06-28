package com.example.weatherui.utils

sealed class NavRoutes(val routes: String) {
    object SplashScreen : NavRoutes("splash")
    object MainScreen : NavRoutes("main")
}
