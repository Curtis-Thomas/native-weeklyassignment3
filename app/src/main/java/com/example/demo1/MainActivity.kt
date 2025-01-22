package com.example.demo1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.demo1.ui.theme.Demo1Theme
import com.example.demo1.ui.theme.component.OutlinedTextFieldWithTrailingIcon

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Demo1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    DemoApp(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}



@Composable
fun DemoApp(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .padding(start = 8.dp, end = 8.dp)
            .background(Color(0xFFF8F9FE))
            .fillMaxSize()
    ) {
        Text(
            text = "Login",
            modifier = modifier
                .padding(8.dp)
                .align(Alignment.CenterHorizontally),
            style = TextStyle(
                color = Color(0xFF495D92),
                fontSize = 40.sp
            )

        )

        OutlinedTextFieldWithTrailingIcon("Username", Icons.Default.Email, "Person icon")
        OutlinedTextFieldWithTrailingIcon("Password", Icons.Filled.Lock)

        Button(
            modifier = modifier
                .fillMaxWidth(),

            onClick = {}
        ) {
            Text(text = "Submit")
        }




    }
}


@Preview(showBackground = true)
@Composable
fun TextFieldIconPreview() {
  DemoApp()
}