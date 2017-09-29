package com.openkotlin.tanck.kotlindemo

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by Administrator on 9/28/2017.
 */

class MyRecyclerViewAdapter(cotext: Context, items: List<String>) : RecyclerView.Adapter<MyRecyclerViewAdapter.MyViewHolder>() {

    override fun onBindViewHolder(holder: MyViewHolder?, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    class MyViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
       var myTextview = itemView;
    }
}