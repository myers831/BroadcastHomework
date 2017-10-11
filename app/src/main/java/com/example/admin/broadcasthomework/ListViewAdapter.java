package com.example.admin.broadcasthomework;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by Admin on 10/11/2017.
 */

public class ListViewAdapter extends ArrayAdapter<FourD> {
    public ListViewAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull FourD[] objects) {

        super(context, resource, objects);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;

        if (view == null) {

            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, null);

        }


        TextView tvX = view.findViewById(R.id.tvX);
        TextView tvY = view.findViewById(R.id.tvY);
        TextView tvZ = view.findViewById(R.id.tvZ);
        TextView tvT = view.findViewById(R.id.tvT);

        FourD fourD = getItem(position);


        tvX.setText("Xaxis: " + String.valueOf(fourD.getXaxis()));
        tvY.setText("Yaxis: " +String.valueOf(fourD.getYaxis()));
        tvZ.setText("Zaxis: " +String.valueOf(fourD.getZaxis()));
        tvT.setText("Galactic Time: " +String.valueOf(fourD.getTime()));

        return view;

    }
}
