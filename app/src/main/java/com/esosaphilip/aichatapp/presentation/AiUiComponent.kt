package com.esosaphilip.aichatapp.presentation

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.input.KeyboardCapitalization


@Composable
fun TextEnterField() {
    var userText by remember {mutableStateOf("")}
    OutlinedTextField(
        value = userText ,
        onValueChange = {userText = it},
        keyboardOptions = KeyboardOptions(
            capitalization = KeyboardCapitalization.Sentences,
        )
    )
}
@Composable
fun ButtonEnterField(){
        IconButton(onClick = { /*TODO*/ }) {
            Icon(Icons.Filled.Send, contentDescription = null)
        }

}
@Composable
fun AiOutputCard(aiString: String) {
    Card {
     Text(aiString)
    }

}

@Composable
fun UserInputCard(userString: String) {
    Card {
      Text(text = userString)
    }
}