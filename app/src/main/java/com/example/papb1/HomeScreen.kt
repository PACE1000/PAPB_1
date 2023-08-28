package com.example.papb1

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.papb1.ui.theme.PAPB1Theme
import com.example.papb1.ui.theme.Purple40

@Composable
fun HomeScreen(){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp)
    ) {
        Text(text = "Arya Bramaputra \n 21060120120033 \n Pengembangan Aplikasi Perangkat Bergerak",
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center)

        Spacer(modifier = Modifier.height(15.dp))

        Icon(imageVector = Icons.Default.Person,
            contentDescription ="Person",
            tint = Color.Black,
            modifier = Modifier.size(75.dp))

        Spacer(modifier = Modifier.height(15.dp))

        Button(onClick = {}) {
            Text(text = "Enter", color = Color.White)
        }

        Row {
           Box(modifier = Modifier
               .clip(CircleShape)
               .size(50.dp)
               .background(Purple40)){
           }
            Box(modifier = Modifier
                .clip(RoundedCornerShape(0.dp))
                .background(Color.Green)
                .size(50.dp),
                contentAlignment = Alignment.Center){
            }
        }
}
}


@Preview(showBackground = true)
@Composable
fun PreviewHomeScreen(){
    PAPB1Theme {
        HomeScreen()
    }
}