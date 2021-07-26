package com.example.jetexample.state

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview


/**
 * Esta clase describe como hacer recomposicion de un texto basado en el click
 * de un boton, en donde modificamos el texto cuando presionamos el boton
 */

@Composable
fun Counter() {
    val count = remember { mutableStateOf(0) }
    Button(onClick = { count.value++ }) {
        Text("I've been clicked ${count.value} times")
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewCounter(){
    Counter()
}



