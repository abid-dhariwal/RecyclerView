package com.example.recyclerview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
ArrayList<contactModal> arrcontact=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView=findViewById(R.id.RecyclerV);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        arrcontact.add(new contactModal(R.drawable.a,"A", "03124161185"));
        arrcontact.add(new contactModal(R.drawable.a,"B", "03124161185"));
        arrcontact.add(new contactModal(R.drawable.a,"C", "03124161185"));
        arrcontact.add(new contactModal(R.drawable.a,"D", "03124161185"));
        arrcontact.add(new contactModal(R.drawable.a,"E", "03124161185"));
        contactAdapter adapter=new contactAdapter(this, arrcontact);
        recyclerView.setAdapter(adapter);
    }
}