package com.example.koshik.kidgalleryapp.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.koshik.kidgalleryapp.R;


public class PrivacyFragment extends Fragment {

    public static PrivacyFragment getInstance() {
        return new PrivacyFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.privacy_fragment, container, false);
        TextView myPrivacy = (TextView) view.findViewById(R.id.tvPrivacyText);
        TextView myPrivacyLogoText = (TextView) view.findViewById(R.id.tvPrivacy);
        TextView privacyLinks = (TextView) view.findViewById(R.id.privacylinks);
        privacyLinks.setMovementMethod(LinkMovementMethod.getInstance());

        return view;
    }
}
