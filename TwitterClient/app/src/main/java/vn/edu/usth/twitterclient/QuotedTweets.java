package vn.edu.usth.twitterclient;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class QuotedTweets extends Fragment {
    public static QuotedTweets newInstance() {
        QuotedTweets fragment = new QuotedTweets();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_quoted_tweets, container, false);
    }
}
