package com.example.jetexample.material.divider

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

/**
 * Un fino divisor que agrupa el contenido en una lista y layouts
 */

@Composable
fun DividerDemo(){
    Column {
        Text(text = "One")
        Divider()
        Text(text = "Two")
        Divider()
        Text(text = "Three")
        Divider()
    }
}


@Preview(showBackground = true)
@Composable
private fun DividerDemoPreview(){
    DividerDemo()
}