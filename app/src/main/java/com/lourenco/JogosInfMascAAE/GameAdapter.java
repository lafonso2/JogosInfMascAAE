package com.lourenco.JogosInfMascAAE;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class GameAdapter extends RecyclerView.Adapter<GameViewHolder> {

    Context context;
    List<Game> items;

    public GameAdapter(Context context, List<Game> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public GameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new GameViewHolder(LayoutInflater.from(context).inflate(R.layout.game_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull GameViewHolder holder, int position) {
        holder.teamAView.setText(items.get(position).getTeamA());
        holder.teamBView.setText(items.get(position).getTeamB());
        holder.gameResultSetsView.setText(items.get(position).getGameResultSets());
        holder.gameResultParcialsView.setText(items.get(position).getGameResultParcials());
        holder.linkVideoView.setText(items.get(position).getLinkVideo());
        holder.scoutView.setText(items.get(position).getScout());
        holder.fotoAView.setImageResource(items.get(position).getFotoA());
        holder.fotoBView.setImageResource(items.get(position).getFotoB());

    }

    @Override
    public int getItemCount() {

        return items.size();
    }
}