package com.bizyback.materially.components.atoms
import androidx.compose.material3.LocalContentColor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.tv.material3.ExperimentalTvMaterial3Api
import com.bizyback.materially.device.LocalDevice
import com.bizyback.materially.device.MateriallyDevice
import androidx.compose.material3.Icon as MobileIcon
import androidx.tv.material3.Icon as TvIcon

@OptIn(ExperimentalTvMaterial3Api::class)
@Composable
fun Icon(
    imageVector: ImageVector,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    tint: Color = LocalContentColor.current
) {
    when(LocalDevice.current){
        MateriallyDevice.MOBILE -> {
            MobileIcon(
                imageVector = imageVector,
                contentDescription = contentDescription,
                modifier = modifier,
                tint = tint
            )
        }
        MateriallyDevice.TELEVISION -> {
            TvIcon(
                imageVector = imageVector,
                contentDescription = contentDescription,
                modifier = modifier,
                tint = tint
            )
        }
    }
}

@OptIn(ExperimentalTvMaterial3Api::class)
@Composable
fun Icon(
    painter: Painter,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    tint: Color = LocalContentColor.current
) {
    when(LocalDevice.current){
        MateriallyDevice.MOBILE -> {
            MobileIcon(
                painter = painter,
                contentDescription = contentDescription,
                modifier = modifier,
                tint = tint
            )

        }
        MateriallyDevice.TELEVISION -> {
            TvIcon(
                painter = painter,
                contentDescription = contentDescription,
                modifier = modifier,
                tint = tint
            )
        }
    }
}


@OptIn(ExperimentalTvMaterial3Api::class)
@Composable
fun Icon(
    bitmap: ImageBitmap,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    tint: Color = LocalContentColor.current
) {
    when(LocalDevice.current){
        MateriallyDevice.MOBILE -> {
            MobileIcon(
                bitmap = bitmap,
                contentDescription = contentDescription,
                modifier = modifier,
                tint = tint
            )

        }
        MateriallyDevice.TELEVISION -> {
            TvIcon(
                bitmap = bitmap,
                contentDescription = contentDescription,
                modifier = modifier,
                tint = tint
            )
        }
    }
}