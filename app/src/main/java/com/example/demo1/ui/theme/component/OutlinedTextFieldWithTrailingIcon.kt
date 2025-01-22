package com.example.demo1.ui.theme.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector

@Composable
fun OutlinedTextFieldWithTrailingIcon(label: String, icon: ImageVector, contentDescription: String = ""){

    OutlinedTextField(
        value="",
        onValueChange = {},
        label = { Text(
            label
        ) },
        modifier = Modifier.fillMaxWidth(),
        trailingIcon = {
            IconButton(onClick = {}) {
                Icon(icon, contentDescription = contentDescription)
            }
        }
    )
}