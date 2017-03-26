package com.example.user.lightnovelrecorder;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.widget.Toast;


import com.example.user.lightnovelrecorder.Activity.MainActivity;

import java.util.List;


/**
 * Created by User on 25/3/2017.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.Holder> {

    private LayoutInflater inflater;
    private List<ListItem> listOfItem;

    public Adapter(List<ListItem> listOfItem, Context context) {

        inflater = LayoutInflater.from(context);
        this.listOfItem = listOfItem;

    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        ListItem listItem = listOfItem.get(position);
        holder.text_name.setText(listItem.getName());
        holder.text_progress.setText(listItem.getProgress());

    }

    @Override
    public int getItemCount() {
        return listOfItem.size();
    }

    class Holder extends RecyclerView.ViewHolder {
        TextView text_name, text_progress;
        View container;

        public Holder(View itemView) {
            super(itemView);
            text_name = (TextView) itemView.findViewById(R.id.text_name);
            text_progress = (TextView) itemView.findViewById(R.id.text_progress);
            container = itemView.findViewById(R.id.container);

        }


    }

}
