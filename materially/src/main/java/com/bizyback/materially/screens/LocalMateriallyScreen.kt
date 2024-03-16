package com.bizyback.materially.screens

import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.compositionLocalOf

/**
 * project : Materially
 * date    : Sunday 17/03/2024
 * user    : mambo
 * email   : mambobryan@gmail.com
 */

/**
 * Configures [MateriallyScreens] based on the specified sizes
 * @param sm small screen size in pixels
 * @param md medium screen size in pixels
 * @param lg large screen size in pixels
 * @param xl extra large screen size in pixels
 * @param xxl extra extra large screen size in pixels
 */
fun materiallyScreen(
    sm: Int = 640,
    md: Int = 768,
    lg: Int = 1024,
    xl: Int = 1280,
    xxl: Int = 1536,
): MateriallyScreens = MateriallyScreens(
    sm = sm.toFloat(),
    md = md.toFloat(),
    lg = lg.toFloat(),
    xl = xl.toFloat(),
    xxl = xxl.toFloat()
)

internal val LocalScreen: ProvidableCompositionLocal<Screen> = compositionLocalOf { Screen.SM }
