package com.example.imagelistview;

import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class SetImageByUrlExample2 {
    public static void loadImageFromUrl(String imageUrl, ImageView imageView) {
        Picasso.get().load(imageUrl).resize(150,150).into(imageView);
    }
}
