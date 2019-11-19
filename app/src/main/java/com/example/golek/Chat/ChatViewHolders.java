package com.example.golek.Chat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.golek.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ChatViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView message, chatId;
    public LinearLayout container;


    public ChatViewHolders(@NonNull View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);

        chatId = itemView.findViewById(R.id.chatid);
        message = itemView.findViewById(R.id.messagebaloon);
        container = itemView.findViewById(R.id.container);

    }

    @Override
    public void onClick(View v) {

    }
}
