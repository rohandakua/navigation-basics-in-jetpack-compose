package com.example.demonavigation.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp


@Preview
@Composable
fun screenA(afun:(String)->Unit ={}) {

    var textValue by rememberSaveable {
        mutableStateOf("")
    }
    Box(modifier = Modifier.fillMaxSize()){
        Column(verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()) {
            Text(text = "this is screen A ", fontSize = 30.sp)
            TextField(value = textValue, onValueChange ={it->
                textValue=it} )
            Button(onClick = { afun(textValue) }, modifier = Modifier.align(Alignment.CenterHorizontally)
            ) {
                Text(text = "click  me to go to screen B")

            }
        }
    }

}