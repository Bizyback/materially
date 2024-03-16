package com.bizyback.materially.colors

import androidx.compose.ui.graphics.Color
import androidx.tv.material3.ExperimentalTvMaterial3Api
import androidx.compose.material3.darkColorScheme as smallDarkColorScheme
import androidx.compose.material3.lightColorScheme as smallLightColorScheme
import androidx.tv.material3.darkColorScheme as largeDarkColorScheme
import androidx.tv.material3.lightColorScheme as largeLightColorScheme

/**
 * project : Materially
 * date    : Sunday 17/03/2024
 * user    : mambo
 * email   : mambobryan@gmail.com
 */
data class MateriallyColorScheme(
    val primary: Color,
    val onPrimary: Color,
    val secondary: Color,
    val onSecondary: Color,
    val tertiary: Color,
    val onTertiary: Color,
    val background: Color,
    val onBackground: Color,
    val surface: Color,
    val onSurface: Color,
)

fun MateriallyColorScheme.smallLightColorScheme() = smallLightColorScheme(
    primary = primary,
    onPrimary = onPrimary,
    secondary = onSecondary,
    onSecondary = onSecondary,
    tertiary = tertiary,
    onTertiary =  onTertiary,
    background =  background,
    onBackground =  onBackground,
    surface = surface,
    onSurface =  onSurface,
)

fun MateriallyColorScheme.smallDarkColorScheme() = smallDarkColorScheme(
    primary = primary,
    onPrimary = onPrimary,
    secondary = onSecondary,
    onSecondary = onSecondary,
    tertiary = tertiary,
    onTertiary =  onTertiary,
    background =  background,
    onBackground =  onBackground,
    surface = surface,
    onSurface =  onSurface,
)

@OptIn(ExperimentalTvMaterial3Api::class)
fun MateriallyColorScheme.largeLightColorScheme() = largeLightColorScheme(
    primary = primary,
    onPrimary = onPrimary,
    secondary = onSecondary,
    onSecondary = onSecondary,
    tertiary = tertiary,
    onTertiary =  onTertiary,
    background =  background,
    onBackground =  onBackground,
    surface = surface,
    onSurface =  onSurface,
)

@OptIn(ExperimentalTvMaterial3Api::class)
fun MateriallyColorScheme.largeDarkColorScheme() = largeDarkColorScheme(
    primary = primary,
    onPrimary = onPrimary,
    secondary = onSecondary,
    onSecondary = onSecondary,
    tertiary = tertiary,
    onTertiary =  onTertiary,
    background =  background,
    onBackground =  onBackground,
    surface = surface,
    onSurface =  onSurface,
)