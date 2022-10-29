package com.greenscore.kukuapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ChickenItemAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
//    private String[] dataSet;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final LinearLayout chickenItemLayout;

        public ViewHolder(View view) {
            super(view);
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext(), "You have clicked a chicken item", Toast.LENGTH_SHORT).show();
                    //todo: pass a context to this toast method
                }
            });
            chickenItemLayout = (LinearLayout) view.findViewById(R.id.chicken_parent_linear_layout);
        }

        public LinearLayout getLinearLayout() {
            return chickenItemLayout;
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.chicken_item_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        //fetches the appropriate data to fill the view Holders layout
    }

    @Override
    public int getItemCount() {
        return 10;
    }


}
