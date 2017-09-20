package com.zhou.javaDesign;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.zhou.javaDesign.briging.FileFormat;
import com.zhou.javaDesign.briging.Orcal;
import com.zhou.javaDesign.briging.TxtFile;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 桥接模式 , 处理多维度变化
     * @param view
     */
    public void briging(View view) {
        FileFormat fileFormat = new TxtFile();
        fileFormat.setSql(new Orcal());
        fileFormat.processFile();
    }



}
