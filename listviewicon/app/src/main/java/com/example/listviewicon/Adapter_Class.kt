package com.example.listviewicon


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.item.view.*
import java.util.ArrayList

class Adapter:BaseAdapter {
    var listBahasa=ArrayList<Bahasa_Class>()
    var context:Context?=null

    constructor(listBahasa: ArrayList<Bahasa_Class>, context: Context?) : super() {
        this.listBahasa = listBahasa
        this.context = context
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val bahasa=listBahasa[p0]
        var inflator=context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE)as LayoutInflater
        var myView=inflator.inflate(R.layout.item,null)
        myView.imgBahasa.setImageResource(bahasa.gambar!!)
        myView.txtJudul.text=bahasa.nama!!
        myView.txtDeskripsi.text=bahasa.deskripsi!!
        return myView
    }

    override fun getItem(p0: Int): Any {
        return listBahasa[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getCount(): Int {
        return listBahasa.size
    }

}