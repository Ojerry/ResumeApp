package com.ojinc.resumeapp.sidemenu

import com.ojinc.resumeapp.R


class MenuUtil {
    companion object{
    val HOME_FRAGMENT_CODE = 0
    val CV_FRAGMENT_CODE = 1
    val PORTFOLIO_FRAGMENT_CODE = 2
    val TEAM_FRAGMENT_CODE = 3

//     first menu item is selected
    val menuList: List<MenuItem>
        get() {
            val list: MutableList<MenuItem> = ArrayList()
            // first menu item is selected
            list.add(MenuItem( HOME_FRAGMENT_CODE, R.drawable.ic_baseline_home_24, true))
            list.add(MenuItem( CV_FRAGMENT_CODE, R.drawable.ic_baseline_schedule_24,false))
            list.add(MenuItem( TEAM_FRAGMENT_CODE, R.drawable.ic_baseline_group_24, false))
            list.add(MenuItem( PORTFOLIO_FRAGMENT_CODE, R.drawable.ic_baseline_dashboard_24, false))
            return list
        }
    }
}