package com.example.demo1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.demo1.ui.theme.Demo1Theme
import com.example.demo1.ui.theme.component.OutlinedTextFieldWithTrailingIcon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.ui.text.input.PasswordVisualTransformation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Demo1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    DemoApp(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun DemoApp(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .background(Color(0xFFF8F9FE))
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Login",
            modifier = Modifier.padding(vertical = 16.dp),
            style = TextStyle(
                color = Color(0xFF495D92),
                fontSize = 40.sp
            )
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextFieldWithTrailingIcon(
            label = "Username",
            icon = Icons.Default.Email,
            contentDescription = "Email Icon"
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextFieldWithTrailingIcon(
            label = "Password",
            icon = Icons.Filled.Lock,
            contentDescription = "Lock Icon",
            visualTransformation = PasswordVisualTransformation()
        )
        Spacer(modifier = Modifier.height(24.dp))
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp),
            onClick = {  }
        ) {
            Text(text = "Submit")
        }
    }
}

