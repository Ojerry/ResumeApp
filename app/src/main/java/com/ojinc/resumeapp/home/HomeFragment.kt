package com.ojinc.resumeapp.home

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.ojinc.resumeapp.R

class HomeFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fb_link: ImageView = view.findViewById(R.id.facebook_link)
        val twitter_link: ImageView = view.findViewById(R.id.twitter_link)
        val telegram_link: ImageView = view.findViewById(R.id.telegram_link)
        fb_link.setOnClickListener { openSocialLinks("https://facebook.com/onotuumoru") }
        twitter_link.setOnClickListener { openSocialLinks("https://twitter.com/OnotuJU") }
        telegram_link.setOnClickListener { openSocialLinks("https://telegram.com/07037816672") }
    }


    fun openSocialLinks(url: String){
        val openURL = Intent(Intent.ACTION_VIEW)
        openURL.data = Uri.parse(url)
        startActivity(openURL)
    }
}