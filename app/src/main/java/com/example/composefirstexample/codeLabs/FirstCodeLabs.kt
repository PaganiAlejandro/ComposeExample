package com.example.composefirstexample.codeLabs

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
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
fun MyApp(content: @Composable () -> Unit) {
    ComposeFirstExampleTheme {
        Surface(color = MaterialTheme.colors.background) {
            content()
        }
    }
}

@Composable
fun Content(names: List<String> = listOf("1","2","3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15") ) {
    val counterState = remember { mutableStateOf(0) }

    Column(modifier = Modifier.fillMaxHeight()) {
        NamesList(names, Modifier.weight(1f))
        Counter(counterState.value,
            updateCount = { newCount ->
                counterState.value = newCount
            })
    }
}

@Composable
private fun NamesList(names: List<String>, modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier) {
        items(items = names) { name ->
            Greeting(name = name)
            Divider(color = MaterialTheme.colors.primaryVariant)
        }
    }
}

@Composable
fun Greeting(name: String) {
    var isSelectedMe by remember { mutableStateOf(false) }
    val backgroudColor by animateColorAsState(targetValue = if (isSelectedMe) Color.Cyan else Color.Transparent)

    Text(
        text = "Hello $name!",
        modifier = Modifier
            .padding(24.dp)
            .background(color = backgroudColor)
            .clickable(onClick = { isSelectedMe = !isSelectedMe }),
        style = MaterialTheme.typography.h4
    )
}

@Composable
fun Counter(count: Int, updateCount: (Int) -> Unit){
    Button (
        onClick = { updateCount(count+1)},
        Modifier.padding(start = 12.dp, end = 12.dp, top = 12.dp),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = if (count > 5) Color.Blue else Color.Cyan
        )
    ) {
        Text("He sido pulsado $count veces" )
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeFirstExampleTheme {
        MyApp {
            Content()
        }
    }
}
