package com.example.composeapp2

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

class maincontent {
    @Composable
    fun Imageprofile() {
        Spacer(modifier = Modifier.height(10.dp))
        Box (contentAlignment = Alignment.Center , modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)){
            Image(
                modifier = Modifier
                    .width(100.dp)
                    .height(150.dp),
                painter = (painterResource(id = R.drawable.profile_pic)),
                contentDescription = "profilepic"
            )
        }
    }
    @Composable
    fun Textname() {
        Spacer(modifier = Modifier.height(10.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(20.dp), contentAlignment = Alignment.Center
        ) {
            Text(text = "INVALID NAME")
        }
    }
    @Composable
    fun Buttons(navcontroler: NavController){
        Spacer(modifier = Modifier.height(10.dp))
        Box(modifier = Modifier
            .fillMaxWidth()
            .height(50.dp), contentAlignment = Alignment.Center){
            Row {
                Button(onClick = { navcontroler.navigate("editprofile") }) {
                    Text(text = stringResource(id = R.string.btn_main_editprofile))
                }
                Spacer(modifier = Modifier.width(20.dp))
                Button(onClick = { /*TODO*/ }) {
                    Text(text = stringResource(id = R.string.btn_main_viewwebsite))

                }

            }
        }
    }

    @Composable
    fun Texttitleskill(){
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = stringResource(id = R.string.txt_main_skilltitle)
            , fontWeight= FontWeight.Bold, modifier = Modifier.padding(10.dp) )
    }
    @Composable
    fun Checkbox(){
        val items = listOf(
            stringResource(id = R.string.txt_main_checkbox1) ,
            stringResource(id = R.string.txt_main_checkbox2) ,
            stringResource(id = R.string.txt_main_checkbox3)
        )
        val context = LocalContext.current
        val ischecked = remember {
            mutableStateListOf(false,false, false)
        }
        Column { items.forEachIndexed { index , item ->
            Row (verticalAlignment = Alignment.CenterVertically) {
                androidx.compose.material3.Checkbox(checked = ischecked[index] ,
                    onCheckedChange = {checked -> ischecked[index]= checked
                        Toast.makeText(context,item, Toast.LENGTH_SHORT).show() } )
                Text(text = item)
            }
        }

        }
    }
    @Composable
    fun texttitlecity(){
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = stringResource(id = R.string.txt_main_citytitle)
            , fontWeight= FontWeight.Bold, modifier = Modifier.padding(10.dp) )
    }

    @Composable
    fun radiobutton() {
        val context = LocalContext.current
        val items = listOf(
            stringResource(id = R.string.radio_main_radiobtn1),
            stringResource(id = R.string.radio_main_radiobtn2),
            stringResource(id = R.string.radio_main_radiobtn3)
        )
        var selectedOption by remember { mutableStateOf(items[0]) }
        Column {
            items.forEach { item ->
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    RadioButton(
                        selected = (item == selectedOption),
                        onClick = { selectedOption = item
                            Toast.makeText(context,item, Toast.LENGTH_SHORT).show()}
                    )
                    Text(text = item)
                }
            }


        }

    }}