package damian.myapplication1

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View

class StartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
    }

    companion object {
        var CHOICE_VOLUME = 0
    }

    fun choiceMe25(view: View) {

        CHOICE_VOLUME = 25
        startTimeOptions()
    }

    fun choiceMe40(view: View) {

        CHOICE_VOLUME = 40
        startTimeOptions()
    }

    fun choiceMe50(view: View) {

        CHOICE_VOLUME = 50
        startTimeOptions()
    }

    fun startTimeOptions() {

        // Create an Intent to start the second activity
        val mainIntent = Intent(this, TimeOptionsActivity::class.java)

        // Start the new activity.
        startActivity(mainIntent)
    }
}
