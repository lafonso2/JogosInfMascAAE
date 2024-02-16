package com.lourenco.JogosInfMascAAE;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<Game> items = new ArrayList<Game>();
        items.add(new Game("AASM", "AAE", "0-3", "12-25/12-25/16-25", "${Link AASM-AAE CR 1a Fase}", "Scout AASM-AAE CR 1a Fase", R.drawable.aasm, R.drawable.aae));
        items.add(new Game("AAE", "CDP", "3-0", "25-12/26-24/25-14", "Link AAE-CDP CR 1a Fase", "Scout AAE-CDP CR 1a Fase", R.drawable.aae, R.drawable.cdp));
        items.add(new Game("AEA", "AAE", "0-3", "12-25/9-25/11-25", "Link AEA-AAE CR 1a Fase", "Scout AEA-AAE CR 1a Fase", R.drawable.aea, R.drawable.aae));
        items.add(new Game("AAE", "EGC", "3-2", "26-24/25-27/23-25/25-20/16-14", "Link AAE-EGC CR 1a Fase", "Scout AAE-EGC CR 1a Fase", R.drawable.aae, R.drawable.egc));
        items.add(new Game("AAE", "AASM", "3-0", "25-20/25-7/25-20", "Link AAE-AASM CR 1a Fase", "Scout AAE-AASM CR 1a Fase", R.drawable.aae, R.drawable.aasm));
        items.add(new Game("CDP", "AAE", "0-3", "15-25/23-25/12-25", "Link CDP-AAE CR 1a Fase", "Scout CDP-AAE CR 1a Fase", R.drawable.cdp, R.drawable.aae));
        items.add(new Game("AAE", "AEA", "3-0", "25-12/25-10/25-6", "Link AAE-AEA CR 1a Fase", "Scout AAE-AEA CR 1a Fase", R.drawable.aae, R.drawable.aea));
        items.add(new Game("EGC", "AAE", "3-0", "25-22/25-9/25-10", "Link EGC-AAE CR 1a Fase", "Scout EGC-AAE CR 1a Fase", R.drawable.egc, R.drawable.aae));
        items.add(new Game("EGC", "AAE", "0-3", "22-25/17-25/22-25", "Link EGC-AAE CR 2a Fase", "Scout EGC-AAE CR 2a Fase", R.drawable.egc, R.drawable.aae));
        items.add(new Game("AAE", "CMGC", "0-3", "17-25/26-28/23-25", "Link AAE-CMGC CR 2a Fase", "Scout AAE-CMGC CR 2a Fase", R.drawable.aae, R.drawable.cmgc));
        items.add(new Game("LSC", "AAE", "3-1", "15-25/25-19/25-21/25-20", "Link LSC-AAE CR 2a Fase", "Scout LSC-AAE CR 2a Fase", R.drawable.lsc, R.drawable.aae));
        items.add(new Game("SCE", "AAE", "0-3", "9-25/10-25/19-25", "Link SCE-AAE CR 2a Fase", "Scout SCE-AAE CR 2a Fase", R.drawable.sce, R.drawable.aae));
        items.add(new Game("AAE", "CAM", "3-1", "21-25/25-13/25-19/25-20", "Link AAE-CAM CR 2a Fase", "Scout AAE-CAM CR 2a Fase", R.drawable.aae, R.drawable.cam));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new GameAdapter(getApplicationContext(), items));

    }
}