package com.bizyback.materially.device

import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.compositionLocalOf

/**
 * project : Materially
 * date    : Sunday 17/03/2024
 * user    : mambo
 * email   : mambobryan@gmail.com
 */

internal val LocalDevice: ProvidableCompositionLocal<MateriallyDevice> = compositionLocalOf { MateriallyDevice.MOBILE }
