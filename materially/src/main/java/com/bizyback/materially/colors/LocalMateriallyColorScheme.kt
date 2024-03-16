package com.bizyback.materially.colors

import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Color

/**
 * project : Materially
 * date    : Sunday 17/03/2024
 * user    : mambo
 * email   : mambobryan@gmail.com
 */
// <editor-fold desc="background">
internal val BaseBackground = Color(0xFFF5F5F5)
internal val BaseOnBackground = Color(0xFF141414)
// </editor-fold>

// <editor-fold desc="surface">
internal val BaseSurface = Color(0xFFFFFFFF)
internal val BaseOnSurface = Color(0xFF000000)
// </editor-fold>

// <editor-fold desc="primary">
internal val BasePrimary = Color(0xFF93E5AB)
internal val BaseOnPrimary = Color(0xFF000000)
// </editor-fold>

fun materiallyColorScheme(
    primary: Color = BasePrimary,
    onPrimary: Color = BaseOnPrimary,
    secondary: Color = BaseSurface,
    onSecondary: Color = BaseOnSurface,
    tertiary: Color = BaseSurface,
    onTertiary: Color = BaseOnSurface,
    background: Color = BaseBackground,
    onBackground: Color = BaseOnBackground,
    surface: Color = BaseSurface,
    onSurface: Color = BaseOnSurface,
): MateriallyColorScheme = MateriallyColorScheme(
    primary = primary,
    onPrimary = onPrimary,
    secondary = secondary,
    onSecondary = onSecondary,
    tertiary = tertiary,
    onTertiary = onTertiary,
    background = background,
    onBackground = onBackground,
    surface = surface,
    onSurface = onSurface
)

internal val LocalColorScheme: ProvidableCompositionLocal<MateriallyColorScheme> =
    compositionLocalOf { materiallyColorScheme() }