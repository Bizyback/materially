package com.bizyback.materially.ui.theme

import android.app.Activity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat
import com.bizyback.materially.MateriallyTheme

@Composable
fun DemoTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {

    val background = MateriallyTheme.colorScheme.background.toArgb()

    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = background
            window.navigationBarColor = background
            WindowCompat.getInsetsController(window, view).apply {
                isAppearanceLightStatusBars = darkTheme
                isAppearanceLightNavigationBars = darkTheme
            }
        }
    }

    MateriallyTheme(content = content)

}