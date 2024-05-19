package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class contactAdapter extends RecyclerView.Adapter<contactAdapter.ViewHolder> {
 Context context;
 ArrayList<contactModal> arrcontacts;
 contactAdapter(Context context, ArrayList<contactModal> arrcontacts){
     this.context=context;
     this.arrcontacts=arrcontacts;
 }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
     View view= LayoutInflater.from(context).inflate(R.layout.contact_row,parent,false);
     ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
      holder.img.setImageResource(arrcontacts.get(position).img);
      holder.txtName.setText(arrcontacts.get(position).name);
      holder.txtNumber.setText(arrcontacts.get(position).number);
    }

    @Override
    public int getItemCount() {
        return arrcontacts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
     TextView txtName,txtNumber;
     ImageView img;
         public ViewHolder(View itemView){
             super(itemView);
             txtName=itemView.findViewById(R.id.txtName);
             txtNumber=itemView.findViewById(R.id.txtnumber);
             img=itemView.findViewById(R.id.iv);
         }
    }
}
