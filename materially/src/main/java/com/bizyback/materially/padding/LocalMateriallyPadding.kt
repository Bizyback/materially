package com.bizyback.materially.padding

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.dp
import com.bizyback.materially.device.isTv

/**
 * project : Materially
 * date    : Monday 18/03/2024
 * user    : mambo
 * email   : mambobryan@gmail.com
 */
@Composable
fun materiallyPadding(
    two: MateriallyDevicePadding = MateriallyDevicePadding(2.dp, 6.dp),
    four: MateriallyDevicePadding = MateriallyDevicePadding(4.dp, 8.dp),
    eight: MateriallyDevicePadding = MateriallyDevicePadding(mobile = 8.dp, tv = 12.dp),
    twelve: MateriallyDevicePadding = MateriallyDevicePadding(12.dp, 16.dp),
    sixteen: MateriallyDevicePadding = MateriallyDevicePadding(16.dp, 20.dp),
    twenty: MateriallyDevicePadding = MateriallyDevicePadding(20.dp, 24.dp),
    twentyFour: MateriallyDevicePadding = MateriallyDevicePadding(24.dp, 28.dp),
    twentyEight: MateriallyDevicePadding = MateriallyDevicePadding(28.dp, 32.dp),
    thirtyTwo: MateriallyDevicePadding = MateriallyDevicePadding(32.dp, 36.dp),
    thirtySix: MateriallyDevicePadding = MateriallyDevicePadding(36.dp, 40.dp),
    forty: MateriallyDevicePadding = MateriallyDevicePadding(40.dp, 44.dp),
): MateriallyPadding = when (isTv()) {
    false -> MateriallyPadding(
        two = two.mobile,
        four = four.mobile,
        eight = eight.mobile,
        twelve = twelve.mobile,
        sixteen = sixteen.mobile,
        twenty = twenty.mobile,
        twentyFour = twentyFour.mobile,
        twentyEight = twentyEight.mobile,
        thirtyTwo = thirtyTwo.mobile,
        thirtySix = thirtySix.mobile,
        forty = forty.mobile
    )

    true -> MateriallyPadding(
        two = two.tv,
        four = four.tv,
        eight = eight.tv,
        twelve = twelve.tv,
        sixteen = sixteen.tv,
        twenty = twenty.tv,
        twentyFour = twentyFour.tv,
        twentyEight = twentyEight.tv,
        thirtyTwo = thirtyTwo.tv,
        thirtySix = thirtySix.tv,
        forty = forty.tv
    )
}

val LocalPadding: ProvidableCompositionLocal<MateriallyPadding> =
    compositionLocalOf {
        MateriallyPadding(
            two = 2.dp,
            four = 4.dp,
            eight = 8.dp,
            twelve = 12.dp,
            sixteen = 16.dp,
            twenty = 20.dp,
            twentyFour = 24.dp,
            twentyEight = 28.dp,
            thirtyTwo = 32.dp,
            thirtySix = 36.dp,
            forty = 40.dp
        )
    }