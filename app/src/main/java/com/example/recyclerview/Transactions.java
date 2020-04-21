package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class Transactions extends AppCompatActivity {
    private RecyclerView mrecyclerView;
    private ExampleAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transactions);
        final ArrayList<ExampleItem> exampleList=new ArrayList<>();
        exampleList.add(new ExampleItem(R.mipmap.ic_ration,"Pune Ration Shops","100"));
        exampleList.add(new ExampleItem(R.mipmap.ic_ration,"Latur rations"," 110"));
        exampleList.add(new ExampleItem(R.mipmap.ic_ration,"Govt Shop,Latur","100"));
        exampleList.add(new ExampleItem(R.mipmap.ic_ration,"Pune Shop","100"));
        exampleList.add(new ExampleItem(R.mipmap.ic_ration,"Pune Ration Shops","120"));
        exampleList.add(new ExampleItem(R.mipmap.ic_ration,"Latur rations","110"));
        exampleList.add(new ExampleItem(R.mipmap.ic_ration,"Govt Shop,Latur","100"));
        exampleList.add(new ExampleItem(R.mipmap.ic_ration,"Pune Shop","100"));
        exampleList.add(new ExampleItem(R.mipmap.ic_ration,"Latur rations","110"));
        exampleList.add(new ExampleItem(R.mipmap.ic_ration,"Govt Shop,Latur","100"));
        exampleList.add(new ExampleItem(R.mipmap.ic_ration,"Pune Shop","100"));
        exampleList.add(new ExampleItem(R.mipmap.ic_ration,"Pune Ration Shops","120"));
        exampleList.add(new ExampleItem(R.mipmap.ic_ration,"Latur rations","110"));
        exampleList.add(new ExampleItem(R.mipmap.ic_ration,"Govt Shop,Latur","100"));
        exampleList.add(new ExampleItem(R.mipmap.ic_ration,"Pune Shop","100"));

        mrecyclerView=findViewById(R.id.recyclerView);
        mrecyclerView.setHasFixedSize(true);
        mLayoutManager=new LinearLayoutManager(this);
        mAdapter=new ExampleAdapter(exampleList);
        mrecyclerView.setLayoutManager(mLayoutManager);
        mrecyclerView.setAdapter(mAdapter);
        mAdapter.setOnItemClickListener(new ExampleAdapter.OnItemClickListener() {
            @Override
            public void OnItemClick(int position) {
                Intent intent=new Intent(Transactions.this,TransDetails.class);
                startActivity(intent);
                mAdapter.notifyItemChanged(position);
            }
        });

    }
}
