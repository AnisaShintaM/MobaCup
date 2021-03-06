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

public class TeamAdapter extends BaseAdapter {
    private LayoutInflater layoutinflater;
    private List<ItemObject> listStorage;
    private Context context;

    public TeamAdapter(Context context, List<ItemObject> customizedListView) {
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
            convertView = layoutinflater.inflate(R.layout.team_list, parent, false);
            listViewHolder.logoTeam = (ImageView) convertView.findViewById(R.id.gambar);
            listViewHolder.nameTeam = (TextView) convertView.findViewById(R.id.namaTeam);

            convertView.setTag(listViewHolder);
        } else {
            listViewHolder = (ViewHolder) convertView.getTag();
        }
        listViewHolder.logoTeam.setImageResource(listStorage.get(position).getGambar());
        listViewHolder.nameTeam.setText(listStorage.get(position).getJudul());

        return convertView;
    }

    static class ViewHolder {
        ImageView logoTeam;
        TextView nameTeam;
    }
}
