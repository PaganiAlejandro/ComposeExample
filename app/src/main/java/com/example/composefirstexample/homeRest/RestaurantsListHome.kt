package com.example.composefirstexample.homeRest

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composefirstexample.data.storesListFinal
import com.example.composefirstexample.model.StoreModel


@Composable
fun recyclerView_homeRest(storesHome: List<StoreModel>) {

    val storesForRecycler = remember { storesHome }
    val state = rememberLazyListState()

    Column(
        modifier = Modifier
            .padding(top = 5.dp, bottom = 15.dp)
            .fillMaxWidth().fillMaxHeight()
    ) {
        LazyColumn(modifier = Modifier.fillMaxHeight().fillMaxWidth(), state = state) {
            items(storesForRecycler.size) { index ->
                storeItem(storesForRecycler.get(index))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun previewCard(){
    recyclerView_homeRest(storesListFinal)
}