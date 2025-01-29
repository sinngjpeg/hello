package br.com.jpegsinng.hello

import android.os.Build
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.util.Log


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val config = resources.configuration
        val metrics = resources.displayMetrics
        val orientation = config.orientation
        val density = metrics.density
        val height = metrics.heightPixels
        val width = metrics.widthPixels
        val mcc = config.mcc
        val mnc = config.mnc
        val locale = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N)
            config.locales[0] else config.locale

        val tag = "MainActivity"
        Log.d(tag, "density: $density")
        Log.d(tag, "orientation: $orientation")
        Log.d(tag, "height: $height")
        Log.d(tag, "width: $width")
        Log.d(tag, "language: ${locale.language}")
        Log.d(tag, "mcc: $mcc")
        Log.d(tag, "mnc: $mnc")
    }
}