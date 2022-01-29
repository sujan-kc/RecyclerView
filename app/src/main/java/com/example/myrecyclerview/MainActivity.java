package com.example.myrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myrecyclerview.MyAdapter.Adapter;
import com.example.myrecyclerview.MyModel.Model;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recview);

        ArrayList<Model> arrayList = new ArrayList<>();

        arrayList.add(new Model(R.drawable.abc,984205864,"Mahesh Katwal"));
        arrayList.add(new Model(R.drawable.elon,984205864,"Elon Musk"));
        arrayList.add(new Model(R.drawable.a4,984205864,"Deepika Mainali"));
        arrayList.add(new Model(R.drawable.abc,984205864,"Mahesh Katwal"));
        arrayList.add(new Model(R.drawable.elon,984205864,"Elon Musk"));
        arrayList.add(new Model(R.drawable.a4,984205864,"Deepika Mainali"));
        arrayList.add(new Model(R.drawable.elon,984205864,"Elon Musk"));
        arrayList.add(new Model(R.drawable.a4,984205864,"Deepika Mainali"));
        arrayList.add(new Model(R.drawable.abc,984205864,"Mahesh Katwal"));
        arrayList.add(new Model(R.drawable.elon,984205864,"Elon Musk"));
        arrayList.add(new Model(R.drawable.abc,984205864,"Mahesh Katwal"));
        arrayList.add(new Model(R.drawable.a4,984205864,"Deepika Mainali"));
        arrayList.add(new Model(R.drawable.abc,698959852,"Suman Kharel"));

        Adapter adapter = new Adapter(getApplicationContext(),arrayList);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
    }

}