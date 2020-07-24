package com.example.sorinapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class PageAdapterr extends FragmentStateAdapter {

    public PageAdapterr(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        switch (position){
            case 0:
                return new NewsFragment();
            case 1:
                return new LauncherFragment();
            default:
                return new ProductivityFragment();
        }

    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
