package id.sch.smktelkom_mlg.project2.xirpl10103122130.mobacup.Fragments;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import id.sch.smktelkom_mlg.project2.xirpl10103122130.mobacup.ItemObject;
import id.sch.smktelkom_mlg.project2.xirpl10103122130.mobacup.R;

/**
 * Created by riani on 18/02/2017.
 */

public class NewsAdapter extends BaseAdapter {
    private LayoutInflater layoutinflater;
    private List<ItemObject> listStorage;
    private Context context;

    public NewsAdapter(Context context, List<ItemObject> customizedListView) {
        this.context = context;
        layoutinflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        listStorage = customizedListView;
    }

    @Override
    public int getCount() {
        return listStorage.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder listViewHolder;
        if (convertView == null) {
            listViewHolder = new ViewHolder();
            convertView = layoutinflater.inflate(R.layout.news_list, parent, false);
            listViewHolder.logoTeam = (ImageView) convertView.findViewById(R.id.gambar);
            listViewHolder.judulBerita = (TextView) convertView.findViewById(R.id.judul);
            listViewHolder.deskripsiBerita = (TextView) convertView.findViewById(R.id.deskripsi);

            convertView.setTag(listViewHolder);
        } else {
            listViewHolder = (ViewHolder) convertView.getTag();
        }
        listViewHolder.logoTeam.setImageResource(listStorage.get(position).getGambar());
        listViewHolder.judulBerita.setText(listStorage.get(position).getJudul());
        listViewHolder.deskripsiBerita.setText(listStorage.get(position).getDeskripsi());

        return convertView;
    }

    static class ViewHolder {
        ImageView logoTeam;
        TextView judulBerita;
        TextView deskripsiBerita;
    }
}
