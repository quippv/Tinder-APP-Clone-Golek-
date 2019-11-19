package com.example.golek.Chat;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.golek.R;

import java.util.List;

public class ChatAdapter extends RecyclerView.Adapter<ChatViewHolders> {

    private List<ChatObject> chatList;
    private Context context;

    public ChatAdapter(List<ChatObject> chatList, Context context) {
        this.chatList = chatList;
        this.context = context;
    }

    @NonNull
    @Override
    public ChatViewHolders onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_chat, null, false);
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutView.setLayoutParams(layoutParams);
        ChatViewHolders chatViewHolders = new ChatViewHolders(layoutView);

        return chatViewHolders;
    }

    @Override
    public void onBindViewHolder(@NonNull ChatViewHolders holder, int position) {
        holder.message.setText(chatList.get(position).getMessage());
        if(chatList.get(position).getCurrentUser()) {
            holder.message.setGravity(Gravity.END);
            holder.message.setTextColor(Color.parseColor("#555555"));
            holder.container.setBackgroundResource(R.drawable.chat_baloon_user);
        } else {
            holder.message.setGravity(Gravity.START);
            holder.message.setTextColor(Color.parseColor("#555555"));
            holder.container.setBackgroundResource(R.drawable.chat_baloon_replyer);
        }
    }

    @Override
    public int getItemCount() {
        return this.chatList.size();
    }
}
