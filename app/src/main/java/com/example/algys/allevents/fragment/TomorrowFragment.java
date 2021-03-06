package com.example.algys.allevents.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.algys.allevents.R;

public class TomorrowFragment extends AbstractTabFragment {

    private static final int LAYOUT = R.layout.fragment_all;

    public static TomorrowFragment getInstance(Context context){
        Bundle args = new Bundle();
        TomorrowFragment fragment = new TomorrowFragment();
        fragment.setArguments(args);
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.tab_item_tomorrow));
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container,false);
        return view;
    }

    public void setContext(Context context) {
        this.context = context;
    }


}
