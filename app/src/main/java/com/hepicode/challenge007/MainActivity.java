package com.hepicode.challenge007;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView image;
    Button button;
    boolean isVisible = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = findViewById(R.id.imageView);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (isVisible){
                    image.setVisibility(View.INVISIBLE);
                    button.setText("Show image");
                    isVisible = false;
                }else {
                    button.setText("Hide image");
                    image.setVisibility(View.VISIBLE);
                    isVisible = true;
                }
            }
        });
    }
}
