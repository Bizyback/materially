package com.bizyback.materially.components.atoms.buttons

import androidx.annotation.FloatRange
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.tv.material3.Border
import androidx.tv.material3.ExperimentalTvMaterial3Api
import androidx.tv.material3.Glow
import androidx.tv.material3.MaterialTheme
import com.bizyback.materially.MateriallyTheme
import com.bizyback.materially.tokens.ElevationTokens

/**
 * project : Materially
 * date    : Sunday 17/03/2024
 * user    : mambo
 * email   : mambobryan@gmail.com
 */
object ButtonDefaults {

    private val ContainerShape = RoundedCornerShape(50)
    private val ButtonHorizontalPadding = 16.dp
    private val ButtonVerticalPadding = 10.dp

    val ContentPadding = PaddingValues(
        start = ButtonHorizontalPadding,
        top = ButtonVerticalPadding,
        end = ButtonHorizontalPadding,
        bottom = ButtonVerticalPadding
    )

    @OptIn(ExperimentalTvMaterial3Api::class)
    @ReadOnlyComposable
    @Composable
    fun colors(
        containerColor: Color = MateriallyTheme.colorScheme.primary.copy(alpha = 0.4f),
        contentColor: Color = MateriallyTheme.colorScheme.onPrimary.copy(alpha = 0.8f),
        focusedContainerColor: Color = MateriallyTheme.colorScheme.primary,
        focusedContentColor: Color = MateriallyTheme.colorScheme.onPrimary,
        pressedContainerColor: Color = focusedContainerColor,
        pressedContentColor: Color = focusedContentColor,
        disabledContainerColor: Color = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.4f),
        disabledContentColor: Color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.4f),
    ) = ButtonColors(
        containerColor = containerColor,
        contentColor = contentColor,
        focusedContainerColor = focusedContainerColor,
        focusedContentColor = focusedContentColor,
        pressedContainerColor = pressedContainerColor,
        pressedContentColor = pressedContentColor,
        disabledContainerColor = disabledContainerColor,
        disabledContentColor = disabledContentColor,
    )

    fun shape(
        shape: Shape = ContainerShape,
        focusedShape: Shape = shape,
        pressedShape: Shape = shape,
        disabledShape: Shape = shape,
        focusedDisabledShape: Shape = disabledShape
    ) = ButtonShape(
        shape = shape,
        focusedShape = focusedShape,
        pressedShape = pressedShape,
        disabledShape = disabledShape,
        focusedDisabledShape = focusedDisabledShape
    )

    fun scale(
        @FloatRange(from = 0.0) scale: Float = 1f,
        @FloatRange(from = 0.0) focusedScale: Float = 1.1f,
        @FloatRange(from = 0.0) pressedScale: Float = scale,
        @FloatRange(from = 0.0) disabledScale: Float = scale,
        @FloatRange(from = 0.0) focusedDisabledScale: Float = disabledScale
    ) = ButtonScale(
        scale = scale,
        focusedScale = focusedScale,
        pressedScale = pressedScale,
        disabledScale = disabledScale,
        focusedDisabledScale = focusedDisabledScale
    )

    @OptIn(ExperimentalTvMaterial3Api::class)
    @ReadOnlyComposable
    @Composable
    fun border(
        border: Border = Border.None,
        focusedBorder: Border = border,
        pressedBorder: Border = focusedBorder,
        disabledBorder: Border = border,
        focusedDisabledBorder: Border = Border(
            border = BorderStroke(
                width = 1.5.dp,
                color = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.2f)
            ),
            shape = ContainerShape
        )
    ) = ButtonBorder(
        border = border,
        focusedBorder = focusedBorder,
        pressedBorder = pressedBorder,
        disabledBorder = disabledBorder,
        focusedDisabledBorder = focusedDisabledBorder
    )

    @OptIn(ExperimentalTvMaterial3Api::class)
    fun glow(
        glow: Glow = Glow.None,
        focusedGlow: Glow = glow,
        pressedGlow: Glow = glow
    ) = ButtonGlow(
        glow = glow,
        focusedGlow = focusedGlow,
        pressedGlow = pressedGlow
    )

    @Composable
    fun elevation(
        defaultElevation: Dp = ElevationTokens.Level0,
        pressedElevation: Dp = defaultElevation,
        focusedElevation: Dp = defaultElevation,
        hoveredElevation: Dp = defaultElevation,
        disabledElevation: Dp = defaultElevation,
    ): ButtonElevation = ButtonElevation(
        defaultElevation = defaultElevation,
        pressedElevation = pressedElevation,
        focusedElevation = focusedElevation,
        hoveredElevation = hoveredElevation,
        disabledElevation = disabledElevation,
    )

}