package com.example.composeapp2

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class topbarmain {

    @Composable
    fun topbar(){
        Box(modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .shadow(2.dp)
            , contentAlignment = Alignment.CenterStart){
            Text(
                stringResource(id = R.string.txt_main_title)
                , fontSize = 15.sp
                ,color= Color.Black
                , fontWeight = FontWeight.Bold
                , modifier = Modifier.padding(5.dp)
            )

        }
    }
}