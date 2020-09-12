package com.dratius.gads

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.dratius.gads.ui.main.SectionsPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_leader_board.*

class LeaderBoardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leader_board)

        TabLayoutMediator(tabs, view_pager) {tab, position ->
            when(position) {
                0 -> {
                    tab.text = "Top Hours"
                }
                1 -> {
                    tab.text = "Most Skilled"
                }
            }
        }.attach()
    }
}