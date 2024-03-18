package com.bizyback.materially.device

import android.app.Activity
import android.content.pm.PackageManager
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

/**
 * project : Materially
 * date    : Saturday 16/03/2024
 * user    : mambo
 * email   : mambobryan@gmail.com
 */

/**
 * The density of the different screen sizes in pixels
 */
enum class MateriallyDevice {
    MOBILE, TELEVISION
}

@Composable
internal fun isTv() =
    (LocalContext.current as Activity).packageManager.hasSystemFeature(PackageManager.FEATURE_LEANBACK)

@Composable
internal fun getMateriallyScreenSize(): MateriallyDevice {
    return when (isTv()) {
        true -> MateriallyDevice.TELEVISION
        false -> MateriallyDevice.MOBILE
    }
}
