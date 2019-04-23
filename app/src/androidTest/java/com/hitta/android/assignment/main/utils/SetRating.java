package com.hitta.android.assignment.main.utils;

import android.support.test.espresso.UiController;
import android.support.test.espresso.ViewAction;
import android.support.test.espresso.matcher.ViewMatchers;
import android.view.View;
import android.widget.RatingBar;
import org.hamcrest.Matcher;

import static android.support.test.espresso.matcher.ViewMatchers.isAssignableFrom;



public final class SetRating implements ViewAction {

	private final int rating;

	public static SetRating setRating(int rating) {
		return new SetRating(rating);
	}

	private SetRating(int rating) {
		this.rating= rating;
	}

	@Override
	public Matcher<View> getConstraints() {
		return isAssignableFrom(RatingBar.class);
	}

	@Override
	public String getDescription() {
		return "Custom view action to set rating.";
	}

	@Override
	public void perform(UiController uiController, View view) {
		RatingBar ratingBar = (RatingBar) view;
		ratingBar.setRating(rating);
		ratingBar.getOnRatingBarChangeListener().onRatingChanged(ratingBar, rating, true);
	}
}

