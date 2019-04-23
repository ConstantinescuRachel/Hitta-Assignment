package com.hitta.android.assignment.main.screen

import com.agoda.kakao.KRatingBar
import com.agoda.kakao.KTextView
import com.agoda.kakao.Screen
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.espresso.matcher.ViewMatchers.withText
import com.hitta.android.assignment.R


class  ReviewsScreenK : Screen<ReviewsScreenK>() {

    val toolbarText = KTextView {
        withText("Hitta Assignment")

    }
    val companyName = KTextView {
        withId(R.id.reviews_text)
    }
    val bigRating: KRatingBar = KRatingBar {
        withId(R.id.your_review_big_rating_bar)
    }

    val smallRating = KRatingBar {
        withId(R.id.your_review_small_rating_bar)

    }
    val ratingbar: KRatingBar = KRatingBar { withId(R.id.rating_bar)
    }
    val yourExperience = KTextView {
        withText("Describe your experience")
    }
    val rateAndReviews = KTextView {
        withId(R.id.your_review_info_text)
    }

    val reviewInfoText = KTextView {
        withId(R.id.your_review_info_text)

    }
}




