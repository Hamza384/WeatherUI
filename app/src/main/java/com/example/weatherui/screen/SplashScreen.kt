package com.example.weatherui.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.weatherui.ui.theme.White

@Composable
fun SplashComponent(navController: NavController) {
    Scaffold(
        modifier = Modifier
            .fillMaxSize(),
        backgroundColor = White
    ) {
        SplashScreenUI()
    }

}

@Composable
fun SplashScreenUI() {
    Box {
        Card {
            Column {
                Text(text = "Hamza")
                Text(text = "Arshad")
                Button(
                    onClick = { /*TODO*/ }
                ) {
                    Text(text = "On Click")
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun SplashScreenView() {
    SplashComponent(rememberNavController())
}