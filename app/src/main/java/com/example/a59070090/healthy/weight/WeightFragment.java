package com.example.a59070090.healthy.weight;

import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.annotation.Nullable;
import android.widget.ListView;

import java.util.ArrayList;

//import com.example.a59070090.healthy.R;

/**
 * Created by LAB203_04 on 27/8/2561.
 */

public class WeightFragment extends Fragment {
    ArrayList<Weight> weights = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.fragment_weight, container, false);
        return null;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        weights.add((new Weight("01 Jan 2018",63,"UP")));
        weights.add((new Weight("02 Jan 2018",63,"UP")));
        weights.add((new Weight("03 Jan 2018",63,"UP")));

//        ListView weightList = (ListView) getView().findViewById(R.id.weight_list);
//        WeightAdapter weightAdapter = new WeightAdapter(getActivity(), android.R.layout.fragment_weight_item,weights);
//        weightList.s;
    }
}
