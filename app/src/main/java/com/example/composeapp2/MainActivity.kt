package com.example.composeapp2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.composeapp2.ui.theme.ComposeApp2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeApp2Theme {
                Scafold()


            }
        }
    }
}


@Composable
fun Arrange(navcontroller: NavController){
    val maincontent = maincontent()
    LazyColumn {
        item { maincontent.Imageprofile() }
        item { maincontent.Textname() }
        item { maincontent.Buttons(navcontroller)}
        item { maincontent.Texttitleskill()}
        item { maincontent.Checkbox() }
        item { maincontent.texttitlecity() }
        item { maincontent.radiobutton() }

    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Scafold() {
    val navcontroler = rememberNavController()
       val topbarmain = topbarmain()
    val bottombarmain = bottombarmain()
    Scaffold(
        topBar = {
            TopAppBar(title = { topbarmain.topbar() })

        },
        bottomBar = {
            BottomAppBar { bottombarmain.bottombar() }
        },
        content = { paddingValues ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues)
            ) {
                NavHost(navController = navcontroler, startDestination = "Mainactivity") {
                    composable("editprofile"){
                        editprofile()}
                    composable("Mainactivity" ){
                        Arrange(navcontroler)   }
                }
            }
        }

    )

}