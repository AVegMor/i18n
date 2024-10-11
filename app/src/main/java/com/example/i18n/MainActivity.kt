package com.example.i18n

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.pluralStringResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.i18n.ui.theme.I18nTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            I18nTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column (verticalArrangement = Arrangement.SpaceAround){
        Text(
            text = stringResource(R.string.hello_world),
            modifier = modifier
        )

        Text(
            text = pluralStringResource(R.plurals.elements, 1, 1),
            modifier = modifier
        )
        Text(
            text = pluralStringResource(R.plurals.elements, 3, 3),
            modifier = modifier
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    I18nTheme {
        Greeting("Android")
    }
}

@Preview(showBackground = true, locale = "es")
@Composable
fun GreetingPreview2() {
    I18nTheme {
        Greeting("Android")
    }
}
























