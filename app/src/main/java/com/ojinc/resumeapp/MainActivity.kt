package com.ojinc.resumeapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Switch
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.app.AppCompatDelegate.MODE_NIGHT_NO
import androidx.appcompat.app.AppCompatDelegate.MODE_NIGHT_YES
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.switchmaterial.SwitchMaterial
import com.ojinc.resumeapp.cv.CvFragment
import com.ojinc.resumeapp.home.HomeFragment
import com.ojinc.resumeapp.portfolio.PortfolioFragment
import com.ojinc.resumeapp.sidemenu.Callback
import com.ojinc.resumeapp.sidemenu.MenuAdapter
import com.ojinc.resumeapp.sidemenu.MenuItem
import com.ojinc.resumeapp.sidemenu.MenuUtil
import com.ojinc.resumeapp.team.TeamFragment


class MainActivity : AppCompatActivity(), Callback {

    private lateinit var menuRv: RecyclerView
    private lateinit var adapter: MenuAdapter
    private lateinit var menuItems: List<MenuItem>
    private var selectedMenuPos = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM
        val switch: SwitchMaterial = findViewById(R.id.switch_bg)
        switch.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked){
                AppCompatDelegate.setDefaultNightMode(MODE_NIGHT_YES)
            }else{
                AppCompatDelegate.setDefaultNightMode(MODE_NIGHT_NO)
            }

        }

        setupSideMenu()
        setHomeFragment()
//        setCvFragment()
//        setTeamFragment()
//        setPortfolioFragment()
//        onResume()
//        onRestoreInstanceState(Bundle())
//        onPause()
//        onSaveInstanceState(Bundle())
//        onStop()
//        onRestart()
//        onDestroy()
    }

    private fun setupSideMenu() {
        menuRv = findViewById(R.id.rv_side_menu)
//        val HOME_FRAGMENT_CODE = 0
//        val CV_FRAGMENT_CODE = 1
//        val PORTFOLIO_FRAGMENT_CODE = 2
//        val TEAM_FRAGMENT_CODE = 3
//
//        val menuList: List<MenuItem>
////        menuList = arrayListOf(
//            MenuItem( HOME_FRAGMENT_CODE, R.drawable.ic_baseline_home_24, true),
//            MenuItem( CV_FRAGMENT_CODE, R.drawable.ic_baseline_schedule_24, false),
//            MenuItem( TEAM_FRAGMENT_CODE, R.drawable.ic_baseline_group_24, false),
//            MenuItem( PORTFOLIO_FRAGMENT_CODE, R.drawable.ic_baseline_dashboard_24, false)
//        )


        menuItems = MenuUtil.menuList
        menuRv.layoutManager = LinearLayoutManager(this)
        adapter = MenuAdapter(menuItems as ArrayList<MenuItem>, this)
        menuRv.adapter = adapter
    }

    private fun setPortfolioFragment(){
        supportFragmentManager.beginTransaction().replace(R.id.container, PortfolioFragment()).commit()
    }

    private fun setTeamFragment(){
        supportFragmentManager.beginTransaction().replace(R.id.container, TeamFragment()).commit()
    }

    private fun setCvFragment(){
        supportFragmentManager.beginTransaction().replace(R.id.container, CvFragment()).commit()
    }

    private fun setHomeFragment(){
        supportFragmentManager.beginTransaction().replace(R.id.container, HomeFragment()).commit()
    }

    override fun onSideMenuItemClick(i: Int) {
        when (menuItems[i].code) {
            MenuUtil.HOME_FRAGMENT_CODE -> setHomeFragment()
            MenuUtil.CV_FRAGMENT_CODE -> setCvFragment()
            MenuUtil.TEAM_FRAGMENT_CODE -> setTeamFragment()
            MenuUtil.PORTFOLIO_FRAGMENT_CODE -> setPortfolioFragment()
            else -> setHomeFragment()
        }

//        empahize selected item
        menuItems[selectedMenuPos].isSelected = false
        menuItems[i].isSelected = true
        selectedMenuPos = i
        adapter.notifyDataSetChanged()
//        menuItems[i].isSelected = true
//        adapter.notifyDataSetChanged()
    }

//    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
//        super.onRestoreInstanceState(savedInstanceState)
//    }
//    override fun onResume() {
//        super.onResume()
//    }
//
//    override fun onPause() {
//        super.onPause()
//    }
//
//    override fun onSaveInstanceState(outState: Bundle) {
//        super.onSaveInstanceState(outState)
//    }
//    override fun onStop() {
//        super.onStop()
//    }
//
//    override fun onRestart() {
//        super.onRestart()
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//    }


}