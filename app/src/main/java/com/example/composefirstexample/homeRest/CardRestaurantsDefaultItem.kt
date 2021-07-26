package com.example.composefirstexample.homeRest

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composefirstexample.R
import com.example.composefirstexample.model.StoreModel

@Composable
fun storeItem(store: StoreModel) {
    val storeState = remember { mutableStateOf(store) }

    Column(modifier = Modifier
        .padding(10.dp)
        .fillMaxWidth()) {
        Row(modifier = Modifier.padding(8.dp).fillMaxWidth()) {
            Image(
                painter = painterResource(storeState.value.img),
                modifier = Modifier
                    .width(100.dp)
                    .height(100.dp)
                    .clip(RoundedCornerShape(20.dp)),
                contentDescription = null,
            )
            Column(Modifier.padding(start = 10.dp)) {
                Text(text = storeState.value.storeName, style = MaterialTheme.typography.h6)
                Text(text = storeState.value.tags, color = Color(R.color.disable_color), fontSize = 12.sp, modifier = Modifier.padding(top = 10.dp))
                lineEta(eta = storeState.value.eta, shippingCost = storeState.value.shippingCost, rating = storeState.value.rating)
                tagPromotions("Envio Gratis")
            }
        }
        Divider(modifier = Modifier.padding(top = 10.dp))
    }
}

@Composable
@Preview(showBackground = true)
fun defaultPreview(){
    storeItem(store = StoreModel("El corral Gourmet", "Hamburguesas", "15 - 30 min", "$2500", "4.6", R.drawable.home))
}

