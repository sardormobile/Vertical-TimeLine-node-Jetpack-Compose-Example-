package com.newapp.timelinecomponentwithjetpackcompose.ui.timeline.defoults

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.newapp.timelinecomponentwithjetpackcompose.ui.timeline.models.CircleParameters
import com.newapp.timelinecomponentwithjetpackcompose.ui.timeline.models.StrokeParameters

object CircleParametersDefaults {

    private val defaultCircleRadius = 12.dp

    fun circleParameters(
        radius: Dp = defaultCircleRadius,
        backgroundColor: Color = Color.Cyan,
        stroke: StrokeParameters? = null,
        @DrawableRes
        icon: Int? = null
    ) = CircleParameters(
        radius,
        backgroundColor,
        stroke,
        icon
    )
}