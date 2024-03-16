package com.bizyback.materially.shapes

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.tv.material3.ExperimentalTvMaterial3Api
import androidx.compose.material3.Shapes as SmallShapes
import androidx.tv.material3.Shapes as LargeShapes

/**
 * project : Materially
 * date    : Sunday 17/03/2024
 * user    : mambo
 * email   : mambobryan@gmail.com
 */
data class MateriallyShapes(
    val xs: CornerBasedShape,
    val sm: CornerBasedShape,
    val md: CornerBasedShape,
    val lg: CornerBasedShape,
    val xl: CornerBasedShape
)

fun MateriallyShapes.toSmallShapes() = SmallShapes(
    extraSmall = xs, small = sm, medium = md, large = lg, extraLarge = xl
)

@OptIn(ExperimentalTvMaterial3Api::class)
fun MateriallyShapes.toLargeShapes() = LargeShapes(
    extraSmall = xs, small = sm, medium = md, large = lg, extraLarge = xl
)
