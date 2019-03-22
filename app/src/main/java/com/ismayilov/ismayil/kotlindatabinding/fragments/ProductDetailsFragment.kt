package com.ismayilov.ismayil.kotlindatabinding.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ismayilov.ismayil.kotlindatabinding.databinding.FragmentProductDetailsBinding
import com.ismayilov.ismayil.kotlindatabinding.models.Product

class ProductDetailsFragment : Fragment() {

    val binding : FragmentProductDetailsBinding by lazy {
        FragmentProductDetailsBinding.inflate(layoutInflater)
    }

    lateinit var choosenProduct:Product

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        if (arguments != null){
            choosenProduct = arguments!!.getParcelable("choosen_product")!!
            binding.product = choosenProduct
            binding.count = 1
        }


        return binding.root
    }


}
