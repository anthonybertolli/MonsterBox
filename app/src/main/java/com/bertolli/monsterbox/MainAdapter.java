package com.bertolli.monsterbox;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bertolli.monsterbox.data.Monster;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by h205p3 on 2/2/16.
 */
public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {

    Context context;

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    private OnItemClickListener onItemClickListener;
    public static final String baseImgUrl = "https://www.padherder.com";

    public MainAdapter(Context context) {
        this.context = context;
    }

    List<Monster> data = new ArrayList<>();

    public void setData(List<Monster> data) {
        this.data.clear();
        this.data.addAll(data);
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_main,parent,false);
        ViewHolder viewHolderMain = new ViewHolder(view);
        return viewHolderMain;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Monster monster = data.get(position);
        holder.textView.setText(monster.getName());
        holder.textViewId.setText("No." + monster.getId().toString());
        Picasso.with(context).load(baseImgUrl + monster.getImage60Href()).into(holder.monsterImageView);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView textView;
        TextView textViewId;
        ImageView monsterImageView;
        public ViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            textView =  (TextView) itemView.findViewById(R.id.list_textview);
            textViewId = (TextView) itemView.findViewById(R.id.list_idview);
            monsterImageView = (ImageView) itemView.findViewById(R.id.list_imageview);

        }

        @Override
        public void onClick(View v) {
            if(onItemClickListener != null) {
                onItemClickListener.onClick(data.get(getAdapterPosition()), v);
            }
        }
    }

    public interface OnItemClickListener{
        void onClick(Monster monster, View v);
    }
}
