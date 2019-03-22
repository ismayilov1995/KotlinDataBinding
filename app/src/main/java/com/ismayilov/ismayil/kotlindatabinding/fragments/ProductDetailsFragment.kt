package com.ismayilov.ismayil.kotlindatabinding.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ismayilov.ismayil.kotlindatabinding.databinding.FragmentProductDetailsBinding
import com.ismayilov.ismayil.kotlindatabinding.utils.AllProduct

class ProductDetailsFragment : Fragment() {

    val binding : FragmentProductDetailsBinding by lazy {
        FragmentProductDetailsBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val testPro = AllProduct()

        binding.product = testPro.tumProductlerDizisi[1]
        binding.count = 12

        return binding.root
    }


}
