package com.example.composefirstexample.components.button

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun allButtons() {
    Column {
        Text(text = "Buttons", style = typography.h5, modifier = Modifier.padding(8.dp))

        Row {
            Button(onClick = {}, modifier = Modifier.padding(8.dp)) {
                Text(text = "Main Button")
            }

            TextButton(onClick = { /*TODO*/ }, modifier = Modifier.padding(8.dp)) {
                Text(text = "Text Button")
            }
        }

        Row {
            // Elevated Button
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier.padding(8.dp),
                elevation = ButtonDefaults.elevation()
            ) {
                Text(text = "Elevated Button")
            }

            // Rounded Button
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier.padding(8.dp),
                shape = RoundedCornerShape(20.dp)
            ) {
                Text(text = "Rounded")
            }
        }

        Row {
            // Outlined Button
            // add border field and set BorderStroke and its color
            OutlinedButton(
                onClick = { /*TODO*/ },
                border = BorderStroke(1.dp, Color.Red),
                modifier = Modifier.padding(8.dp)
            ) {
                Text(text = "Outlined")
            }

            // Outlined Button with icon
            // add border field and set BorderStroke and its color
            // add Icon field
            OutlinedButton(
                onClick = { /*TODO*/ },
                border = BorderStroke(1.dp, Color.Red),
                modifier = Modifier.padding(8.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.FavoriteBorder,
                    contentDescription = null,
                    modifier = Modifier.padding(end = 4.dp)
                )
                Text(text = "Outlined Icon")
            }

        }

        Row {
            // Icon Button
            // Icon on the left of text
            Button(onClick = {}, modifier = Modifier.padding(8.dp)) {
                Row {
                    Icon(
                        imageVector = Icons.Default.FavoriteBorder,
                        contentDescription = null,
                        modifier = Modifier.padding(end = 6.dp, start = 6.dp)
                    )
                    Text(text = "Icon Button")
                    Icon(
                        imageVector = Icons.Default.FavoriteBorder,
                        contentDescription = null,
                        modifier = Modifier.padding(start = 6.dp, end = 6.dp)
                    )
                }
            }

            // Icon Button
            // Icon on the Right of text
            Button(onClick = {}, modifier = Modifier.padding(8.dp)) {
                Text(text = "Icon Button")
                Icon(
                    imageVector = Icons.Default.FavoriteBorder,
                    contentDescription = null,
                    modifier = Modifier.padding(start = 4.dp)
                )
            }
        }

        //custom background buttons
        // create a variable mainButtonColor and define background Color and content Color
        val mainButtonColor = ButtonDefaults.buttonColors(
            backgroundColor = Color.Magenta,
            contentColor = MaterialTheme.colors.surface
        )

        Row {
            Button(colors = mainButtonColor, onClick = {}, modifier = Modifier.padding(8.dp)) {
                Text(text = "Custom colors")
            }
        }

        Row {
            // Create variable horizontalGradient and inside color property define start and end color
            val horizontalGradient = Brush.horizontalGradient(
                colors = listOf(MaterialTheme.colors.primary, MaterialTheme.colors.primaryVariant),
                0f,
                250f
            )
            // Horizontal gradient Button
            // Create a text and set its background to horizontalGradient that we created above
            Text(
                text = "Horizontal gradient",
                style = typography.body2.copy(color = Color.White),
                modifier = Modifier
                    .padding(12.dp)
                    .clickable(onClick = {})
                    .clip(RoundedCornerShape(4.dp))
                    .background(brush = horizontalGradient)
                    .padding(12.dp)
            )

            // Create variable verticalGradient and inside color property define top and bottom color
            val verticalGradient = Brush.verticalGradient(
                colors = listOf(MaterialTheme.colors.primary, MaterialTheme.colors.primaryVariant),
                startY = 0f,
                endY = 100f
            )
            // Vertical gradient Button
            // Create a text and set its background to verticalGradient that we created above
            Text(
                text = "Vertical gradient",
                style = typography.body1.copy(color = Color.White),
                modifier = Modifier
                    .padding(12.dp)
                    .clickable(onClick = {})
                    .clip(RoundedCornerShape(4.dp))
                    .background(brush = verticalGradient)
                    .padding(12.dp)
            )
        }
    }
}

@Preview
@Composable
fun DefaultPreview() {
    allButtons()
}