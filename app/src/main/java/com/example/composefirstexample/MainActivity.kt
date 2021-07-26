package com.example.composefirstexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.runtime.*
import com.example.composefirstexample.components.*
import com.example.composefirstexample.components.HelloContent3
import com.example.composefirstexample.homeRest.createSectionsHome
import com.example.composefirstexample.recycler.Content
import com.example.composefirstexample.recycler.MyApp

class MainActivity : ComponentActivity() {

   lateinit var viewModel: HelloViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            MyApp{
//                Content()
//            }

            createSectionsHome()

           // SimpleList()

          //  LazyList()

            //HelloScreen()

            //HelloScreen4(viewModel)
        }
    }
}