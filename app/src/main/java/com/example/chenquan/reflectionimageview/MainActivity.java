package com.example.chenquan.reflectionimageview;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.iv);
        Bitmap bitmap = ((BitmapDrawable) getResources().getDrawable(R.mipmap.qian)).getBitmap();
        ReflectImage rf = new ReflectImage();
        imageView.setImageBitmap(rf.createReflectedImage(bitmap));

    }
}
