package com.example.dialogtesting

import android.app.Activity
import android.app.Dialog
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.RelativeLayout


//this class will be inherited by linear layout
class CarnotDialog(private var context: Activity) {

    init {
        val dialog = Dialog(context)
        dialog.setContentView(R.layout.carnot_dialog)
        dialog.setTitle("Title here")

        val relativeLayout = dialog.findViewById<RelativeLayout>(R.id.container)
//        val layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
//        relativeLayout.addView(R.layout.tmp_layout)

        val inflater = LayoutInflater.from(context)


        val view = inflater.inflate(R.layout.tmp_layout_2,null)

        val inflatedLayout = inflater.inflate(R.layout.tmp_layout,view as ViewGroup,false)

        relativeLayout.addView(inflatedLayout)
        dialog.show()

    }

}
