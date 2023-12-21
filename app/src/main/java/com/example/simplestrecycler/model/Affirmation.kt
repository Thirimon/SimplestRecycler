package com.example.simplestrecycler.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(
    @StringRes val stringResourseId: Int,
    @DrawableRes val imageResourseId: Int

    )
