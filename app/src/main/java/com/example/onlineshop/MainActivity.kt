package com.example.onlineshop

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment

class MainActivity : ComponentActivity() {

    var navHostFragment: NavHostFragment? = null
    var navController: NavController? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            Column(modifier = Modifier.fillMaxSize()) {
                Button(modifier = Modifier.fillMaxWidth(), onClick = { println("This is click!!!") }) {
                    Text(text = "Base Button!!!!")
                }
            }

        }

/*        setContentView(R.layout.activity_main)

        navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment?.navController*/
    }

    fun openSecondPage() {
        navController?.navigate(R.id.blankFragment2)
    }



}