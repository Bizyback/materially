package com.bizyback.materially.shapes

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.dp

/**
 * project : Materially
 * date    : Sunday 17/03/2024
 * user    : mambo
 * email   : mambobryan@gmail.com
 */
fun materiallyShapes(
    xs: CornerBasedShape = RoundedCornerShape(4.dp),
    sm: CornerBasedShape = RoundedCornerShape(8.dp),
    md: CornerBasedShape = RoundedCornerShape(12.dp),
    lg: CornerBasedShape = RoundedCornerShape(16.dp),
    xl: CornerBasedShape = RoundedCornerShape(20.dp),
): MateriallyShapes = MateriallyShapes(
    xs = xs, sm = sm, md = md, lg = lg, xl = xl
)

internal val LocalShapes: ProvidableCompositionLocal<MateriallyShapes> =
    compositionLocalOf { materiallyShapes() }
