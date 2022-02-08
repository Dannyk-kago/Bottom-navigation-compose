package com.example.bottomnavcompose


sealed class BottomBarScreen (
    var route:String,
    var title:String,
    var icon: Int
) {
    object Home : BottomBarScreen(
        route = "home",
        title = "Home",
        icon = R.drawable.ic_home
    )

    object Search : BottomBarScreen(
        route = "search",
        title = "Search",
        icon = R.drawable.ic_search
    )

    object Post : BottomBarScreen(
        route = "post",
        title = "Post",
        icon = R.drawable.ic_baseline_add_box
    )

    object Favorite : BottomBarScreen(
        route = "favorite",
        title = "Favorite",
        icon = R.drawable.ic_favorite
    )

    object Profile : BottomBarScreen(
        route = "profile",
        title = "Profile",
        icon = R.drawable.ic_person
    )

}
