package com.bizyback.materially.components.atoms.buttons

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.IconButtonColors
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.tv.material3.ButtonBorder
import androidx.tv.material3.ButtonColors
import androidx.tv.material3.ButtonGlow
import androidx.tv.material3.ButtonScale
import androidx.tv.material3.ButtonShape
import androidx.tv.material3.ExperimentalTvMaterial3Api
import com.bizyback.materially.device.LocalDevice
import com.bizyback.materially.device.MateriallyDevice
import androidx.compose.material3.IconButton as MobileIconButton
import androidx.tv.material3.IconButton as TvIconButton

@OptIn(ExperimentalTvMaterial3Api::class)
@Composable
fun IconButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    onLongClick: (() -> Unit)? = null,
    enabled: Boolean = true,
    mobileColors: IconButtonColors = IconButtonDefaults.iconButtonColors(),
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    scale: ButtonScale = androidx.tv.material3.IconButtonDefaults.scale(),
    glow: ButtonGlow = androidx.tv.material3.IconButtonDefaults.glow(),
    shape: ButtonShape = androidx.tv.material3.IconButtonDefaults.shape(),
    tvColors: ButtonColors = androidx.tv.material3.IconButtonDefaults.colors(),
    border: ButtonBorder = androidx.tv.material3.IconButtonDefaults.border(),
    content: @Composable BoxScope.() -> Unit,
) {
    when(LocalDevice.current){
        MateriallyDevice.MOBILE -> {
            MobileIconButton(
                onClick = onClick,
                modifier = modifier,
                enabled = enabled,
                colors = mobileColors,
                interactionSource = interactionSource,
            ){
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center,
                    content = content
                )
            }
        }
        MateriallyDevice.TELEVISION -> {
            TvIconButton(
                onClick = onClick,
                modifier = modifier,
                onLongClick = onLongClick,
                enabled = enabled,
                scale = scale,
                glow = glow,
                shape = shape,
                colors = tvColors,
                border = border,
                interactionSource = interactionSource,
                content = content
            )
        }
    }
}