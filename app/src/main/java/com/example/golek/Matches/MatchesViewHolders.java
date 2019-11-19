package com.example.golek.Matches;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.golek.Chat.ChatActivity;
import com.example.golek.R;

public class MatchesViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView matchId, matchName;
    public ImageView matchImage;

    public MatchesViewHolders(@NonNull View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);

        matchId = itemView.findViewById(R.id.matchesid);
        matchName = itemView.findViewById(R.id.matchesname);
        matchImage = itemView.findViewById(R.id.matchesimage);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(v.getContext(), ChatActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("matchId", matchId.getText().toString());
        intent.putExtras(bundle);
        v.getContext().startActivity(intent);
    }
}
