package com.example.jetexample.material.switch

import androidx.compose.material.Switch
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.composefirstexample.util.showMessage

/**
 * [ES]
 * Un switch es un accionable de dos estados, provee una funcionalidad on/off
 */

@Composable
fun SwitchExample() {
        val context = LocalContext.current
        val checkedState = remember { mutableStateOf(false) }
        Switch(
            checked = checkedState.value,
            onCheckedChange = {
                    checkedState.value = it
                    if(checkedState.value) showMessage(context,"Checked") else showMessage(context,"Unchecked")
            }
        )
}

@Preview(showBackground = true)
@Composable
private fun SwitchPreview(){
        SwitchExample()
}