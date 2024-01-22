/*
 * Copyright (c) 2024.
 * Richard Uzor
 * Under the Authority of
 * Devstrike Digital Limited
 */

package com.thefadaapp.fadapharmacy.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.thefadaapp.fadapharmacy.screen.HomeScreen
import com.thefadaapp.fadapharmacy.screen.WelcomeScreen

@Composable
fun SetupNavGraph(
    navController: NavHostController,
    startDestination: String
) {
    NavHost(navController = navController, startDestination = startDestination){
        composable(route = Screen.Welcome.route){
            WelcomeScreen(navController = navController)
        }
        composable(route = Screen.Home.route){
            HomeScreen()
        }
    }
}