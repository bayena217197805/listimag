package com.example.listview1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ArrayList<String> list;

    private ImageView imageView;
    private ArrayList<Integer> imageList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter<String> adapter= new ArrayAdapter<String>
                (this,android.R.layout.simple_list_item_1,list);
        ListView listView = findViewById(R.id.lvSimple);



        list = new ArrayList<>();
        imageView = findViewById(R.id.img);
        list.add("Earth");
        list.add("Mars");
        list.add("Mercury");
        list.add("Venus");

        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
        imageList = new ArrayList<>();
        imageList.add(R.drawable.earth);
        imageList.add(R.drawable.murse);
        imageList.add(R.drawable.venus);
        imageList.add(R.drawable.mars);


        
    }

    public void onItemClick(AdapterView<?>adapterView,View view,int i,long id){

        Toast.makeText(this, "Click: "+list.get(i), Toast.LENGTH_SHORT).show();
        imageView.setImageResource(imageList.get(i));
    }


}