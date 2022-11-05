package com.ojinc.resumeapp.cv

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ojinc.resumeapp.R


class CvFragment : Fragment() {

    private lateinit var RvCv: RecyclerView
    private lateinit var adapter: CVAdapter
    lateinit var items : List<CVItem>


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        RvCv = view.findViewById(R.id.recyclerview_cv)
        items = arrayListOf(
            CVItem("9 November 2021", getString(R.string.uniccon_exp)),
            CVItem("29 February 2022", getString(R.string.alx)),
            CVItem("30 March 2022", getString(R.string.kodecamp)),
            CVItem("20 October 2020 - December 2020", getString(R.string.cafe)),
        )
        adapter = CVAdapter(items as ArrayList<CVItem>)
        RvCv.layoutManager = LinearLayoutManager(context)
        RvCv.adapter = adapter
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cv, container, false)
    }


}