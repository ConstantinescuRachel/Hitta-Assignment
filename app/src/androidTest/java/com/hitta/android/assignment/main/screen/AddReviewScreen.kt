package com.hitta.android.assignment.main.screen

import android.support.test.espresso.matcher.ViewMatchers.withId
import com.agoda.kakao.*
import com.hitta.android.assignment.R


class AddReviewScreen : Screen<AddReviewScreen>() {



    val yourReview = KEditText {
        withId(R.id.your_review_describe_text)
    }


    val addBigRating = KRatingBar {

        withId(R.id.your_review_big_rating_bar)

    }
    val ratingBar = KRatingBar {
        
        withId(R.id.rating_bar)
        
    }

    val name = KEditText {
        withId(R.id.name_edit_text)

    }
    val largerTextReview = KEditText{
        withId(R.id.comment_edit_text)


    }
    val save = KButton {
        withId(R.id.save)

    }
    val dialog = KButton {
        withId(R.id.buttonPanel)


        //Cancel is not implemented on current version - see UX

        /* val cancel = KButton{
        withText("Cancel")
        */

    }
    val ok = KButton {
        withText("Okay!")
    }
}
