package id.sch.smktelkom_mlg.project2.xirpl10103122130.mobacup.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import id.sch.smktelkom_mlg.project2.xirpl10103122130.mobacup.ItemObject;
import id.sch.smktelkom_mlg.project2.xirpl10103122130.mobacup.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Team extends Fragment {


    public Team() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_team, container, false);
        GridView gridview = (GridView) view.findViewById(R.id.gridview);

        List<ItemObject> allItems = getAllItemObject();
        TeamAdapter teamAdapter = new TeamAdapter(getActivity(), allItems);
        gridview.setAdapter(teamAdapter);

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(), "Position: " + position, Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

    private List<ItemObject> getAllItemObject() {
        List<ItemObject> items = new ArrayList<>();
        items.add(new ItemObject(R.drawable.a1, "Bima Perkasa Jogja", ""));
        items.add(new ItemObject(R.drawable.a2, "CLS KNIGHT SURABAYA", ""));
        items.add(new ItemObject(R.drawable.a3, "Bank BJB GARUDA BANDUNG", ""));
        items.add(new ItemObject(R.drawable.a4, "Hangtuah Sumsel", ""));
        items.add(new ItemObject(R.drawable.a5, "JNE Siliwangi Bandung", ""));
        items.add(new ItemObject(R.drawable.a6, "NSH Jakarta", ""));
        items.add(new ItemObject(R.drawable.a7, "Pacific Caesar Surabaya", ""));
        items.add(new ItemObject(R.drawable.a8, "Pelita Jaya", ""));
        items.add(new ItemObject(R.drawable.a9, "Satria Muda Pertamina Jakarta", ""));
        items.add(new ItemObject(R.drawable.a10, "Satya Wacana Salatiga", ""));
        items.add(new ItemObject(R.drawable.a11, "W88.News Aspac Jakarta", ""));
        return items;
    }
}
