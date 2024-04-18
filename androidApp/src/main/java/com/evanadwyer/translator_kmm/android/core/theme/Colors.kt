package com.evanadwyer.translator_kmm.android.core.theme

import androidx.compose.material.lightColors
import androidx.compose.ui.graphics.Color
import com.evanadwyer.translator_kmm.core.presentation.Colors

val AccentViolet = Color(Colors.AccentViolet)
val LightBlue = Color(Colors.LightBlue)
val LightBlueGray = Color(Colors.LightBlueGray)
val TextBlack = Color(Colors.TextBlack)
val DarkGray = Color(Colors.DarkGray)

val lightColors = lightColors(
    primary = AccentViolet,
    background = LightBlueGray,
    onPrimary = Color.White,
    onBackground = TextBlack,
    surface = Color.White,
    onSurface = TextBlack
)

val darkColors = lightColors(
    primary = AccentViolet,
    background = DarkGray,
    onPrimary = Color.White,
    onBackground = Color.White,
    surface = DarkGray,
    onSurface = Color.White
)