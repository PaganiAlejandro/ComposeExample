package com.example.composefirstexample.components.state

import androidx.activity.viewModels
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

// Without state ------------------------------------------------------

@Composable
fun HelloContent1() {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(
            text = "Hello",
            modifier = Modifier.padding(bottom = 8.dp),
            style = MaterialTheme.typography.h5
        )
        OutlinedTextField(
            value = "",
            onValueChange = { },
            label = { Text("Name") }
        )
    }
}


// With remember state ------------------------------------------------------

@Composable
fun HelloContent2() {
    Column(modifier = Modifier.padding(16.dp)) {
        var name by remember { mutableStateOf("") }
        if (name.isNotEmpty()) {
            Text(
                text = "Hello, $name!",
                modifier = Modifier.padding(bottom = 8.dp),
                style = MaterialTheme.typography.h5
            )
        }
        OutlinedTextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("Name") }
        )
    }
}


// With rememberSaveable and raising the status ----------------------------

@Composable
fun HelloScreen() {
    var name by rememberSaveable { mutableStateOf("") }
    HelloContent3(name = name, onNameChange = { name = it })
}

@Composable
fun HelloContent3(name: String, onNameChange: (String) -> Unit) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(
            text = "Hello, $name",
            modifier = Modifier.padding(bottom = 8.dp),
            style = MaterialTheme.typography.h5
        )
        OutlinedTextField(
            value = name,
            onValueChange = onNameChange,
            label = { Text("Name") }
        )
    }
}


//With rememberSaveable and raising the status to the viewModel -------------

class HelloViewModel : ViewModel() {

    private val _name = MutableLiveData("")
    val name: LiveData<String> = _name

    fun onNameChange(newName: String) {
        _name.value = newName
    }
}

@Composable
fun HelloScreen2(helloViewModel: HelloViewModel) {
    val name: String by helloViewModel.name.observeAsState("")
    HelloContent4(name = name, onNameChange = { helloViewModel.onNameChange(it) })
}

@Composable
fun HelloContent4(name: String, onNameChange: (String) -> Unit) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(
            text = "Hello, $name",
            modifier = Modifier.padding(bottom = 8.dp),
            style = MaterialTheme.typography.h5
        )
        OutlinedTextField(
            value = name,
            onValueChange = onNameChange,
            label = { Text("Name") }
        )
    }
}


@Preview
@Composable
fun previewStatesExample(){
    HelloContent1()
}

@Preview
@Composable
fun previewStatesExample2(){
    HelloContent2()

}

@Preview
@Composable
fun previewStatesExample3(){
    HelloScreen()
}
