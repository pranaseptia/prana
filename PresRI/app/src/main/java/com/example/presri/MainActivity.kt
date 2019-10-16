package com.example.presri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    var listPresiden= ArrayList<Presiden>()
    var adapter:Adapter?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listPresiden.add(
            Presiden("Ir. Soekarno","Dr. Ir. H. Soekarno adalah Presiden pertama Republik Indonesia yang menjabat pada periode 1945–1967. Ia memainkan peranan penting dalam memerdekakan bangsa Indonesia dari penjajahan Belanda. Ia adalah Proklamator Kemerdekaan Indonesia yang terjadi pada tanggal 17 Agustus 1945.",R.drawable.soekarno)
        )
        listPresiden.add(
            Presiden("Soeharto","Jenderal Besar TNI H. M. Soeharto, adalah Presiden kedua Indonesia yang menjabat dari tahun 1967 sampai 1998, menggantikan Soekarno.",R.drawable.soeharto)
        )
        listPresiden.add(
            Presiden("B.J Habibie","Prof. Dr. Ing. H. Bacharuddin Jusuf Habibie, FREng adalah Presiden Republik Indonesia yang ketiga. Sebelumnya, B.J. Habibie menjabat sebagai Wakil Presiden Republik Indonesia ke-7, menggantikan Try Sutrisno. B. J. Habibie menggantikan Soeharto yang mengundurkan diri dari jabatan presiden pada tanggal 21 Mei 1998.",R.drawable.habibie)
        )
        listPresiden.add(
            Presiden("Dr. K. H. Abdurrahman Wahid ","atau yang akrab disapa Gus Dur adalah tokoh Muslim Indonesia dan pemimpin politik yang menjadi Presiden Indonesia yang keempat dari tahun 1999 hingga 2001. Ia menggantikan Presiden B.J. Habibie setelah dipilih oleh Majelis Permusyawaratan Rakyat hasil Pemilu 1999. ",R.drawable.gusdur)
        )
        listPresiden.add(
            Presiden("Megawati Soekarnoputri","Dr. Hj. Dyah Permata Megawati Setyawati Soekarnoputri atau umumnya lebih dikenal sebagai Megawati Soekarnoputri atau biasa disapa dengan panggilan \"Mbak Mega\" adalah Presiden Indonesia yang kelima yang menjabat sejak 23 Juli 2001 sampai 20 Oktober 2004. ",R.drawable.megawati)
        )
        listPresiden.add(
            Presiden("Susilo Bambang Yudhoyono","Jenderal TNI Prof. Dr. H. Susilo Bambang Yudhoyono, M.A., GCB., AC. adalah Presiden Indonesia ke-6 yang menjabat sejak 20 Oktober 2004 hingga 20 Oktober 2014.Ia adalah Presiden pertama di Indonesia yang dipilih melalui jalur pemilu. Ia, bersama Wakil Presiden Muhammad Jusuf Kalla, terpilih dalam Pemilu Presiden 2004. ",R.drawable.sby)
        )
        listPresiden.add(
            Presiden("Ir. Joko Widodo","Ir. H. Joko Widodo atau Jokowi adalah Presiden ke-7 Indonesia yang mulai menjabat sejak 20 Oktober 2014. Ia terpilih bersama Wakil Presiden Muhammad Jusuf Kalla dalam Pemilu Presiden 2014. ",R.drawable.jokowi)
        )
        adapter= Adapter(listPresiden,this)
        listview.adapter=adapter
    }
}
