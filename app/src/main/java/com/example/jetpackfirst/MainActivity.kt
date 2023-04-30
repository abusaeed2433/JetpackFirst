package com.example.jetpackfirst

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackfirst.ui.theme.JetpackFirstTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackFirstTheme {
                // A surface container using the 'background' color from the theme
                Surface {
                    GreetingWithText(text = "Hello","Idiot")
                }
            }
        }
    }
}

@Composable
fun GreetingWithText(text: String, text2: String){
    Row {
        Text(text = text, fontSize = 24.sp)
        Text(text = text2, fontSize = 24.sp)
    }
}


//used for previewing in right side
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackFirstTheme {
        GreetingWithText("idiot","Hellow")
    }
}