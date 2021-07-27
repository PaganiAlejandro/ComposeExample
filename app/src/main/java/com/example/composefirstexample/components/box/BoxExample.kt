package com.example.jetexample.foundation.box


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composefirstexample.ui.theme.ComposeFirstExampleTheme

/**
 * Box es usado como un contenedor para sus hijos, con este container podemos definir width y height
 * de sus hijos composables como así tambien tu gravity.
 * Por defecto [Box] acepta multiple hijos y los alinea con un [ColumnScope]
 */

@Composable
fun BoxExample(){
    Box(modifier = Modifier.fillMaxSize(),contentAlignment = Alignment.Center){
        ComposeFirstExampleTheme(true, { Unit })
        CircularProgressIndicator()
        Text(text = "Will this ever finish ?",modifier = Modifier.padding(top = 8.dp))
    }
}

@Preview(showBackground = true)
@Composable
private fun BoxDemoPreview(){
    BoxExample()
}


