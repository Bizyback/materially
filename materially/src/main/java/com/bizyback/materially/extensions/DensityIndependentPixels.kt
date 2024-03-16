package com.bizyback.materially.extensions

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp

/**
 * project : Materially
 * date    : Saturday 16/03/2024
 * user    : mambo
 * email   : mambobryan@gmail.com
 */
@Composable
internal fun Dp.dpToPx(): Float = with(LocalDensity.current) { this@dpToPx.toPx() }

internal val Dp.px : Float
    @Composable
    get() = dpToPx()

@Composable
internal fun Float.pxToDp(): Dp = with(LocalDensity.current) { this@pxToDp.toDp() }

internal val Float.dp : Dp
    @Composable
    get() = pxToDp()