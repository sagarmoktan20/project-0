package com.example.project0

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        replaceframewithfragment(Home())
        val bottomitem=findViewById<BottomNavigationView>(R.id.bottomnav)
        bottomitem.setOnItemSelectedListener {
            when(it.itemId){
                R.id.item1->replaceframewithfragment(Home())
                R.id.item2->replaceframewithfragment(Search())
                R.id.item3->replaceframewithfragment(Profile())
                else->{

                }
            }
            true
        }


    }

    private fun replaceframewithfragment(frag: Fragment) {
    val fragmentManager=supportFragmentManager
        val fragmenttransaction=fragmentManager.beginTransaction()
        fragmenttransaction.replace(R.id.frame,frag)
        fragmenttransaction.commit()
    }
}