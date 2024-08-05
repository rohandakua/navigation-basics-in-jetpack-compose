package com.example.demonavigation.screens


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun screenB(afun:()->Unit ={},name : String = "no name") {
    Box(modifier = Modifier.fillMaxSize()){
        Column(verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()) {
            Text(text = "this is screen B ")
            Spacer(modifier = Modifier.size(20.dp))
            Text(text = name,
                modifier = Modifier.background(color = Color.Magenta))

            Spacer(modifier = Modifier.size(20.dp))
            Button(onClick = afun, modifier = Modifier.align(Alignment.CenterHorizontally)
            ) {
                Text(text = "click  me to go to screen C")

            }
        }
    }

}