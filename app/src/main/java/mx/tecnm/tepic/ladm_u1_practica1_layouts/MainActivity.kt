package mx.tecnm.tepic.ladm_u1_practica1_layouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    plata.setOnClickListener {
    val ventana = Intent(this,ScrollingActivity::class.java)
        startActivity(ventana)
    }
        oro.setOnClickListener {
            val ventana = Intent(this,FullscreenActivity::class.java)
            startActivity(ventana)
        }

    }
}