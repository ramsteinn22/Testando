package androidhands.com.testando

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.gms.maps.MapView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener {
            openWebsite()
        }

         findViewById<Button>(R.id.button2).setOnClickListener {
             openDialer()
        }

        findViewById<Button>(R.id.button3).setOnClickListener {
         openTexto()
        }
    }

    private fun openWebsite() {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse("https://www.youtube.com/channel/UCIEBWb2nz2huEllUHhH4Lfg/videos")
        startActivity(intent)
    }

    private fun openDialer() {
        val intent = Intent(Intent.ACTION_DIAL)
        startActivity(intent)
    }

    private fun openTexto() {
        val intent = Intent(this, Texto::class.java)
        startActivity(intent)
    }


}