package damian.myapplication1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_random.*
import java.util.*

class RandomActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random)
        showRandomNumber()
    }

    fun showRandomNumber() {

        // Generate the random number
        val random = Random()
        var randomInt = random.nextInt(3) + 1

        // Display the random number.
        textview_random.text = Integer.toString(randomInt)
    }
}
