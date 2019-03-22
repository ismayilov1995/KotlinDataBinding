package com.ismayilov.ismayil.kotlindatabinding.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ismayilov.ismayil.kotlindatabinding.databinding.SingleLineLayoutBinding
import com.ismayilov.ismayil.kotlindatabinding.models.Product

class ProductRVadaptor(val allProduct:ArrayList<Product>) : RecyclerView.Adapter<ProductRVadaptor.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding : SingleLineLayoutBinding = SingleLineLayoutBinding.inflate(LayoutInflater.from(parent.context))
        return MyViewHolder(binding)
    }
    override fun getItemCount(): Int {
        return allProduct.size
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.product = allProduct[position]
        holder.binding.executePendingBindings()
    }
    inner class MyViewHolder(var binding: SingleLineLayoutBinding) : RecyclerView.ViewHolder(binding.root)

    fun updateList(newList:ArrayList<Product>){
        allProduct.clear()
        allProduct.addAll(newList)
        notifyDataSetChanged()
    }

}