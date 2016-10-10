package com.znn.ijkplayerdemo.ui;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.znn.ijkplayerdemo.R;
import com.znn.ijkplayerdemo.common.PlayerManager;

public class MainActivity extends AppCompatActivity implements PlayerManager.PlayerStateListener {
    public static final String TAG = "video";
    private PlayerManager player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initPlayer();
    }

    private void initPlayer() {
        player = new PlayerManager(this);
        player.setFullScreenOnly(true);
        player.setScaleType(PlayerManager.SCALETYPE_FILLPARENT);
        player.playInFullScreen(true);

        player.setPlayerStateListener(this);
//        player.play("http://zv.3gv.ifeng.com/live/zhongwen800k.m3u8");
//        String url = Environment.getExternalStorageDirectory().getPath().concat("/video2.mp4");
//        String url = Environment.getExternalStorageDirectory().getPath().concat("/video3.mp4");
        String url = Environment.getExternalStorageDirectory().getPath().concat("/video1.mp4");
        Log.e(TAG, "播放地址url=".concat(url));
        player.play(url);

    }


    @Override
    public void onComplete() {

    }

    @Override
    public void onError() {

    }

    @Override
    public void onLoading() {

    }

    @Override
    public void onPlay() {

    }

    @Override
    public void onNetWorkRate(int netRate) {

    }
}
