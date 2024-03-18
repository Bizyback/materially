package com.bizyback.materially

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.bizyback.materially.components.atoms.Button
import com.bizyback.materially.components.atoms.Text
import com.bizyback.materially.components.molecules.Scaffold
import com.bizyback.materially.ui.theme.DemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DemoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(
                        modifier = Modifier
                            .padding(innerPadding)
                            .fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Greeting(
                            name = "Materially",
                            modifier = Modifier
                        )

                        Button(
                            modifier = Modifier.padding(top = MateriallyTheme.padding.eight),
                            onClick = {
                                Toast.makeText(this@MainActivity, "Clicked", Toast.LENGTH_SHORT)
                                    .show()
                            },
                            onLongClick = {
                                Toast.makeText(this@MainActivity, "Long Clicked", Toast.LENGTH_LONG)
                                    .show()
                            }
                        ) {
                            Text(text = "click")
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "$name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DemoTheme {
        Greeting("Android")
    }
}