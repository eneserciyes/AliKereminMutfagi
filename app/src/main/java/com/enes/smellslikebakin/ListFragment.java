package com.enes.smellslikebakin;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Enes on 7/3/2016.
 */
public class ListFragment extends Fragment {

    public interface OnRecipeSelectedInterface{
        void onListRecipeSelected(int index);

    }

    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        OnRecipeSelectedInterface listener = (OnRecipeSelectedInterface) getActivity();
        View view = inflater.inflate(R.layout.fragment_recycler_view,container,false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        ListAdapter adapter = new ListAdapter(listener);
        recyclerView.setAdapter(adapter);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(manager);

        return view;
    }
}
