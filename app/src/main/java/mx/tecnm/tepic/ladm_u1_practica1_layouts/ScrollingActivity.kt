package mx.tecnm.tepic.ladm_u1_practica1_layouts

import android.os.Bundle
import android.widget.Toast
import com.google.android.material.appbar.CollapsingToolbarLayout
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_scrolling.*
import mx.tecnm.tepic.ladm_u1_practica1_layouts.databinding.ActivityScrollingBinding

class ScrollingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityScrollingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityScrollingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(findViewById(R.id.toolbar))
        binding.toolbarLayout.title = title
        binding.fab.setOnClickListener { view ->
            Snackbar.make(view, "#NoMeReprouebesBenigno", Snackbar.LENGTH_LONG)
                .setAction("Sorbete de Limón", null).show()
        }
        fab.setOnClickListener {
            Toast.makeText(this, "#NoMeRepruebesBenigno", Toast.LENGTH_LONG).show()
        }
    }
}