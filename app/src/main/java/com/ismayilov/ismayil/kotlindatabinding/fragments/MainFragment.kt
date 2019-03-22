package com.ismayilov.ismayil.kotlindatabinding.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ismayilov.ismayil.kotlindatabinding.adapters.ProductRVadaptor
import com.ismayilov.ismayil.kotlindatabinding.databinding.FragmentMainBinding
import com.ismayilov.ismayil.kotlindatabinding.models.Product
import com.ismayilov.ismayil.kotlindatabinding.utils.AllProduct

class MainFragment : Fragment() {

    val binding : FragmentMainBinding by lazy {
        FragmentMainBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val allProduct = AllProduct()
        binding.products = allProduct.tumProductlerDizisi.toCollection(ArrayList<Product>())

        binding.refreshLayout.setOnRefreshListener {
            val newAllProduct = AllProduct()
            ((binding.productRvList.adapter) as ProductRVadaptor).updateList(newAllProduct.tumProductlerDizisi.toCollection(ArrayList<Product>()))
            binding.refreshLayout.isRefreshing = false
        }

        return binding.root
    }


}
