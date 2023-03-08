package com.example.imagelistview;

import static com.example.imagelistview.PhotoData.AddPhotoData;
import static com.example.imagelistview.PhotoData.GetCount;
import static com.example.imagelistview.PhotoData.GetImagebyId;
import static com.example.imagelistview.SetImageByUrlExample2.loadImageFromUrl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ViewPhotoActivity extends AppCompatActivity {

    ImageView img;
    TextView des;
    TextView cap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_photo);
        img = findViewById(R.id.imgshow);
        des = findViewById(R.id.worddes);
        cap = findViewById(R.id.wordtitle);

        Intent intent = getIntent();
        int idphoto = intent.getIntExtra("id",0);
        Photo kiet = GetImagebyId(idphoto);

        loadImageFromUrl(kiet.getSource_photo(), img);
        des.setText(kiet.getDescription_photo());
        cap.setText(kiet.getTitle_photo());


    }

}