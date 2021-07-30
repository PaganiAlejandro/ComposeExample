package com.example.composefirstexample.rappi.homeRest

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composefirstexample.R
import com.example.composefirstexample.rappi.data.favoritesHome
import com.example.composefirstexample.rappi.model.FavoritesModel

@Composable
fun itemFavorite(favorite: FavoritesModel){
    Column(Modifier.padding(6.dp)) {
        Image(
            painter = painterResource(favorite.img),
            contentDescription = null,
            modifier = Modifier
                .clip(RoundedCornerShape(20.dp))
                .width(80.dp)
                .height(80.dp)
        )
        Text(
            text = favorite.storeName,
            style = MaterialTheme.typography.body1,
            modifier = Modifier.padding(top = 5.dp),
            fontWeight = FontWeight.Bold,
            fontSize = 12.sp)
    }
}

@Composable
fun lazyRowFavorites(favorites: List<FavoritesModel>){
    LazyRow(
        Modifier
            .fillMaxWidth()
            .padding(top = 5.dp)) {
        items(favorites.size) { favorite ->
            itemFavorite(favorite = favorites.get(favorite))
        }
    }
}

@Composable
fun createCarouselFavorites(favorites: List<FavoritesModel>) {
    Column(
        modifier = Modifier
            .padding(top = 5.dp, start = 20.dp, end = 20.dp, bottom = 15.dp)
            .fillMaxWidth()
    ) {
        Text(
            text = "Mis Favoritos",
            style = MaterialTheme.typography.h5,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "PIDE EN SEGUNDOS",
            style = MaterialTheme.typography.body2,
            color = Color(R.color.disable_color),
            fontSize = 12.sp
        )
        lazyRowFavorites(favorites)
    }

}

@Composable
@Preview(showBackground = true)
fun previewFavorites(){
    createCarouselFavorites(favoritesHome)
}