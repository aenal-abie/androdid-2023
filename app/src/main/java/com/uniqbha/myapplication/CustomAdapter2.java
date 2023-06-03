package com.uniqbha.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.uniqbha.myapplication.DataItem;
import com.uniqbha.myapplication.R;

import java.util.List;

public class CustomAdapter2 extends RecyclerView.Adapter<CustomAdapter2.ViewHolder> {

    private Context context;
    private List<DataItem> dataItems;

    public CustomAdapter2(Context context, List<DataItem> dataItems) {
        this.context = context;
        this.dataItems = dataItems;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        DataItem dataItem = dataItems.get(position);

        holder.iconImageView.setImageResource(dataItem.getIcon());
        holder.androidNameTextView.setText(dataItem.getAndroidName());
        holder.versionTextView.setText(dataItem.getVersion());
    }

    @Override
    public int getItemCount() {
        return dataItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView iconImageView;
        TextView androidNameTextView;
        TextView versionTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            iconImageView = itemView.findViewById(R.id.iconImageView);
            androidNameTextView = itemView.findViewById(R.id.androidNameTextView);
            versionTextView = itemView.findViewById(R.id.versionTextView);
        }
    }
}
