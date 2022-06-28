package com.example.weatherui.screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.weatherui.ui.theme.White

@Composable
fun MainComponent(navController: NavController) {
    Scaffold(
        modifier = Modifier
            .fillMaxSize(),
        backgroundColor = White
    ) {
        MainScreen()
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreen() {
    MainComponent(navController = rememberNavController())
}