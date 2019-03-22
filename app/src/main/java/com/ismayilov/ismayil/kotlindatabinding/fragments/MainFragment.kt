package com.ismayilov.ismayil.kotlindatabinding.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
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

        val lm = GridLayoutManager(activity,2)
        val allProduct = AllProduct()
        val mAdapter = ProductRVadaptor(allProduct.tumProductlerDizisi.toCollection(ArrayList<Product>()))
        binding.productRvList.layoutManager = lm
        binding.productRvList.adapter = mAdapter

        binding.refreshLayout.setOnRefreshListener {
            binding.refreshLayout.isRefreshing = false
        }

        return binding.root
    }


}
