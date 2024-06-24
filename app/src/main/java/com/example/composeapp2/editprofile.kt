package com.example.composeapp2

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@Composable
fun editprofile(){
    var fieldcontroler by remember { mutableStateOf("") }
    TextField(value = fieldcontroler , onValueChange = {fieldcontroler = it}
        , modifier = Modifier
            .padding(7.dp)
            .border(3.dp, color = Color.Black)
            .fillMaxWidth()
    , placeholder = { Text(text = stringResource(id = R.string.txt_editprofile_entername))})
}