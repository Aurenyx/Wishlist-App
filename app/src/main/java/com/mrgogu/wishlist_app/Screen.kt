package com.mrgogu.wishlist_app

sealed class Screen(val route : String) {
    object Homescreen: Screen("Home_Screen")
    object Addscreen: Screen("Add_Screen")
}