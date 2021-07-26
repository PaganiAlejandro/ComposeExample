package com.example.composefirstexample.data

import com.example.composefirstexample.R
import com.example.composefirstexample.model.FavoritesModel
import com.example.composefirstexample.model.StoreModel

val storesListFinal = mutableListOf(
    StoreModel(
        "McDonald",
        "Hamburguesas",
        "28 - 43 min",
        "$1500",
        "4.5",
        R.drawable.home
    ),
    StoreModel(
        "El corral Gourmet",
        "Hamburguesas",
        "15 - 30 min",
        "$2500",
        "4.1",
        R.drawable.gourmet
    ),
    StoreModel(
        "Pan Pa ya",
        "Pizza",
        "30 min",
        "$4500",
        "3.9",
        R.drawable.copa
    ),
    StoreModel(
        "Di Lucca To Go",
        "Pizza",
        "29 - 44 min",
        "$0",
        "4.3",
        R.drawable.ellegado
    )
)


val favoritesHome = mutableListOf(
    FavoritesModel("McDonald", R.drawable.home),
    FavoritesModel("Oma Cafe", R.drawable.copa),
    FavoritesModel("El kiosco", R.drawable.cafe),
    FavoritesModel("Pan pa ya", R.drawable.ellegado),
    FavoritesModel("Starbucks", R.drawable.gourmet),
    FavoritesModel("McDonald", R.drawable.home),
    FavoritesModel("Oma Cafe", R.drawable.copa),
    FavoritesModel("El kiosco", R.drawable.cafe),
    FavoritesModel("Pan pa ya", R.drawable.ellegado),
    FavoritesModel("Starbucks", R.drawable.gourmet),
    FavoritesModel("McDonald", R.drawable.home),
    FavoritesModel("Oma Cafe", R.drawable.copa),
    FavoritesModel("El kiosco", R.drawable.cafe),
    FavoritesModel("Pan pa ya", R.drawable.ellegado),
    FavoritesModel("Starbucks", R.drawable.gourmet),
    FavoritesModel("McDonald", R.drawable.home),
    FavoritesModel("Oma Cafe", R.drawable.copa),
    FavoritesModel("El kiosco", R.drawable.cafe),
    FavoritesModel("Pan pa ya", R.drawable.ellegado),
    FavoritesModel("Starbucks", R.drawable.gourmet)
)
