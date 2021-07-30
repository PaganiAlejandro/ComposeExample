package com.example.composefirstexample.rappi.model

data class StoreModel(
    val storeName: String,
    val tags: String,
    val eta: String,
    val shippingCost: String,
    val rating: String,
    val img: Int
)