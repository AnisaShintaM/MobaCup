package id.sch.smktelkom_mlg.project2.xirpl10103122130.mobacup;


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

/**
 * A simple {@link Fragment} subclass.
 */
public class News extends Fragment {


    public News() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_news, container, false);
        GridView gridview = (GridView) view.findViewById(R.id.gridview);

        List<ItemObject> allItems = getAllItemObject();
        NewsAdapter newsAdapter = new NewsAdapter(getActivity(), allItems);
        gridview.setAdapter(newsAdapter);

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
        items.add(new ItemObject(R.drawable.a1, "Metamorfosis Bimasakti Malang", "Kompetisi bola basket Indonesian " +
                "Basketball League (IBL) 2017, menjadi pembuktian bagi klub Bima Perkasa Jogjakarta. " +
                "Klub metamorfosis dari Bimasakti Malang yang berpindah homebase ke Jogja ini menargetkan "));
        items.add(new ItemObject(R.drawable.a2, "CLS Knights Surabaya Sang Juara", "CLS Knights Surabaya menunjukkan tajinya sebagai juara bertahan " +
                "IBL. CLS berhasil menghantam salah satu kandidat juara W88.news Aspac 77-49 pada seri ketiga IBL " +
                "2017 di GOR Sahabat Semarang, Minggu (12/2/2017) "));
        items.add(new ItemObject(R.drawable.a3, "Sejarah Tidak Akan Dilupakan", "Garuda Bandung Basket Ball memiliki sejarah yang panjang. " +
                "Tim Bola Basket asal Jawa Barat yang berlaga di Liga Profesional ini sebelumnya bernama HADTEX " +
                "Indosyntec Bandung yang didirikan tahun 1991, kemudian pada tahun 1995-2003 berubah lagi menjadi " +
                "Panasia Indosyntec setelah itu tahun 2003-2004 menjadi Panasia Senatama, seiring prestasi kemudian " +
                "tahun 2004-2006 berubah menjadi Garuda Bandung."));
        items.add(new ItemObject(R.drawable.a4, "HANGTUAH SUMSEL Latihan Perdana", "Hangtuah Sumsel belum " +
                "kunjung menggelar latihan bersama. Rencananya, mereka baru akan memulainya pada bulan " +
                "September ini. Akan tetapi, latihan tersebut nantinya hanya akan berlangsung tiga kali " +
                "seminggu, serta diikuti oleh para pemain muda saja."));
        return items;
    }

}
