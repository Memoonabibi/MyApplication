package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyProfile()
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MyProfile() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .padding(13.dp)
            .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = R.drawable.untitled_design),
            contentDescription = "Profile Picture",
            modifier = Modifier
                .clip(CircleShape)
                .size(84.dp)
        )
        Spacer(
            modifier = Modifier.height(13.dp)
        )
        Text(
            text = "Memoona Bibi",
            fontWeight = FontWeight.Bold,
            fontSize = 35.sp
        )
        Spacer(
            modifier = Modifier.size(13.dp)
        )
        Text(
            text = "Aspiring Android developer with a passion for creating engaging mobile applications.",
            fontSize = 22.sp
        )
    }
}
