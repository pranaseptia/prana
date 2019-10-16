package com.example.presri

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.item.view.*
import java.util.ArrayList

class Adapter(val listPresiden: ArrayList<Presiden>, val context: Context?) : BaseAdapter() {

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val presiden=listPresiden[p0]
        val inflator=context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE)as LayoutInflater
        val myView=inflator.inflate(R.layout.item,null)
        myView.imgPresiden.setImageResource(presiden.gambar!!)
        myView.txtJudul.text=presiden.nama!!
        myView.txtDeskripsi.text=presiden.deskripsi!!
        myView.setOnClickListener {
            val intent=Intent(context,Biodata_Presiden::class.java)
            intent.putExtra("imgPresiden",presiden.gambar!!)
            intent.putExtra("txtJudul",presiden.nama!!)
            intent.putExtra("txtDeskripsi",presiden.deskripsi!!)
            context.startActivity(intent)
        }
        return myView
    }

    override fun getItem(p0: Int): Any {
        return listPresiden[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getCount(): Int {
        return listPresiden.size
    }

}