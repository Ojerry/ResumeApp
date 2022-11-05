package com.ojinc.resumeapp.portfolio


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.ojinc.resumeapp.R

class PortfolioFragmentDetails : BottomSheetDialogFragment() {
    private lateinit var imgPortfolio: ImageView
    private lateinit var title: TextView
    private lateinit var description: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_portfolio_details, container, false)
    }

    override fun onViewCreated(view: View,  savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        imgPortfolio = view.findViewById(R.id.portfolio_details_img)
        title = view.findViewById(R.id.portfolio_details_title)
        description = view.findViewById(R.id.portfolio_details_desc)

        // first we need to get our portfolio object from the bundle we have sent
        val bundle = arguments
        val item = bundle!!.getSerializable("object") as PortfolioItem?

        // now we have the item we need just to load it
        if (item != null) {
            loadPortfolioData(item)
        }
    }

    fun loadPortfolioData(item: PortfolioItem) {
        Glide.with(requireContext()).load(item.image).into(imgPortfolio)
        // bind title and description ...
    }
}