package com.example.composefirstexample.homeRest

import android.icu.text.CaseMap
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.example.composefirstexample.R

@Composable
fun tagPromotions(promotions: String) {
    Row(modifier = Modifier.padding(top = 5.dp, bottom = 5.dp)) {
        Image(
            painter = painterResource(id = R.drawable.ic_promotions),
            modifier = Modifier
                .width(20.dp)
                .height(20.dp)
                .padding(end = 5.dp), colorFilter = ColorFilter.tint(Color.Blue), contentDescription = null
        )
        Text(text = promotions.toUpperCase(), color = Color.Blue)
    }
}

@Composable
@Preview(showBackground = true)
fun tagPromotionsPreview(){
    tagPromotions("Envio Gratis")
}