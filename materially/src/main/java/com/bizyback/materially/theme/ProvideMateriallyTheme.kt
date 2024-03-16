package com.bizyback.materially.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.tv.material3.ExperimentalTvMaterial3Api
import com.bizyback.materially.colors.LocalColorScheme
import com.bizyback.materially.colors.MateriallyColorScheme
import com.bizyback.materially.colors.largeLightColorScheme
import com.bizyback.materially.colors.smallLightColorScheme
import com.bizyback.materially.screens.LocalScreen
import com.bizyback.materially.screens.MateriallyScreens
import com.bizyback.materially.screens.Screen
import com.bizyback.materially.screens.getMateriallyScreenSize
import com.bizyback.materially.shapes.LocalShapes
import com.bizyback.materially.shapes.MateriallyShapes
import com.bizyback.materially.shapes.toLargeShapes
import com.bizyback.materially.shapes.toSmallShapes
import com.bizyback.materially.typography.LocalTypography
import com.bizyback.materially.typography.MateriallyTypography
import com.bizyback.materially.typography.toLargeTypography
import com.bizyback.materially.typography.toSmallTypography
import androidx.compose.material3.MaterialTheme as SmallMaterialTheme
import androidx.tv.material3.MaterialTheme as LargeMaterialTheme

@OptIn(ExperimentalTvMaterial3Api::class)
@Composable
internal fun ProvideMateriallyTheme(
    shapes: MateriallyShapes,
    screens: MateriallyScreens,
    typography: MateriallyTypography,
    colorScheme: MateriallyColorScheme,
    content: @Composable () -> Unit,
) {

    val screen = getMateriallyScreenSize(screens = screens)

    CompositionLocalProvider(
        LocalScreen provides screen,
        LocalShapes provides shapes,
        LocalTypography provides typography,
        LocalColorScheme provides colorScheme
    ) {
        when (screen) {
            Screen.SM,
            Screen.MD -> {
                SmallMaterialTheme(
                    colorScheme = colorScheme.smallLightColorScheme(),
                    shapes = shapes.toSmallShapes(),
                    typography = typography.toSmallTypography(),
                    content = content
                )
            }

            Screen.LG,
            Screen.XL,
            Screen.XXL -> {
                LargeMaterialTheme(
                    colorScheme = colorScheme.largeLightColorScheme(),
                    shapes = shapes.toLargeShapes(),
                    typography = typography.toLargeTypography(),
                    content = content
                )

            }
        }
    }

}