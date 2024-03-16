package com.bizyback.materially

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import com.bizyback.materially.colors.LocalColorScheme
import com.bizyback.materially.colors.MateriallyColorScheme
import com.bizyback.materially.colors.materiallyColorScheme
import com.bizyback.materially.screens.LocalScreen
import com.bizyback.materially.screens.MateriallyScreens
import com.bizyback.materially.screens.Screen
import com.bizyback.materially.screens.materiallyScreen
import com.bizyback.materially.shapes.LocalShapes
import com.bizyback.materially.shapes.MateriallyShapes
import com.bizyback.materially.shapes.materiallyShapes
import com.bizyback.materially.theme.ProvideMateriallyTheme
import com.bizyback.materially.typography.LocalTypography
import com.bizyback.materially.typography.MateriallyTypography
import com.bizyback.materially.typography.materiallyTypography

data object MateriallyTheme {

    val screen: Screen
        @Composable
        @ReadOnlyComposable
        get() = LocalScreen.current

    val shapes: MateriallyShapes
        @Composable
        @ReadOnlyComposable
        get() = LocalShapes.current

    val typography: MateriallyTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalTypography.current

    val colorScheme: MateriallyColorScheme
        @Composable
        @ReadOnlyComposable
        get() = LocalColorScheme.current

}

@Composable
fun MateriallyTheme(
    shapes: MateriallyShapes = materiallyShapes(),
    screen: MateriallyScreens = materiallyScreen(),
    typography: MateriallyTypography = materiallyTypography(),
    colorScheme: MateriallyColorScheme = materiallyColorScheme(),
    content: @Composable () -> Unit,
) {

    ProvideMateriallyTheme(
        shapes = shapes,
        screens = screen,
        typography = typography,
        colorScheme = colorScheme,
        content = content
    )

}