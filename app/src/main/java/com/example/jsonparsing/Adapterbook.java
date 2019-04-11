package com.example.jsonparsing;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class Adapterbook extends RecyclerView.Adapter<Bookviewholder> {

    ArrayList<book> books;
    Context context1;

    public Adapterbook(ArrayList<book> books, Context context1) {
        this.books = books;
        this.context1 = context1;
    }

    @NonNull
    @Override
    public Bookviewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context1).inflate(R.layout.bookitems, viewGroup, false);
        Bookviewholder bookViewHolder = new Bookviewholder(view);
        return bookViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Bookviewholder bookviewholder, int i) {
      book bookview = books.get(i);
        bookviewholder.id.setText(String.valueOf(bookview.getBookId()));
        bookviewholder.name.setText(String.valueOf(bookview.getBookname()));
        bookviewholder.price.setText(String.valueOf(bookview.getPrice()));
        bookviewholder.writter.setText(String.valueOf(bookview.getWritter()));
    }

    @Override
    public int getItemCount() {
        return books.size();
    }
}
