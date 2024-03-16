package com.bizyback.materially.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalConfiguration
import com.bizyback.materially.extensions.dp
import com.bizyback.materially.extensions.dpToPx

/**
 * project : Materially
 * date    : Saturday 16/03/2024
 * user    : mambo
 * email   : mambobryan@gmail.com
 */

/**
 * The density of the different screen sizes in pixels
 */
data class MateriallyScreens(
    val sm: Float = 640f,
    val md: Float = 768f,
    val lg: Float = 1024f,
    val xl: Float = 1280f,
    val xxl: Float = 1536f,
)

enum class Screen {
    SM, MD, LG, XL, XXL
}

@Composable
internal fun getMateriallyScreenSize(screens: MateriallyScreens): Screen {
    val configuration = LocalConfiguration.current
    val width = configuration.screenWidthDp.dp.dpToPx()
    return when (width) {
        in 0f ..< screens.sm -> Screen.SM
        in screens.sm ..< screens.md -> Screen.MD
        in screens.md ..< screens.lg -> Screen.LG
        in screens.lg ..< screens.xl -> Screen.XL
        in screens.xl ..< screens.xxl -> Screen.XXL
        else -> Screen.XXL
    }
}
