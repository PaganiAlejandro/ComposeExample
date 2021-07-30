package com.example.composefirstexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.example.composefirstexample.components.state.*
import com.example.composefirstexample.rappi.homeRest.createSectionsHome
import com.example.composefirstexample.rappi.viewModel.HomeViewModel
import com.example.composefirstexample.recycler.LazyColumExample
import com.example.composefirstexample.recycler.LazyRowExample
import com.example.jetexample.foundation.box.BoxExample
import com.example.jetexample.foundation.clickabletext.ClickableTextExample
import com.example.jetexample.foundation.textfield.TextFieldExample
import com.example.jetexample.material.bottomappbar.BottomBarNoFabExample
import com.example.jetexample.material.bottomappbar.BottomBarWithFabExample
import com.example.jetexample.material.cardview.CardViewExample
import com.example.jetexample.material.divider.DividerExample
import com.example.jetexample.material.slider.SliderExample
import com.example.jetexample.material.switch.SwitchExample
import com.example.jetexample.material.toolbar.ToolbarExample
import com.example.jetexample.state.CounterExample

class MainActivity : ComponentActivity() {

    val viewModelState by viewModels<HelloViewModel>()
    val viewModelHomeRappi by viewModels<HomeViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            // TODO Some components
            // BoxExample()
            // CardViewExample()
            // ClickableTextExample()
            // DividerExample()
            // LazyColumExample()
            // LazyRowExample()
            // ToolbarExample()
            // SwitchExample()
            // SliderExample()
            // BottomBarNoFabExample()
            // BottomBarWithFabExample()

            // TODO States
            // CounterExample()
            // HelloContent1()
            // HelloContent2()
            // HelloScreen()
            // HelloScreen2(viewModelState)

            // TODO Components with states
            // CheckBoxExample()
            // TextFieldExample()

            // TODO Home Restaurant Rappi
            // createSectionsHome()
        }
    }
}