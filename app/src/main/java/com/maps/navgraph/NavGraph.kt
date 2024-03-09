package com.maps.navgraph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.kora.route.RouteScreen
import com.maps.home.HomeMap


@Composable
fun NavGraphOfPage(
    navController: NavHostController
) {
    NavHost(navController = navController, startDestination = RouteScreen.HOME_PAGE) {
        this.composable(route = RouteScreen.HOME_PAGE) {
            HomeMap()
        }
    }
}