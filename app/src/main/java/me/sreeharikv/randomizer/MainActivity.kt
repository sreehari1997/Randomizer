package me.sreeharikv.randomizer

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton = findViewById<Button>(R.id.rollButton)
        val resultText = findViewById<TextView>(R.id.resultTextView)
        val changeMax = findViewById<SeekBar>(R.id.seekBar)

        rollButton.setOnClickListener {
            val  random = Random().nextInt(changeMax.progress)
            resultText.text = random.toString()
        }

    }
}
