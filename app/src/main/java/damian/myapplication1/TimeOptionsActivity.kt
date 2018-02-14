package damian.myapplication1

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

class TimeOptionsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time_options)
    }

    companion object {
        var CHOICE_TIME = 0
    }

    fun choiceMe3(view: View) {

        CHOICE_TIME = 3
        startMain()
    }

    fun choiceMe5(view: View) {

        CHOICE_TIME = 5
        startMain()
    }

    fun choiceMe7(view: View) {

        CHOICE_TIME = 7
        startMain()
    }

    fun choiceMe10(view: View) {

        CHOICE_TIME = 10
        startMain()
    }

    fun startMain() {

        // Create an Intent to start the second activity
        val mainIntent = Intent(this, MainActivity::class.java)

        // Start the new activity.
        startActivity(mainIntent)
    }
}

