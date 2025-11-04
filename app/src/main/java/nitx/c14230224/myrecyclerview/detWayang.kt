package nitx.c14230224.myrecyclerview

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.squareup.picasso.Picasso

class detWayang : AppCompatActivity() {

    private lateinit var _detFotoWayang: ImageView
    private lateinit var _detNamaWayang: TextView
    private lateinit var _detDetailWayang: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_det_wayang)

        _detFotoWayang = findViewById(R.id.detFotoWayang)
        _detNamaWayang = findViewById(R.id.detNamaWayang)
        _detDetailWayang = findViewById(R.id.detDetailWayang)

        val dataIntent = intent.getParcelableExtra<dcWayang>("kirimData", dcWayang::class.java)

        if (dataIntent != null) {
            Picasso.get()
                .load(dataIntent.foto)
                .into(_detFotoWayang)

            _detNamaWayang.setText(dataIntent.nama)
            _detDetailWayang.setText(dataIntent.deskripsi)
        }
    }
}