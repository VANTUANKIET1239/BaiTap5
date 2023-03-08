package com.example.imagelistview;

import static com.example.imagelistview.PhotoData.AddPhotoData;
import static com.example.imagelistview.PhotoData.GetCount;
import static com.example.imagelistview.PhotoData.photodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {
GridView gridView;

    private AdapterView.OnItemClickListener onitemclick = new AdapterView.OnItemClickListener(){
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id){
            Intent intent = new Intent(getBaseContext(),ViewPhotoActivity.class);
            intent.putExtra("id",position);
            startActivity(intent);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        readJson();
        gridView = findViewById(R.id.gridview);
        PhotoAdapter adapter = new PhotoAdapter(PhotoData.GeneratePhotoData(),getApplicationContext());
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(onitemclick);
    }
    public void readJson(){
        //    List<Photo> listpho = new ArrayList<>();
        InputStream inputStream = getResources().openRawResource(R.raw.data);
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder builder = new StringBuilder();
        String line;
        try {
            while ((line = reader.readLine()) != null) {
                builder.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String jsonString = builder.toString();
        JSONArray jsonArray;
        try {
            jsonArray = new JSONArray(jsonString);
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                String img = jsonObject.getString("img");
                String title = jsonObject.getString("title");
                String description = jsonObject.getString("description");
                Photo photo = new Photo(GetCount(),img,title,description);
                AddPhotoData(photo);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}