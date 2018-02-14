package damian.myapplication1
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView
import android.widget.Toast

class   MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        start()
        startCount()
    }

    fun startCount() {
        val handler = Handler()
        handler.postDelayed({ alertNotification() }, (TimeOptionsActivity.CHOICE_TIME * 60 * 1000).toLong())
    }

    fun alertNotification(){
        Toast.makeText(this, "Time to drink!", Toast.LENGTH_SHORT).show()
        startCount()
    }

    private fun start() {

        alertNotification()

        // Get the text view
        val showValueTextView = findViewById<TextView>(R.id.textView_value1)

        // Get the count from the intent extras
        val value = TimeOptionsActivity.CHOICE_TIME

        //Show the value of one shot passed from StartActivity
        showValueTextView.text = value.toString()


        // Get the text view
        val showValueTextView2 = findViewById<TextView>(R.id.textView_value2)

        // Get the count from the intent extras
        val value2 = StartActivity.CHOICE_VOLUME

        //Show the value of one shot passed from StartActivity
        showValueTextView2.text = value2.toString()
    }

    fun toastMe(view: View) {

        Toast.makeText(this, getString(R.string.text_toast), Toast.LENGTH_SHORT).show()
    }

    fun countMe (view: View) {
        // Get the text view
        val showCountTextView = findViewById(R.id.textView) as TextView

        // Get the value of the text view.
        val countString = showCountTextView.text.toString()

        // Convert value to a number and increment it
        var count: Int = Integer.parseInt(countString)
        count++

        // Display the new value in the text view.
        showCountTextView.text = count.toString()
    }

    fun randomMe (view: View) {
        // Create an Intent to start the second activity
        val randomIntent = Intent(this, RandomActivity::class.java)

        // Start the new activity.
        startActivity(randomIntent)
    }
}
