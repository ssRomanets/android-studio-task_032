package com.example.task_032

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.webkit.WebView
import android.webkit.WebViewClient
import android.view.View
import android.view.ViewGroup


/**
 * A simple [Fragment] subclass.
 * Use the [ViewPagerFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ViewPagerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_view_pager, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val webViewWV = view.findViewById<WebView>(R.id.webViewWV)
        val viewPagerItem = arguments?.getSerializable("role") as Role

        webViewWV.webViewClient = WebViewClient()
        webViewWV.loadUrl(viewPagerItem.dataUrl.toString())
    }
}