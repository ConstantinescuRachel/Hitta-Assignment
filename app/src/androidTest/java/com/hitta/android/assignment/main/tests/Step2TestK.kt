package com.hitta.android.assignment.main.tests



import android.support.test.espresso.action.GeneralLocation
import android.support.test.espresso.action.ViewActions.click
import android.support.test.filters.LargeTest
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import com.hitta.android.assignment.main.MainActivity

import com.hitta.android.assignment.main.screen.AddReviewScreen
import com.hitta.android.assignment.main.screen.ReviewsScreenK
import com.hitta.android.assignment.main.screen.EditReviewScreen

import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import java.lang.Thread.sleep

@LargeTest
@RunWith(AndroidJUnit4::class)
class Step2TestK {
    
    @Rule
    @JvmField
    var mActivityTestRule = ActivityTestRule(MainActivity::class.java)
    
    private val reviewScreen = ReviewsScreenK()
    private val addReviewsScreen = AddReviewScreen()
    private val editReviewScreen = EditReviewScreen()
    
    
    //@Random click on rating Stars , Insert name and review text and Save
    
    
    @Test
    fun changeRatingTestK() {
        reviewScreen {
            bigRating {
                click()
            }
        }
        sleep(3000)
        
        addReviewsScreen {
            ratingBar {
                setRatingAt(3f)
            }
        }
        
        
       
        editReviewScreen {
            star3 {
                hasRating(3f)
                
                
            }
        }
        
        sleep(3000)
        editReviewScreen {
            rateText3 {
                hasText("It was OK")
                
            }
        }
        
       
        editReviewScreen {
            imageButton {
                isVisible()
                click()

            }
        }

        
        
        reviewScreen {
            yourExperience {
                click()
                
            }
        }
    
        addReviewsScreen {
            ratingBar {
                setRatingAt(3f)
            }
        }
        editReviewScreen {
            star3 {
                hasRating(3f)
                setRatingAt(5f)
                
                
            }
        }
         editReviewScreen {
            star5 {
                hasRating(5f)
                
            
            
            }
        }
      
       
/*
       editReviewScreen {
            rateText5 {
             hasText("I loved it")

            }
        }

        sleep(6000)
        editReviewScreen {
            star4 {
                hasRating(5f)
                setRatingAt(4f)
                hasRating(4f)
                
            }
        }
        sleep(6000)
        editReviewScreen {
            rateText4 {
                isDisplayed()
              hasText("I liked it")
                
            }
        }*/
        
        
        addReviewsScreen {
            name {
                
                typeText("Rachel")
                
            }
        }
        
        
        
        addReviewsScreen {
            largerTextReview {
                typeText(
                    "Lorem Ipsum is simply dummy text of the printing and typesetting industry." +
                            " Lorem Ipsum has been the industry's standard dummy text ever since the 1500s."
                )
                
            }
        }
        
        
        addReviewsScreen {
            save {
                isDisplayed()
                click()
            }
        }
        
        
        addReviewsScreen {
            dialog {
                isDisplayed()
                
            }
        }
        
        reviewScreen {
            smallRating {
                isDisplayed()
            }
            
        }
    }
}






