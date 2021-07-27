package com.example.composefirstexample.recycler

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composefirstexample.R
import com.example.composefirstexample.ui.theme.ComposeFirstExampleTheme
@Composable
private fun NamesListExampleRow(names: List<String> = listOf("1","2","3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"), modifier: Modifier = Modifier) {
    LazyRow(modifier = modifier) {
        items(items = names) { name ->
            GreetingExampleRow(name = name)
            Divider(color = MaterialTheme.colors.primaryVariant)
        }
    }
}

@Composable
fun GreetingExampleRow(name: String) {
    Text(
        text = "Hello $name!",
        modifier = Modifier
            .padding(24.dp),
        style = MaterialTheme.typography.h4
    )
}


@Preview(showBackground = true)
@Composable
fun DefaultPreviewRow() {
    NamesListExampleRow()
}