package com.newapp.timelinecomponentwithjetpackcompose.ui.timeline.models

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import com.newapp.timelinecomponentwithjetpackcompose.ui.timeline.models.StrokeParameters

data class CircleParameters(
    val radius: Dp,
    val backgroundColor: Color,
    val stroke: StrokeParameters? = null,
    @DrawableRes val icon: Int? = null
)