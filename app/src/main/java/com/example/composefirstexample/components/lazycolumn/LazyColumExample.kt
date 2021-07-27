package com.example.composefirstexample.recycler

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
private fun NamesListExample(names: List<String> = listOf("1","2","3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"), modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier) {
        items(items = names) { name ->
            GreetingExample(name = name)
            Divider(color = MaterialTheme.colors.primaryVariant)
        }
    }
}

@Composable
fun GreetingExample(name: String) {
    Text(
        text = "Hello $name!",
        modifier = Modifier
            .padding(24.dp),
        style = MaterialTheme.typography.h4
    )
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    NamesListExample()
}
