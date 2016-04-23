package com.test.weigan.mylibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.test.weigan.mylibrary2.LibTest2;

/**
 * Created by Administrator on 2016/4/23.
 */
public class LibTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_libtest);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LibTestActivity.this, LibTest2.class);
                startActivity(intent);
                showToast();
            }
        });
    }

    private void showToast() {
        Toast toast = Toast.makeText(this, "salfasjdf", Toast.LENGTH_SHORT);
        toast.show();
    }
}
