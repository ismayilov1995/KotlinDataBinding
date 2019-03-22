package com.ismayilov.ismayil.kotlindatabinding.databindings

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.ismayilov.ismayil.kotlindatabinding.R

object GlideBindingAdapters{

    @JvmStatic
    @BindingAdapter("showPictureGlide")
    fun showPic(imageView:ImageView,imgPath:Int){

        val options =  RequestOptions()
            .placeholder(R.drawable.ic_launcher_background)
            .error(R.drawable.ic_launcher_background)

        Glide.with(imageView.context)
            .setDefaultRequestOptions(options)
            .load(imgPath)
            .into(imageView)

    }


}