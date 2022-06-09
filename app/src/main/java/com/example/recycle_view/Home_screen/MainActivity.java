package com.example.recycle_view.Home_screen;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycle_view.R;
import com.example.recycle_view.controller.ModalData;
import com.example.recycle_view.controller.My_Rv_Adapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv_view;
    String[] city = {"surat", "rajkot", "bavnager", "amadavad", "kolkata"};
    String[] code = {"01", "02", "03", "04", "05"};
    int[] cityimage = {
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground
    };

    List<ModalData> l1 = new ArrayList<ModalData>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        blinding();
        for (int i = 0; i < city.length; i++) {

            ModalData modalData = new ModalData(city[i], code[i],cityimage[i]);
            l1.add(modalData);
        }


        My_Rv_Adapter adapter = new My_Rv_Adapter(MainActivity.this, l1);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);

        rv_view.setLayoutManager(layoutManager);
        rv_view.setAdapter(adapter);

    }

    private void blinding() {

        rv_view = findViewById(R.id.rv_view);

    }
}