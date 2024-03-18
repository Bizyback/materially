package com.bizyback.materially.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.tv.material3.ExperimentalTvMaterial3Api
import com.bizyback.materially.colors.LocalColorScheme
import com.bizyback.materially.colors.MateriallyColorScheme
import com.bizyback.materially.colors.largeLightColorScheme
import com.bizyback.materially.colors.smallLightColorScheme
import com.bizyback.materially.device.LocalDevice
import com.bizyback.materially.device.MateriallyDevice
import com.bizyback.materially.device.getMateriallyScreenSize
import com.bizyback.materially.padding.LocalPadding
import com.bizyback.materially.padding.MateriallyPadding
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
    padding: MateriallyPadding,
    typography: MateriallyTypography,
    colorScheme: MateriallyColorScheme,
    content: @Composable () -> Unit,
) {

    val device = getMateriallyScreenSize()

    CompositionLocalProvider(
        LocalDevice provides device,
        LocalShapes provides shapes,
        LocalTypography provides typography,
        LocalColorScheme provides colorScheme,
        LocalPadding provides padding
    ) {
        when (device) {
            MateriallyDevice.MOBILE -> {
                SmallMaterialTheme(
                    colorScheme = colorScheme.smallLightColorScheme(),
                    shapes = shapes.toSmallShapes(),
                    typography = typography.toSmallTypography(),
                    content = content
                )
            }

            MateriallyDevice.TELEVISION -> {
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