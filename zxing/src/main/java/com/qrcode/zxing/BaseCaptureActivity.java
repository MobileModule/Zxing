package com.qrcode.zxing;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;

import com.google.zxing.Result;
import com.qrcode.zxing.view.ViewfinderView;

/**
 * Created by druid on 2019/1/18.
 */

public abstract class BaseCaptureActivity extends Activity {
    public abstract void drawViewfinder();
    public abstract void handleDecode(Result obj, Bitmap barcode);
    public abstract ViewfinderView getViewfinderView();
    public abstract Handler getHandler();
}
