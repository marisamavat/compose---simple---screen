package com.example.composeapp2

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

    class bottombarmain {
        @Composable
        fun bottombar(){
            Button(onClick = {  } ,
                Modifier
                    .fillMaxWidth()
                    .height(50.dp)){
                Text(
                    stringResource(id = R.string.btn_main_saveinformation),
                    color = Color.Black)

            }

        }
    }