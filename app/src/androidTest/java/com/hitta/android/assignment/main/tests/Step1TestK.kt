package com.hitta.android.assignment.main.tests




import android.support.test.filters.LargeTest
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import com.hitta.android.assignment.main.MainActivity
import com.hitta.android.assignment.main.screen.ReviewsScreenK
import org.junit.After
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@LargeTest
@RunWith(AndroidJUnit4::class)
class Step1TestK {
    
    @Rule
    @JvmField
    var mActivityTestRule = ActivityTestRule(MainActivity::class.java)
    
    private val reviewsScreenK = ReviewsScreenK()
    
    
    //@testing Reviews Screen, Company Name, Empty Stars
    
    @Test
    fun reviewsPageTestK() {
        
        reviewsScreenK {
            toolbarText {
                isDisplayed()
            }
        }
        reviewsScreenK {
            companyName {
                isDisplayed()
            }
            
        }
        reviewsScreenK {
            reviewInfoText {
                isDisplayed()
            }
            
        }
        reviewsScreenK {
            rateAndReviews {
                isDisplayed()
            }
            
        }
        
        reviewsScreenK {
            bigRating {
                isDisplayed()
                hasRating(0f)
            }
        }
    }
}


























