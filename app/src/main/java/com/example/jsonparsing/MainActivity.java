package com.example.jsonparsing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView book_id;
    TextView book_name;
    TextView book_price;
    TextView book_writer;
    String bookdata="";

    ArrayList<book> books;
    Adapterbook adapterbook;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.rec_list);
        books=new ArrayList<>();
        adapterbook=new Adapterbook(books,this);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapterbook);
       /* book_id = findViewById(R.id.book_id);
        book_name = findViewById(R.id.book_name);
        book_price = findViewById(R.id.book_price);
        book_writer = findViewById(R.id.book_writer);*/

        String json = "{\n" +
                "\n" +
                "\t\"Books\":\n" +
                "\t\t{\n" +
                "\n" +
                "\t\t\"id\":101,\n" +
                "\t\t\"name\":\"Android\",\n" +
                "\t\t\"price\":100,\n" +
                "\t\t\"writer\":\"Numrah\"\n" +
                "\t\t}\n" +
                "\n" +
                "}\n" +
                "\n";

        String json2 = "{\n" +
                "\n" +
                "\t\"Books\":\n" +
                "[\n" +
                "\t\t{\n" +
                "\n" +
                "\t\t\"id\":101,\n" +
                "\t\t\"name\":\"Android\",\n" +
                "\t\t\"price\":100,\n" +
                "\t\t\"writer\":\"Numrah\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\n" +
                "\t\t\"id\":102,\n" +
                "\t\t\"name\":\"Java\",\n" +
                "\t\t\"price\":200,\n" +
                "\t\t\"writer\":\"Nuzhat\"\n" +
                "\t\t},\n" +
                "\n" +
                "\t\t{\n" +
                "\n" +
                "\t\t\"id\":103,\n" +
                "\t\t\"name\":\"Kotlin\",\n" +
                "\t\t\"price\":500,\n" +
                "\t\t\"writer\":\"Arbaz\"\n" +
                "\t\t}\n" +
                "\n" +
                "]\n" +
                "}\n" +
                "\n";
        //Single Object
       /* try {
            JSONObject jsonObject = new JSONObject(json);
            JSONObject bookObj = jsonObject.getJSONObject("Books");

            int id = bookObj.getInt("id");
            String name = bookObj.getString("name");
            String writer = bookObj.getString("writer");
            int price = bookObj.getInt("price");

            book_id.setText(String.valueOf(id));
            book_name.setText(name);
            book_writer.setText(writer);
            book_price.setText(String.valueOf(price));


        } catch (JSONException e) {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }*/

       //Array
        try {
            JSONObject jsonObject = new JSONObject(json2);
            JSONArray bookObj = jsonObject.getJSONArray("Books");

            for (int i=0 ; i<bookObj.length(); i++){

                JSONObject book=bookObj.getJSONObject(i);
                int id = book.getInt("id");
                String name = book.getString("name");
                String writer = book.getString("writer");
                int price = book.getInt("price");


                books.add(new book(id,price,name,writer));
                adapterbook.notifyDataSetChanged();

              /*  book_id.setText(String.valueOf(id));
                book_name.setText(name);
                book_writer.setText(writer);
                book_price.setText(String.valueOf(price));*/


                //bookdata+=id+" "+name+" "+price+" "+writer;

            }


        //book_id.setText(bookdata);


        } catch (JSONException e) {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }

    }
}

