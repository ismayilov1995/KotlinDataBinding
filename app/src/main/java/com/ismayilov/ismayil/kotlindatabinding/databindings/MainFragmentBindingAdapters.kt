package com.ismayilov.ismayil.kotlindatabinding.databindings

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ismayilov.ismayil.kotlindatabinding.adapters.ProductRVadaptor
import com.ismayilov.ismayil.kotlindatabinding.models.Product

object MainFragmentBindingAdapters {

    @JvmStatic
    @BindingAdapter("showProductList")
    fun showProductList(recyclerView: RecyclerView,productList:ArrayList<Product>){

        if (productList.isEmpty())
            return

        val lm = GridLayoutManager(recyclerView.context,2)
        if (recyclerView.layoutManager == null)
            recyclerView.layoutManager = lm

        val mAdapter = ProductRVadaptor(productList,recyclerView.context)
        if (recyclerView.adapter == null)
            recyclerView.adapter = mAdapter


    }

}