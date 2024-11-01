package com.example.bucketlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {

    public ItemAdapter(Item[] items) {
        this.items = items;
    }

    private Item[] items;

    @Override
    public int getItemCount() {
        return items.length;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        holder.bind(items[position]);
    }

    static class ItemViewHolder extends RecyclerView.ViewHolder {
        private ImageView itemImage;
        private TextView itemName;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            itemImage = itemView.findViewById(R.id.image_view_item);
            itemName = itemView.findViewById(R.id.text_view_item_title);
        }

        public void bind(Item item) {
            itemImage.setImageResource(item.image);
            itemName.setText(item.title);
        }
    }

}
