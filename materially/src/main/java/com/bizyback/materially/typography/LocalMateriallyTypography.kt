package com.bizyback.materially.typography

import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.text.TextStyle

/**
 * project : Materially
 * date    : Sunday 17/03/2024
 * user    : mambo
 * email   : mambobryan@gmail.com
 */
fun materiallyTypography(
    displayLarge: TextStyle = TextStyle(),
    displayMedium: TextStyle = TextStyle(),
    displaySmall: TextStyle = TextStyle(),
    headlineLarge: TextStyle = TextStyle(),
    headlineMedium: TextStyle = TextStyle(),
    headlineSmall: TextStyle = TextStyle(),
    titleLarge: TextStyle = TextStyle(),
    titleMedium: TextStyle = TextStyle(),
    titleSmall: TextStyle = TextStyle(),
    bodyLarge: TextStyle = TextStyle(),
    bodyMedium: TextStyle = TextStyle(),
    bodySmall: TextStyle = TextStyle(),
    labelLarge: TextStyle = TextStyle(),
    labelMedium: TextStyle = TextStyle(),
    labelSmall: TextStyle = TextStyle()
) = MateriallyTypography(
    displayLarge = displayLarge,
    displayMedium = displayMedium,
    displaySmall = displaySmall,
    headlineLarge = headlineLarge,
    headlineMedium = headlineMedium,
    headlineSmall = headlineSmall,
    titleLarge = titleLarge,
    titleMedium = titleMedium,
    titleSmall = titleSmall,
    bodyLarge = bodyLarge,
    bodyMedium = bodyMedium,
    bodySmall = bodySmall,
    labelLarge = labelLarge,
    labelMedium = labelMedium,
    labelSmall = labelSmall
)

internal val LocalTypography: ProvidableCompositionLocal<MateriallyTypography> = compositionLocalOf { materiallyTypography() }
