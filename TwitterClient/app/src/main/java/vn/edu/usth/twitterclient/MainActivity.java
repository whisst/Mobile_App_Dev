package vn.edu.usth.twitterclient;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.astuetz.PagerSlidingTabStrip;
import com.google.android.material.tabs.TabLayout;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PagerAdapter adapter = new HomeFragmentPagerAdapter(getSupportFragmentManager());
        ViewPager pager = (ViewPager) findViewById(R.id.pager);
        pager.setAdapter(adapter);

        PagerSlidingTabStrip tabStrip = findViewById(R.id.tab);
        tabStrip.setViewPager(pager);
    }

    public class HomeFragmentPagerAdapter extends FragmentPagerAdapter {
        private final int PAGE_COUNT = 11;
        private String titles[] = new String[]{"Timeline","Profile","Search","Trend","Reply",
                                                "MyTweets","Likes","DM","Lists","RT of me","Quoted Tweet"};

        public HomeFragmentPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return PAGE_COUNT;
        }

        @Override
        public Fragment getItem(int page) {
            switch (page) {
                case 0:
                    return Timeline.newInstance();
                case 1:
                    return Profile.newInstance();
                case 2:
                    return Search.newInstance();
                case 3:
                    return Trend.newInstance();
                case 4:
                    return Reply.newInstance();
                case 5:
                    return MyTweets.newInstance();
                case 6:
                    return Likes.newInstance();
                case 7:
                    return DM.newInstance();
                case 8:
                    return Lists.newInstance();
                case 9:
                    return RTofme.newInstance();
                case 10:
                    return QuotedTweets.newInstance();
            }
            return new Fragment();
        }

        @Override
        public CharSequence getPageTitle(int page) {
            return titles[page];
        }
    }
}