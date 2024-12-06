package com.example.webview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class GridViewAdapter(private val list: List<GridView>,private val context: Context): BaseAdapter() {

    private var layoutInflater: LayoutInflater? = null
    private lateinit var itemtext: TextView
    private lateinit var itemimage: ImageView


    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(position: Int): Any? {
        return null
    }

    override fun getItemId(position: Int): Long {
       return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

         var convertView = convertView

        if ( layoutInflater == null ) layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        if (convertView == null ) convertView = layoutInflater!!.inflate(R.layout.item,null)

            itemtext = convertView!!.findViewById(R.id.itemText)
            itemimage = convertView.findViewById(R.id.itemImage)

            itemimage.setImageResource(list[position].image)
            itemtext.setText(list[position].name)

        return convertView


    }
}