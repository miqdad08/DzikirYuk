package com.haritsdeveloper.dzikiryuk;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterDzikir extends RecyclerView.Adapter<AdapterDzikir.DzikirHolder> {
    ArrayList<ModelDzikir>listData;

    public AdapterDzikir(ArrayList<ModelDzikir>listData){
        this.listData = listData;
    }
    @NonNull
    @Override
    public DzikirHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_list,viewGroup,false);
        return new DzikirHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DzikirHolder dzikirHolder, int i) {

        dzikirHolder.bindView(listData.get(i));

    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public class DzikirHolder extends RecyclerView.ViewHolder {
        private TextView listRecy,listRecyl;

        public DzikirHolder(@NonNull View itemView) {
            super(itemView);
            listRecy = itemView.findViewById(R.id.listRecy);
            listRecyl = itemView.findViewById(R.id.listRecyl);

        }

        public void bindView(ModelDzikir data) {

            listRecy.setText(data.getJudul());
            listRecyl.setText(data.getSubJudul());


        }
    }
}
