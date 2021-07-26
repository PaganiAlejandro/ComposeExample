package com.example.composefirstexample.homeRest

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composefirstexample.R
import com.example.composefirstexample.data.favoritesHome
import com.example.composefirstexample.data.storesListFinal

@Composable
fun createSectionsHome() {
    val storeList by lazy {
        storesListFinal
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        Image(
            painter = painterResource(id = R.drawable.tophome),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
        )
        createCarouselFavorites(favoritesHome)
        recyclerView_homeRest(storeList)
    }
}

@Preview(showBackground = true)
@Composable
fun previewHome() {
    createSectionsHome()
}