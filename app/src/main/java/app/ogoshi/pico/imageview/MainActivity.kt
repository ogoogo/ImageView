package app.ogoshi.pico.imageview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import coil.api.load

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val url = "https://lifeistech.co.jp/images/banner_10th.jpg"
        val imageView = findViewById<ImageView>(R.id.imageView)
        imageView.load(url)
    }
}