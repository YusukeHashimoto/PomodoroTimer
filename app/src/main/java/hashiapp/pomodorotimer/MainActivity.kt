package hashiapp.pomodorotimer

import android.net.Uri
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar

class MainActivity : AppCompatActivity(), ViewPager.OnPageChangeListener, PageFragment.OnFragmentInteractionListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if(supportActionBar != null)
        getSupportActionBar()!!.hide()

        var toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar);

        var tabLayout = findViewById(R.id.tabs) as TabLayout
        var viewPager = findViewById(R.id.pager) as ViewPager
        val pageTitle = arrayOf("TIMER", "LOG")

        var adapter: FragmentPagerAdapter = object : FragmentPagerAdapter(getSupportFragmentManager()) {
            //override fun getItem(position: Int) = PageFragment.newInstance(position+1)
            override fun getPageTitle(position: Int) = pageTitle[position]
            override fun getCount() = pageTitle.size

            override fun getItem(position: Int): Fragment {
                if(position == 0) return TimerFragment()
                else return PageFragment.newInstance(position+1)
            }
        }

        viewPager.adapter = adapter
        viewPager.addOnPageChangeListener(this)

        tabLayout.setupWithViewPager(viewPager)
    }

    override fun onFragmentInteraction(uri: Uri?) {

    }

    override fun onPageScrollStateChanged(state: Int) {

    }

    override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {

    }

    override fun onPageSelected(position: Int) {

    }
}
