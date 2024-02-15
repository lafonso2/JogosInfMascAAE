package com.lourenco.JogosInfMascAAE;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class GameViewHolder extends RecyclerView.ViewHolder {

    TextView teamAView, teamBView, gameResultSetsView, gameResultParcialsView, linkVideoView, scoutView;
    ImageView fotoAView, fotoBView;
    public GameViewHolder(@NonNull View itemView) {

        super(itemView);
        teamAView = itemView.findViewById(R.id.team_A);
        teamBView = itemView.findViewById(R.id.team_B);
        gameResultSetsView = itemView.findViewById(R.id.game_result_sets);
        gameResultParcialsView = itemView.findViewById(R.id.game_result_parcials);
        linkVideoView = itemView.findViewById(R.id.linkvideo);
        scoutView = itemView.findViewById(R.id.scout);
        fotoAView = itemView.findViewById(R.id.foto_a);
        fotoBView = itemView.findViewById(R.id.foto_b);
    }


}
