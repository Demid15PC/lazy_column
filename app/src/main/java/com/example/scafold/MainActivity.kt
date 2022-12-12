package com.example.scafold

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.scafold.ui.theme.ScafoldTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val fontFamily = FontFamily(
                Font(R.font.unbounded_regular, FontWeight.Normal),
                Font(R.font.unbounded_light, FontWeight.Light),
                Font(R.font.unbounded_extralight, FontWeight.ExtraLight),
                Font(R.font.unbounded_black, FontWeight.Black),
                Font(R.font.unbounded_medium, FontWeight.Medium),
                Font(R.font.unbounded_bold, FontWeight.Bold),
                Font(R.font.unbounded_extrabold, FontWeight.ExtraBold),
                Font(R.font.unbounded_semibold, FontWeight.SemiBold),
            )

            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                items(5000){
                    Text(
                        modifier = Modifier.padding(vertical = 15.dp),
                        text = "item $it",
                        fontFamily = fontFamily,
                        fontWeight = FontWeight.Medium,
                        fontSize = 25.sp,
                        color = Color.DarkGray
                    )
                }
            }
        }
    }
}