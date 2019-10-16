package com.example.presri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_biodata_presiden.*

class Biodata_Presiden : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biodata_presiden)

        val bundle:Bundle?=intent.extras
        val gambar = bundle!!.get("imgPresiden") as Int
        val nama=bundle.get("txtJudul") as String
        val deskripsi=bundle.get("txtDeskripsi") as String

        fotoPresiden.setImageResource(gambar)
        namaPresiden.text=nama
        detailPresiden.text=deskripsi


    }
}
