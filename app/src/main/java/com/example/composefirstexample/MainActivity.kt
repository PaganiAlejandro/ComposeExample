package com.example.composefirstexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*

class MainActivity : ComponentActivity() {

   //lateinit var viewModel: HelloViewModel

    @ExperimentalMaterialApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            MyApp{
//                Content()
//            }

            //createSectionsHome()


           // SimpleList()

          //  LazyList()

            //HelloScreen()

            //HelloScreen4(viewModel)
        }
    }
}