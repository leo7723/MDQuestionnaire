package com.netplus.leo.mdtest;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ViewPager vp;
    private QuesViewAdapter adapter;
    private ArrayList<View> pageViews;

    // 底部小点图片
    private ImageView[] dots;
    // 记录当前选中位置
    private int currentIndex;

    private static final int[]img={R.layout.questionaire_layout,R.layout.questionaire_layout,
            R.layout.questionaire_layout,R.layout.questionaire_layout};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pageViews=new ArrayList<View>();
        LayoutInflater inflater=getLayoutInflater();
        // 初始化引导页视图列表
        for (int i = 0; i < img.length; i++) {
            View view = inflater.inflate(img[i], null);
            pageViews.add(view);
        }
        vp = (ViewPager) findViewById(R.id.questionnaire_page);
        // 初始化adapter
        adapter = new QuesViewAdapter(pageViews);
        vp.setAdapter(adapter);
        vp.setOnPageChangeListener(new PageChangeListener());

    }




    private class PageChangeListener implements ViewPager.OnPageChangeListener {
        // 当滑动状态改变时调用
        @Override
        public void onPageScrollStateChanged(int position) {
            // arg0 ==1的时辰默示正在滑动，arg0==2的时辰默示滑动完毕了，arg0==0的时辰默示什么都没做。
        }
        // 当前页面被滑动时调用
        @Override
        public void onPageScrolled(int position, float arg1, int arg2) {
            // arg0 :当前页面，及你点击滑动的页面
            // arg1:当前页面偏移的百分比
            // arg2:当前页面偏移的像素位置
        }
        // 当新的页面被选中时调用
        @Override
        public void onPageSelected(int position) {
            // 设置底部小点选中状态

        }
    }
}
