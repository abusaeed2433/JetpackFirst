package com.example.jetpackfirst

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackfirst.ui.theme.JetpackFirstTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackFirstTheme {
                // A surface container using the 'background' color from the theme
                Surface {
                    //GreetingWithText(text = "Hello","Idiot")
                    GreetingImage(message = stringResource(id = R.string.hbd_sam), from = getString(R.string.from_ema), modifier = Modifier.fillMaxSize());
                }
            }
        }
    }
}

@Composable
fun GreetingWithText(text: String, text2: String,modifier: Modifier = Modifier){

    Column(modifier, verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = text, fontSize = 64.sp, color = Color.White,
            lineHeight = 150.sp)
        Text(
            text = text2, fontSize = 25.sp, color = Color.Black,
            modifier = Modifier.padding(32.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PracticePage(modifier: Modifier = Modifier){
    Box(
        modifier
            .fillMaxSize()
            .background(Color.White)) {
        Column {
            Image(
                painter = painterResource(id = R.drawable.bg_compose_background),
                contentDescription = null,
                contentScale = ContentScale.FillWidth,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(0.dp)
            )
            Text(
                text = stringResource(R.string.jetpack_compose_tutorial),
                Modifier.padding(24.dp),
                fontSize = 26.sp
            )
        }
    }
}

@Composable
fun GreetingImage(modifier: Modifier = Modifier,message: String = stringResource(id = R.string.hbd_sam),
                  from: String = stringResource(id = R.string.from_ema)){
//    val image = painterResource(id = R.drawable.dummy);
//    Image(
//        painter = image,
//        contentDescription = "Dummy image"
//    )

    Box(modifier) {
        Image(
            painter = painterResource(id = R.drawable.dummy),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            alpha = 0.5f,
            modifier = Modifier.fillMaxSize()
        )
        GreetingWithText(
            text = message,
            text2 = from,
            modifier = Modifier
                .fillMaxSize()
                .align(Alignment.Center)
        )
    }
}

//used for previewing in right side
//@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackFirstTheme {
        GreetingWithText("idiot","Hello")
    }
}
