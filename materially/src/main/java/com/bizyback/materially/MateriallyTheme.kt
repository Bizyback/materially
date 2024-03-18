package com.bizyback.materially

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import com.bizyback.materially.colors.LocalColorScheme
import com.bizyback.materially.colors.MateriallyColorScheme
import com.bizyback.materially.colors.materiallyColorScheme
import com.bizyback.materially.device.LocalDevice
import com.bizyback.materially.device.MateriallyDevice
import com.bizyback.materially.padding.LocalPadding
import com.bizyback.materially.padding.MateriallyPadding
import com.bizyback.materially.padding.materiallyPadding
import com.bizyback.materially.shapes.LocalShapes
import com.bizyback.materially.shapes.MateriallyShapes
import com.bizyback.materially.shapes.materiallyShapes
import com.bizyback.materially.theme.ProvideMateriallyTheme
import com.bizyback.materially.typography.LocalTypography
import com.bizyback.materially.typography.MateriallyTypography
import com.bizyback.materially.typography.materiallyTypography

data object MateriallyTheme {

    val device: MateriallyDevice
        @Composable
        @ReadOnlyComposable
        get() = LocalDevice.current

    val shapes: MateriallyShapes
        @Composable
        @ReadOnlyComposable
        get() = LocalShapes.current

    val typography: MateriallyTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalTypography.current

    val padding: MateriallyPadding
        @Composable
        @ReadOnlyComposable
        get() = LocalPadding.current

    val colorScheme: MateriallyColorScheme
        @Composable
        @ReadOnlyComposable
        get() = LocalColorScheme.current

}

@Composable
fun MateriallyTheme(
    shapes: MateriallyShapes = materiallyShapes(),
    padding: MateriallyPadding = materiallyPadding(),
    typography: MateriallyTypography = materiallyTypography(),
    colorScheme: MateriallyColorScheme = materiallyColorScheme(),
    content: @Composable () -> Unit,
) {

    ProvideMateriallyTheme(
        shapes = shapes,
        content = content,
        padding = padding,
        typography = typography,
        colorScheme = colorScheme,
    )

}