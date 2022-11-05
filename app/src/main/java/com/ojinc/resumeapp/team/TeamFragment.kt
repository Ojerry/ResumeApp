package com.ojinc.resumeapp.team

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ojinc.resumeapp.R
import com.ojinc.resumeapp.cv.CVAdapter
import com.ojinc.resumeapp.cv.CVItem


class TeamFragment : Fragment() {

    private lateinit var RvTeam: RecyclerView
    private lateinit var adapter: TeamAdapter
    lateinit var mdata : List<TeamItem>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_team, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        RvTeam = view.findViewById(R.id.rv_team)
        //create list of team items
        val item: TeamItem = TeamItem("Mobile Development", "With a knowledge of the fundamental processes with regards to mobile development, I can be tasked with full confidence, to deliver and maintain and deploy top shelf quality mobile app software.", R.drawable.ic_baseline_location_on_24)
        val item2: TeamItem = TeamItem("Full-Stack Web Development", "A consistent solo-developer or an irreplaceable web-stack team member, I would provide professional grade services, consistent delivery and hassle free deployment, whether in a team or stand-alone", R.drawable.ic_baseline_location_on_24)
        val item3: TeamItem = TeamItem("Excellence and Growth-Mindset", "Also important in every aspects of life, is ATTITUDE. I bring a can do and scalable mindset to every project i work on.", R.drawable.ic_baseline_location_on_24)

        mdata = arrayListOf()
        (mdata as ArrayList<TeamItem>).add(item)
        (mdata as ArrayList<TeamItem>).add(item2)
        (mdata as ArrayList<TeamItem>).add(item3)


        RvTeam.layoutManager = LinearLayoutManager(context)
        adapter = TeamAdapter(mdata as ArrayList<TeamItem>)
        RvTeam.adapter = adapter
    }
}