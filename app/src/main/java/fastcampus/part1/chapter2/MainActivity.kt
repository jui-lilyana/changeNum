package fastcampus.part1.chapter2

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import fastcampus.part1.chapter2.ui.theme.Chapter2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numberTextView = findViewById<TextView>(R.id.numberTextView)
        val resetBtn = findViewById<Button>(R.id.resetBtn)
        val plusBtn = findViewById<Button>(R.id.plusBtn)

        var number = 0

        resetBtn.setOnClickListener{
            number = 0;
            numberTextView.text = number.toString()
            Log.i("onClick","리셋 된 숫자는 $number")
        }

        plusBtn.setOnClickListener{
            number += 1
            numberTextView.text = number.toString()
            Log.i("onClick","플러스 된 숫자는 $number")
        }
    }
}
