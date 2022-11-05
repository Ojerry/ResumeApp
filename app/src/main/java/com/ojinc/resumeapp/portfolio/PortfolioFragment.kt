package com.ojinc.resumeapp.portfolio


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ojinc.resumeapp.R


class PortfolioFragment : Fragment(), PortfolioCallback {
    lateinit var mdata: List<PortfolioItem>
    lateinit var rv_portfolio: RecyclerView
    lateinit var portfolioAdapter: PortfolioAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_portfolio, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    rv_portfolio = view.findViewById(R.id.rv_portfolio)

    mdata = ArrayList()
    (mdata as ArrayList<PortfolioItem>).add(PortfolioItem("P1", "second", R.drawable.ic_baseline_location_on_24))
    (mdata as ArrayList<PortfolioItem>).add(PortfolioItem("P2", "second", R.drawable.ic_baseline_location_on_24))
    (mdata as ArrayList<PortfolioItem>).add(PortfolioItem("P3", "second", R.drawable.ic_baseline_location_on_24))
    (mdata as ArrayList<PortfolioItem>).add(PortfolioItem("P4", "second", R.drawable.ic_baseline_location_on_24))
    (mdata as ArrayList<PortfolioItem>).add(PortfolioItem("P5", "second", R.drawable.ic_baseline_location_on_24))
    (mdata as ArrayList<PortfolioItem>).add(PortfolioItem("P6", "second", R.drawable.ic_baseline_location_on_24))
    (mdata as ArrayList<PortfolioItem>).add(PortfolioItem("P7", "second", R.drawable.ic_baseline_location_on_24))
    (mdata as ArrayList<PortfolioItem>).add(PortfolioItem("P8", "second", R.drawable.ic_baseline_location_on_24))
    (mdata as ArrayList<PortfolioItem>).add(PortfolioItem("P9", "second", R.drawable.ic_baseline_location_on_24))
//        mdata = arrayListOf()
//        (mdata as ArrayList<PortfolioItem>).add(PortfolioItem)



    portfolioAdapter = PortfolioAdapter(mdata as ArrayList<PortfolioItem>, this)
    rv_portfolio.layoutManager = GridLayoutManager(activity, 3)
    rv_portfolio.adapter = portfolioAdapter
}

    override fun onPortfolioItemClick(pos: Int) {
//        Handle click when portfolio item is clicked
//        create fragment bottom sheet instance
        var portfolioFragmentDetails = PortfolioFragmentDetails()
//        send portfolio item to portfolio dialog fragment
//        use of bundle
//        implement Serializable interface on portfolio item class

        var bundle = Bundle()
        bundle.putSerializable("object", mdata[pos])
        portfolioFragmentDetails.arguments = bundle

//        open bottom sheet fragment
//        portfolioFragmentDetails.show(activity.getSupportFragmentManager(), "tagname")
        activity?.let { portfolioFragmentDetails.show(it.getSupportFragmentManager(), "tagname") }
    }
}


