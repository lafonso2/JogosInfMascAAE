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

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    String[] teamA = {
            "AASM",
            "AAE",
            "AEA",
            "AAE",
            "AAE",
            "CDP",
            "AAE",
            "EGC",
            "EGC",
            "AAE",
            "LSC",
            "SCE",
            "AAE",
    };
    String[] teamB = {
            "AAE",
            "CDP",
            "AAE",
            "EGC",
            "AASM",
            "AAE",
            "AEA",
            "AAE",
            "AAE",
            "CMGC",
            "AAE",
            "AAE",
            "CAM",
    };
    String[] gameResultSets = {
            "0-3",
            "3-0",
            "0-3",
            "3-2",
            "3-0",
            "0-3",
            "3-0",
            "3-0",
            "0-3",
            "0-3",
            "3-1",
            "0-3",
            "3-1",
    };
    String[] gameResultParcials = {
            "12-25/12-25/16-25",
            "25-12/26-24/25-14",
            "12-25/9-25/11-25",
            "26-24/25-27/23-25/25-20/16-14",
            "25-20/25-7/25-20",
            "15-25/23-25/12-25",
            "25-12/25-10/25-6",
            "25-22/25-9/25-10",
            "22-25/17-25/22-25",
            "17-25/26-28/23-25",
            "15-25/25-19/25-21/25-20",
            "9-25/10-25/19-25",
            "21-25/25-13/25-19/25-20",
    };
    String[] linkVideo = {
            "https://www.youtube.com/watch?v=sMHeqMFgy7U",
            "https://www.youtube.com/watch?v=UvmEz-o8YBI",
            "https://www.youtube.com/watch?v=Uax95GtJ7SQ",
            "https://www.youtube.com/watch?v=TFlHiQnmCj4",
            "https://www.youtube.com/watch?v=cp30ZZ0jccc",
            "https://www.youtube.com/watch?v=Ka2wLzNyt5g",
            "https://www.youtube.com/watch?v=apJICDyJPdU",
            "https://www.youtube.com/watch?v=NZ5Avqp4LXk",
            "https://www.youtube.com/watch?v=anagBKOx9Bs&t=7202s",
            "https://www.youtube.com/watch?v=ylJwUI15v1M&t=1309s",
            "https://www.youtube.com/watch?v=PelMN6HeruA",
            "https://www.youtube.com/watch?v=YVyIkKP7MhY&t=13s",
            "https://www.youtube.com/watch?v=Xmwql5Awvzw&t=4s",
    };
    String[] scout = {
            "Scout AASM-AAE CR 1a Fase",
            "Scout AAE-CDP CR 1a Fase",
            "Scout AEA-AAE CR 1a Fase",
            "Scout AAE-EGC CR 1a Fase",
            "Scout AAE-AASM CR 1a Fase",
            "Scout CDP-AAE CR 1a Fase",
            "Scout AAE-AEA CR 1a Fase",
            "Scout EGC-AAE CR 1a Fase",
            "Scout EGC-AAE CR 2a Fase",
            "Scout AAE-CMGC CR 2a Fase",
            "Scout LSC-AAE CR 2a Fase",
            "Scout SCE-AAE CR 2a Fase",
            "Scout AAE-CAM CR 2a Fase",
    };
    private RecyclerView.Adapter DataAdapter;
    int[] fotoA = {
            R.drawable.aasm,
            R.drawable.aae,
            R.drawable.aea,
            R.drawable.aae,
            R.drawable.aae,
            R.drawable.cdp,
            R.drawable.aae,
            R.drawable.egc,
            R.drawable.egc,
            R.drawable.aae,
            R.drawable.lsc,
            R.drawable.sce,
            R.drawable.aae,
    };
    int[] fotoB = {
            R.drawable.aae,
            R.drawable.cdp,
            R.drawable.aae,
            R.drawable.egc,
            R.drawable.aasm,
            R.drawable.aae,
            R.drawable.aea,
            R.drawable.aae,
            R.drawable.aae,
            R.drawable.cmgc,
            R.drawable.aae,
            R.drawable.aae,
            R.drawable.cam,
    };

    static ArrayList<HashMap<String, String>> dataItem;
    HashMap<String, String> map;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview);

        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(mLayoutManager);
        dataItem = new ArrayList<>();

        for (int i = 0; i < teamA.length; i++) {

            map = new HashMap<String, String> ();
            map.put("teamA", teamA[i]);
            map.put("teamB", teamB[i]);
            map.put("gameResultSets", gameResultSets[i]);
            map.put("gameResultParcials", gameResultParcials[i]);
            map.put("linkVideo", linkVideo[i]);
            map.put("scout", scout[i]);
            map.put("fotoA", fotoA[i] + "");
            map.put("fotoB", fotoB[i] + "");
            dataItem.add(map);
        }
        DataAdapter = new mDataAdapter(getApplicationContext(), dataItem);
        recyclerView.setAdapter(DataAdapter);

    }
}

