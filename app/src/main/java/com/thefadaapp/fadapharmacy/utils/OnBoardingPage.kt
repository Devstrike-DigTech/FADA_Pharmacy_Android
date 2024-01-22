/*
 * Copyright (c) 2024.
 * Richard Uzor
 * Under the Authority of
 * Devstrike Digital Limited
 */

package com.thefadaapp.fadapharmacy.utils

import androidx.annotation.DrawableRes
import com.thefadaapp.fadapharmacy.R

sealed class OnBoardingPage(
    @DrawableRes
    val image: Int,
    val title: Int,
    val description: Int
){
    object First : OnBoardingPage(
        image = R.drawable.board_1,
        title = R.string.board_one_title,
        description = R.string.board_one_description
    )

    object Second : OnBoardingPage(
        image = R.drawable.board_2,
        title = R.string.board_two_title,
        description = R.string.board_two_description,
    )

    object Third : OnBoardingPage(
        image = R.drawable.board_3,
        title = R.string.board_three_title,
        description = R.string.board_three_description,
    )
}
