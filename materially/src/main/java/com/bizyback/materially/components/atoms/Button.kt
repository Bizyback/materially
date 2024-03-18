package com.bizyback.materially.components.atoms

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.tv.material3.ExperimentalTvMaterial3Api
import com.bizyback.materially.components.atoms.buttons.ButtonBorder
import com.bizyback.materially.components.atoms.buttons.ButtonColors
import com.bizyback.materially.components.atoms.buttons.ButtonDefaults
import com.bizyback.materially.components.atoms.buttons.ButtonElevation
import com.bizyback.materially.components.atoms.buttons.ButtonGlow
import com.bizyback.materially.components.atoms.buttons.ButtonScale
import com.bizyback.materially.components.atoms.buttons.ButtonShape
import com.bizyback.materially.device.LocalDevice
import com.bizyback.materially.device.MateriallyDevice
import androidx.compose.material3.Button as SmallButton
import androidx.tv.material3.Button as LargeButton

/**
 * project : Materially
 * date    : Sunday 17/03/2024
 * user    : mambo
 * email   : mambobryan@gmail.com
 */
@OptIn(ExperimentalTvMaterial3Api::class, ExperimentalFoundationApi::class)
@Composable
fun Button(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    onLongClick: () -> Unit = {},
    enabled: Boolean = true,
    scale: ButtonScale = ButtonDefaults.scale(),
    glow: ButtonGlow = ButtonDefaults.glow(),
    shape: ButtonShape = ButtonDefaults.shape(),
    colors: ButtonColors = ButtonDefaults.colors(),
    elevation: ButtonElevation = ButtonDefaults.elevation(),
    tonalElevation: Dp = 0.dp,
    border: ButtonBorder = ButtonDefaults.border(),
    contentPadding: PaddingValues = ButtonDefaults.ContentPadding,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    content: @Composable RowScope.() -> Unit
) {
    when (LocalDevice.current) {
        MateriallyDevice.MOBILE -> {
            SmallButton(
                onClick = onClick,
                modifier = modifier.combinedClickable(onClick = onClick, onLongClick = onLongClick),
                enabled = enabled,
                shape = shape.asSmallShape(),
                colors = colors.asSmallColors(),
                elevation = elevation.asSmallElevation(),
                border = border.asBorderStroke(),
                contentPadding = contentPadding,
                interactionSource = interactionSource,
                content = content
            )
        }

        MateriallyDevice.TELEVISION -> {
            LargeButton(
                onClick = onClick,
                modifier = modifier,
                onLongClick = onLongClick,
                enabled = enabled,
                scale = scale.asLargeScale(),
                glow = glow.asLargeGlow(),
                shape = shape.asLargeShape(),
                colors = colors.asLargeColors(),
                tonalElevation = tonalElevation,
                border = border.asLargeBorder(),
                contentPadding = contentPadding,
                interactionSource = interactionSource,
                content = content
            )
        }
    }
}