package com.example.ctrl_pc;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.ctrl_pc.ui.home.HomeFragment;
import com.example.ctrl_pc.ui.slideshow.SlideshowFragment;

import java.util.ArrayList;

public class ViewPageAdapter extends FragmentStateAdapter {
    ArrayList<Fragment> arrayList = new ArrayList<>();
    public ViewPageAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment = new Fragment();
        switch (position)
        {
            case 0:
                fragment = new HomeFragment();
                break;

            case 1:
                fragment = new SlideshowFragment();
                break;

            case 2:
                fragment = new DialogFragment();
                break;
        }

        return arrayList.get(position);
    }
    public int getItemCount() {
        return arrayList.size();
    }

    public void addFragment(Fragment fragment){ arrayList.add(fragment);}
}
