package com.example.listviewicon
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    var listBahasa=ArrayList<Bahasa_Class>()
    var adapter:Adapter?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listBahasa.add(
            Bahasa_Class("Ruby","Ruby is an open source and fully object oriented programing language.",R.drawable.logoruby)
        )
        listBahasa.add(
            Bahasa_Class("Rails","Ruby on Rails is a server-side web application development framework written is Ruby language.",R.drawable.rails)
        )
        listBahasa.add(
            Bahasa_Class("Python","Python is interpreted scripting and object-oriented programming language.",R.drawable.python)
        )
        listBahasa.add(
            Bahasa_Class("Java Script","JavaScript is an object-based scripting language.",R.drawable.javascript)
        )
        listBahasa.add(
            Bahasa_Class("PHP","PHD is an interpreted language, Le, there is no need for compilation.",R.drawable.php)
        )
        adapter= Adapter(listBahasa,this)
        listview.adapter= adapter as com.example.listviewicon.Adapter
    }
}