package com.example.apprendre;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.media.AudioManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter {

    private int mcolorResourceId;
    private AudioManager mAudioManager;

    public WordAdapter(Activity context, ArrayList<Word> array, int colorResourceId){
        super(context,0,array);
        mcolorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        Word currentWord = (Word) getItem(position);

        TextView defaultTextView = listItemView.findViewById(R.id.default_textview);
        defaultTextView.setText(currentWord.getDefaultTranslation());

        TextView frenchTextView = listItemView.findViewById(R.id.french_textview);
        frenchTextView.setText(currentWord.getFrenchTranslation());

        ImageView imageView = listItemView.findViewById(R.id.image);
        if(currentWord.hasImage()){
            imageView.setImageResource(currentWord.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }else{
            imageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.full_list_item);
        int color = ContextCompat.getColor(getContext(), mcolorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
