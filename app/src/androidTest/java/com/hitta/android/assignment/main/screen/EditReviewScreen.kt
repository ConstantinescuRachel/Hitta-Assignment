package com.hitta.android.assignment.main.screen

import android.support.test.espresso.Espresso
import android.support.test.espresso.matcher.ViewMatchers
import com.agoda.kakao.*
import com.hitta.android.assignment.R
import org.hamcrest.Matchers


class EditReviewScreen : Screen<EditReviewScreen>() {
    
    
    val imageButton = KButton {
     withContentDescription("Navigate up")
    }
    val rateText1 = KTextView {
        withId(R.id.rate_text)
       //withResourceName("I hated it")
    }
    val rateText2 = KTextView {
        withId(R.id.rate_text)
        //withText("I didn't like i")
    }
    val rateText3 = KTextView {
        withId(R.id.rate_text)
        //withText("It was OK")
    }
    val rateText4 = KTextView {
        withId(R.id.rate_text)
        //withText("I liked it")
     
    }
    val rateText5 = KTextView {
        withId(R.id.rate_text)
        //withText("I loved it")
    }
    val star1 = KRatingBar{
        withId(R.id.rating_bar)
    }
    val star2 = KRatingBar {
        withId(R.id.rating_bar)
    }
    val star3 = KRatingBar {
        withId(R.id.rating_bar)
    }
    val star4 = KRatingBar{
        withId(R.id.rating_bar)
    }
    val star5 = KRatingBar {
        withId(R.id.rating_bar)
    }
}
