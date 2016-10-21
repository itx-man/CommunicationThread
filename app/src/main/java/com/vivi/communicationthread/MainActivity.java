package com.vivi.communicationthread;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button sendButton;
    private Button removeButton;

    private Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            subHandler 
        }
    };

    private Handler subHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sendButton= (Button) findViewById(R.id.button);
        removeButton = (Button) findViewById(R.id.button2);
        HandlerThread threadHandler = new HandlerThread("handlerThread");
        threadHandler.start();
        subHandler = new Handler(threadHandler.getLooper()){
            @Override
            public void handleMessage(Message msg) {
                Message message = Message.obtain();
                handler.sendMessageDelayed(message,1000);
            }
        };

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:

                break;
            case R.id.button2:

                break;
        }

    }
}
