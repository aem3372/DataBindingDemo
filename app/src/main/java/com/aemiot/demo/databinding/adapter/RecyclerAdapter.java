package com.aemiot.demo.databinding.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aemiot.demo.databinding.R;
import com.aemiot.demo.databinding.databinding.RecyclerItemBinding;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    int[] datas = {0,1,2,3,4,5,6};

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_item, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bind(datas[position]);
    }

    @Override
    public int getItemCount() {
        return datas.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private RecyclerItemBinding binding;

        public ViewHolder(View itemView) {
            super(itemView);
            binding = RecyclerItemBinding.bind(itemView);
        }

        public void bind(int data) {
            binding.setData(data);
        }
    }
}
