package com.example.composefirstexample.recycler

import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun LazyRowExample(names: List<String> = listOf("1","2","3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"), modifier: Modifier = Modifier) {
    LazyRow(modifier = modifier) {
        items(items = names) { name ->
            GreetingExample(name = name)
            Divider(color = MaterialTheme.colors.primaryVariant)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreviewRow() {
    LazyRowExample()
}