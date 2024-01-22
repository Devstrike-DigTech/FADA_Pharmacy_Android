/*
 * Copyright (c) 2024.
 * Richard Uzor
 * Under the Authority of
 * Devstrike Digital Limited
 */

package com.thefadaapp.fadapharmacy.navigation

sealed class Screen(val route: String){
    object Welcome: Screen(route = "welcome_screen")
    object Home: Screen(route = "home_screen")
}
