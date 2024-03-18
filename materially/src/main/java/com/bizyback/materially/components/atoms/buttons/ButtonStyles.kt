package com.bizyback.materially.components.atoms.buttons

import androidx.annotation.FloatRange
import androidx.compose.foundation.BorderStroke
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.tv.material3.Border
import androidx.tv.material3.ExperimentalTvMaterial3Api
import androidx.tv.material3.Glow

/**
 * project : Materially
 * date    : Sunday 17/03/2024
 * user    : mambo
 * email   : mambobryan@gmail.com
 */

data class ButtonShape(
    internal val shape: Shape,
    internal val focusedShape: Shape,
    internal val pressedShape: Shape,
    internal val disabledShape: Shape,
    internal val focusedDisabledShape: Shape
) {

    fun asSmallShape() = shape

    @OptIn(ExperimentalTvMaterial3Api::class)
    fun asLargeShape() = androidx.tv.material3.ButtonDefaults.shape(
        shape = shape,
        focusedShape = focusedShape,
        pressedShape = pressedShape,
        disabledShape = disabledShape,
        focusedDisabledShape = focusedDisabledShape
    )

}

data class ButtonColors(
    internal val containerColor: Color,
    internal val contentColor: Color,
    internal val focusedContainerColor: Color,
    internal val focusedContentColor: Color,
    internal val pressedContainerColor: Color,
    internal val pressedContentColor: Color,
    internal val disabledContainerColor: Color,
    internal val disabledContentColor: Color,
){

    @Composable
    fun asSmallColors() = ButtonColors(
        containerColor = focusedContainerColor,
        contentColor = focusedContentColor,
        disabledContainerColor = disabledContainerColor,
        disabledContentColor = disabledContentColor
    )

    @Composable
    @OptIn(ExperimentalTvMaterial3Api::class)
    fun asLargeColors() = androidx.tv.material3.ButtonDefaults.colors(
        containerColor = containerColor,
        contentColor = contentColor,
        focusedContainerColor = focusedContainerColor,
        focusedContentColor = focusedContentColor,
        pressedContainerColor = pressedContainerColor,
        pressedContentColor = pressedContentColor,
        disabledContainerColor = disabledContainerColor,
        disabledContentColor = disabledContentColor
    )

}

data class ButtonScale(
    @FloatRange(from = 0.0) internal val scale: Float,
    @FloatRange(from = 0.0) internal val focusedScale: Float,
    @FloatRange(from = 0.0) internal val pressedScale: Float,
    @FloatRange(from = 0.0) internal val disabledScale: Float,
    @FloatRange(from = 0.0) internal val focusedDisabledScale: Float
){
    @OptIn(ExperimentalTvMaterial3Api::class)
    fun asLargeScale() = androidx.tv.material3.ButtonDefaults.scale(
        scale = scale,
        focusedScale = focusedScale,
        pressedScale = pressedScale,
        disabledScale = disabledScale,
        focusedDisabledScale = focusedDisabledScale
    )
}

@OptIn(ExperimentalTvMaterial3Api::class)
data class ButtonBorder(
    internal val border: Border,
    internal val focusedBorder: Border,
    internal val pressedBorder: Border,
    internal val disabledBorder: Border,
    internal val focusedDisabledBorder: Border
) {

    fun asBorderStroke() = BorderStroke(border.border.width, border.border.brush)

    @Composable
    fun asLargeBorder() = androidx.tv.material3.ButtonDefaults.border(
        border = border,
        focusedBorder = focusedBorder,
        pressedBorder = pressedBorder,
        disabledBorder = disabledBorder,
        focusedDisabledBorder = focusedDisabledBorder
    )

}

@OptIn(ExperimentalTvMaterial3Api::class)
data class ButtonGlow(
    internal val glow: Glow,
    internal val focusedGlow: Glow,
    internal val pressedGlow: Glow
){
    fun asLargeGlow() = androidx.tv.material3.ButtonDefaults.glow(
        glow = glow,
        focusedGlow = focusedGlow,
        pressedGlow = pressedGlow
    )
}

data class ButtonElevation(
    internal val defaultElevation: Dp,
    internal val pressedElevation: Dp,
    internal val focusedElevation: Dp,
    internal val hoveredElevation: Dp,
    internal val disabledElevation: Dp,
){

    @Composable
    fun asSmallElevation() = ButtonDefaults.buttonElevation(
        defaultElevation = defaultElevation,
        pressedElevation = pressedElevation,
        focusedElevation = focusedElevation,
        hoveredElevation = hoveredElevation,
        disabledElevation = disabledElevation
    )

}