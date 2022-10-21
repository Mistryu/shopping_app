package com.example.shopping_app.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shopping_app.R;

public class storeage_frag extends Fragment {

    public storeage_frag() {
    }

    public static storeage_frag newInstance(String param1, String param2) {
        storeage_frag fragment = new storeage_frag();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.storage_layout, container, false);
    }
}