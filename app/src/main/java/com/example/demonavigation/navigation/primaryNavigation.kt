package com.example.demonavigation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCompositionContext
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.demonavigation.screens.screenA
import com.example.demonavigation.screens.screenB
import com.example.demonavigation.screens.screenC

@Composable

fun primaryNavigation(modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "ScreenA") {
        composable("ScreenA"){
            screenA({name : String-> navController.navigate("ScreenB/$name")})
        }
        composable("ScreenB/{name}")
        {
            navBackStackEntry ->
            val name = navBackStackEntry.arguments?.getString("name")
            screenB({navController.navigate("ScreenC")},name = name.toString() )
        }
        composable("ScreenC")
        {
            screenC()
        }

    }

}