package com.lourenco.JogosInfMascAAE;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;

    public class mDataAdapter extends RecyclerView.Adapter < mDataAdapter.MyViewHolder > {
        private ArrayList < HashMap < String,String >> dataSet;
        Context context;

        public mDataAdapter(Context context, ArrayList < HashMap < String, String >> dataSet) {
            this.dataSet = dataSet;
            this.context = context;

        }

        @NonNull@Override
        public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.game_view, parent, false);
            return new MyViewHolder(v);
        }

        @Override
        public void onBindViewHolder(@NonNull final MyViewHolder holder, final int position) {
            final HashMap < String,String > Details = dataSet.get(position);
            holder.teamA.setText(Details.get("teamA"));
            holder.teamB.setText(Details.get("teamB"));
            holder.gameResultSets.setText(Details.get("gameResultSets"));
            holder.gameResultParcials.setText(Details.get("gameResultParcials"));
            holder.scout.setText(Details.get("scout"));
            holder.fotoA.setImageResource(Integer.parseInt((Details.get("fotoA"))));
            holder.fotoB.setImageResource(Integer.parseInt((Details.get("fotoB"))));

            holder.linkVideo.setOnClickListener(new View.OnClickListener() {@Override
            public void onClick(View v) {

                final String website = Details.get("Burl");
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(website));
                context.startActivity(browserIntent);

            }
            });
        }

        @Override

        public int getItemCount() {
            return (dataSet == null) ? 0 : dataSet.size();
        }

        public class MyViewHolder extends RecyclerView.ViewHolder {
            TextView teamA;
            TextView teamB;
            TextView gameResultSets;
            TextView gameResultParcials;
            Button linkVideo;
            TextView scout;
            ImageView fotoA;
            ImageView fotoB;

            MyViewHolder(@NonNull View itemView) {
                super(itemView);
                teamA = (TextView) itemView.findViewById(R.id.team_A);
                teamB = (TextView) itemView.findViewById(R.id.team_B);
                gameResultSets = (TextView) itemView.findViewById(R.id.game_result_sets);
                gameResultParcials = (TextView) itemView.findViewById(R.id.game_result_parcials);
                linkVideo = (Button) itemView.findViewById(R.id.buttonLinkVideo);
                scout = (TextView) itemView.findViewById(R.id.scout);
                fotoA = (ImageView) itemView.findViewById(R.id.foto_a);
                fotoB = (ImageView) itemView.findViewById(R.id.foto_b);
            }
        }
    }
