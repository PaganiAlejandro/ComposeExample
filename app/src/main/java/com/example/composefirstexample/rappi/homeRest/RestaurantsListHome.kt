package com.example.composefirstexample.rappi.homeRest

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composefirstexample.rappi.data.storesListFinal
import com.example.composefirstexample.rappi.model.StoreModel


@Composable
fun recyclerViewHomeRest(storesHome: List<StoreModel>) {
    Column(
        modifier = Modifier
            .padding(top = 5.dp, bottom = 15.dp)
            .fillMaxWidth().fillMaxHeight()
    ) {
        LazyColumn(modifier = Modifier.fillMaxHeight().fillMaxWidth()) {
            items(storesHome.size) { index ->
                storeItem(storesHome.get(index))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun previewCard(){
    recyclerViewHomeRest(storesListFinal)
}