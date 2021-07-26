package com.example.composefirstexample.homeRest

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composefirstexample.R


@Composable
fun drawBundle() {
    Image(
        painter = painterResource(id = R.drawable.ic_bullets),
        modifier = Modifier
            .padding(top = 6.dp, start = 5.dp, end = 5.dp)
            .width(6.dp)
            .height(6.dp),
        alignment = Alignment.Center,
        contentDescription = null
    )
}

@Composable
fun createRating(rating: String) {
    Row(modifier = Modifier.padding(start = 3.dp)) {
        drawBundle()
        Image(
            painter = painterResource(id = R.drawable.ic_stars), modifier = Modifier
                .wrapContentWidth()
                .wrapContentHeight()
                .padding(top = 2.dp), contentDescription = null
        )
        Text(text = rating, color = Color(R.color.disable_color))
    }
}

@Composable
fun lineEta(eta: String, shippingCost: String, rating: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 5.dp, bottom = 5.dp)
    ) {
        Text(
            text = eta,
            color = Color(R.color.disable_color)
        )
        drawBundle()
        Text(
            text = shippingCost,
            color = Color(
                R.color.disable_color
            )
        )
        createRating(rating)
    }
}

@Composable
@Preview(showBackground = true)
fun previewView() {
    lineEta("25 - 44 min", "$1500", "4.5")
}