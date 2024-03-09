package com.example.kartuulangtahun

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.scaleIn
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kartuulangtahun.ui.theme.KartuUlangTahunTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KartuUlangTahunTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting(name = "15:33", from ="THU, 7 MAR")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, from: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bg_home)
    val image1 = painterResource(R.drawable.yt)
    val image2 = painterResource(R.drawable.gerab)
    val image3 = painterResource(R.drawable.google)
    val image4 = painterResource(R.drawable.gojek)
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Text(
            text = ".",
            color = Color.White,
            fontSize = 60.sp,
            lineHeight = 50.sp,
            modifier = modifier
                .padding(110.dp)
                .align(alignment = Alignment.BottomCenter)
        )
        Row(
            modifier = Modifier
                .align(alignment = Alignment.BottomCenter)
                .width(350.dp)
                .height(90.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Box(
                modifier = Modifier
                    .width(52.dp)
                    .height(52.dp)
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(16.dp)
                    ),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = image1,
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxSize()
                )
            }
            Box(
                modifier = Modifier
                    .width(52.dp)
                    .height(52.dp)
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(16.dp)
                    ),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = image2,
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxSize()
                )
            }
            Box(
                modifier = Modifier
                    .width(52.dp)
                    .height(52.dp)
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(16.dp)
                    ),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = image3,
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxSize()
                )
            }
            Box(
                modifier = Modifier
                    .width(52.dp)
                    .height(52.dp)
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(16.dp)
                    ),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = image4,
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxSize()
                )
            }
        }

        Box(
            modifier = Modifier
                .width(350.dp)
                .height(800.dp)
        ) {
            Column(
                modifier = modifier.padding(16.dp)
            ) {
                Spacer(modifier = Modifier.height(15.dp))
                Text(
                    text = "15:33",
                    color = Color.White,
                    fontSize = 60.sp,
                    lineHeight = 50.sp
                )
                Text(
                    text = from,
                    color = Color.White,
                    fontSize = 8.sp,
                    lineHeight = 5.sp,
                    modifier = modifier
                        .padding(0.dp)
                        .align(alignment = Alignment.CenterHorizontally)
                )
            }
        }
        Box(
            modifier = Modifier
                .width(350.dp)
                .height(200.dp)
                .background(
                    color = Color.White.copy(alpha = 0.8f),
                    shape = RoundedCornerShape(10.dp)
                ),
            contentAlignment = Alignment.BottomCenter
        ) {
            Column(modifier = Modifier
                .padding(0.dp)
                .width(320.dp)
                .height(180.dp)
            ) {
                Text(
                    text = "TUGAS SEMESTER 4#",
                    color = Color.Black,
                    fontSize = 18.sp,
                    lineHeight = 50.sp,
                    modifier = Modifier.padding(bottom = 6.dp)
                )
                Text(
                    text = "TAM vidio install android studio dan buat",
                    color = Color.Black,
                    fontSize = 14.sp,
                    lineHeight = 20.sp,
                    modifier = Modifier.padding(bottom = 1.dp)
                )
                Text(
                    text = "program lalu jalan kan di android",
                    color = Color.Black,
                    fontSize = 14.sp,
                    lineHeight = 20.sp
                )
                Text(
                    text = "22 Feb 2024",
                    color = Color.Black,
                    fontSize = 14.sp,
                    lineHeight = 20.sp,
                    modifier = Modifier
                        .align(alignment = Alignment.End)
                        .padding(45.dp)
                )
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KartuUlangTahunTheme {
        Greeting(name = "15:33", from ="THU, 7 MAR")
    }
}