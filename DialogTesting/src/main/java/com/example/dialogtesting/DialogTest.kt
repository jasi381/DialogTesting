package com.example.dialogtesting

import android.app.Dialog
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import com.google.android.material.button.MaterialButton


//this class will be inherited by linear layout
class DialogTest(var mContext :Context): ConstraintLayout(mContext) {

    //this function will be called to show dialog
//    fun showDialog() {
//        val dialog = Dialog(mContext)
//        dialog.setContentView(R.layout.dialog_items)
//        dialog.show()
//    }

    fun setTitleAndBody(title: String,body: String) {


        val dialog = Dialog(mContext)
        dialog.setContentView(R.layout.dialogs)
        val titleText = dialog.findViewById<TextView>(R.id.dialogTitle)
        val bodyText = dialog.findViewById<TextView>(R.id.dialogBody)
        titleText.text = title
        bodyText.text = body

        // val positiveBtn = dialog.findViewById<>

        val positiveBtn = dialog.findViewById<MaterialButton>(R.id.dialogButton1)
        val negative = dialog.findViewById<MaterialButton>(R.id.dialogButton2)

        positiveBtn.text = "OK"
        negative.text = "Cancel"

        // text color of positive button
        positiveBtn.setTextColor(ContextCompat.getColor(mContext,R.color.purple_500))

        //background color of positive button
        positiveBtn.setBackgroundDrawable(ContextCompat.getDrawable(mContext,R.drawable.clicked))


        //background color of negative button
        negative.setBackgroundDrawable(ContextCompat.getDrawable(mContext,R.drawable.disabled))
        dialog.show()


    }
    //custom layout for dialog
    fun setContentLayout(layout: Int) {
        val dialog = Dialog(mContext)
        dialog.setContentView(layout)
        dialog.show()
    }

}
