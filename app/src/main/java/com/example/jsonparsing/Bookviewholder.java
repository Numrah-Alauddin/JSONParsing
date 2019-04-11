package com.example.jsonparsing;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Bookviewholder extends RecyclerView.ViewHolder {
    TextView id,name,price,writter;
    public Bookviewholder(@NonNull View itemView) {
        super(itemView);
        id=itemView.findViewById(R.id.tv_id);
        name=itemView.findViewById(R.id.tv_name);
        price=itemView.findViewById(R.id.tv_price);
        writter=itemView.findViewById(R.id.tv_writter);
    }
}
