package com.ray.tools.prototype;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Interpolator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.CollapsibleActionView;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ray.tools.prototype.pages.NewInstancePage;
import com.ray.tools.prototype.utils.Constants;
import com.ray.tools.prototype.utils.InstanceManager;
import com.ray.tools.prototype.utils.PrototypeManager;

public class MainActivity extends AppCompatActivity {
    private LinearLayout root;
    private PrototypeManager prototypeManager;
    private InstanceManager instanceManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initData();
        initUI();
    }
    private void initData(){
        prototypeManager = PrototypeManager.getInstance();
        instanceManager = InstanceManager.getInstance();
    }

    private void initUI(){
        root = new LinearLayout(this);
        root.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));;
        root.setOrientation(LinearLayout.VERTICAL);

        if(instanceManager!=null && instanceManager.getInstanceArray()!=null){
            initList();
        }else{
            initAddButton();
        }

        setContentView(root);
    }

    private void initList(){
        // TODO: 2016/9/10
    }

    private void initAddButton(){
        root.setGravity(Gravity.CENTER);
        TextView textView = new TextView(this);
        textView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        textView.setText(R.string.main_page_add_instance);
        textView.setTextSize(18);
        textView.setTextColor(Color.LTGRAY);
        textView.setGravity(Gravity.CENTER);
        root.addView(textView);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, NewInstancePage.class);
                startActivityForResult(intent, Constants.PAGE_FROM_MAIN);
            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){
            case Constants.PAGE_FROM_MAIN:
                break;
            default:
        }
    }
}
