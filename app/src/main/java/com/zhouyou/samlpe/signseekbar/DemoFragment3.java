package com.zhouyou.samlpe.signseekbar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import com.zhouyou.view.seekbar.SignSeekBar;

public class DemoFragment3 extends Fragment {

    public static DemoFragment3 newInstance() {
        return new DemoFragment3();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_demo_3, container, false);
        SignSeekBar signSeekBar1 = (SignSeekBar) view.findViewById(R.id.demo_3_seek_bar_1);
        SignSeekBar signSeekBar2 = (SignSeekBar) view.findViewById(R.id.demo_3_seek_bar_2);
        SignSeekBar signSeekBar3 = (SignSeekBar) view.findViewById(R.id.demo_3_seek_bar_3);
        SignSeekBar signSeekBar4 = (SignSeekBar) view.findViewById(R.id.demo_3_seek_bar_4);

        signSeekBar1.getConfigBuilder()
                .min(0)
                .max(50)
                .progress(20)
                .sectionCount(5)
                .trackColor(ContextCompat.getColor(getContext(), R.color.color_gray))
                .secondTrackColor(ContextCompat.getColor(getContext(), R.color.color_blue))
                .thumbColor(ContextCompat.getColor(getContext(), R.color.color_blue))
                .showSectionText()
                .sectionTextColor(ContextCompat.getColor(getContext(), R.color.colorPrimary))
                .sectionTextSize(18)
                .showThumbText()
                .thumbTextColor(ContextCompat.getColor(getContext(), R.color.color_red))
                .thumbTextSize(18)
                //.signColor(ContextCompat.getColor(getContext(), R.color.color_green))
                //.signTextSize(18)
                .showSectionMark()
                .seekBySection()
                .autoAdjustSectionMark()
                .sectionTextPosition(SignSeekBar.TextPosition.BELOW_SECTION_MARK)
                .build();

        signSeekBar2.getConfigBuilder()
                .min(-50)
                .max(50)
                .sectionCount(10)
                .sectionTextInterval(2)
                .trackColor(ContextCompat.getColor(getContext(), R.color.color_red_light))
                .secondTrackColor(ContextCompat.getColor(getContext(), R.color.color_red))
                .seekBySection()
                .showSectionText()
                .sectionTextPosition(SignSeekBar.TextPosition.BELOW_SECTION_MARK)
                .build();

        signSeekBar3.getConfigBuilder()
                .min(1)
                .max(1.5f)
                .floatType()
                .sectionCount(10)
                .secondTrackColor(ContextCompat.getColor(getContext(), R.color.color_green))
                .showSectionText()
                .showThumbText()
                .build();

        signSeekBar4.getConfigBuilder()
                .min(-0.4f)
                .max(0.4f)
                .progress(0)
                .floatType()
                .sectionCount(10)
                .sectionTextInterval(2)
                .showSectionText()
                .sectionTextPosition(SignSeekBar.TextPosition.BELOW_SECTION_MARK)
                .autoAdjustSectionMark()
                .build();

        return view;
    }

}
