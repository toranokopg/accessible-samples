package com.example.android.accessible

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment

class PageFragment(private val num: Int) : Fragment(R.layout.fragment_page) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val page = view.findViewById<TextView>(R.id.page)
        page.text = getString(R.string.page, num)
    }
}
