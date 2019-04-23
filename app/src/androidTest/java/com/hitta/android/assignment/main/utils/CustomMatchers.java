package com.hitta.android.assignment.main.utils;


import android.view.View;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;





public final class CustomMatchers {


	public static Matcher<View> withRating(final int rating) {
		return new TypeSafeMatcher<View>() {

			@Override
			public boolean matchesSafely(View view) {
				if (!(view instanceof RatingBar)) {
					return false;
				}

				float currentRating = ((RatingBar) view).getRating();
				return currentRating == rating;
			}

			@Override
			public void describeTo(Description description) {
				description.appendText("rating: " + rating);
			}
		};
	}

}