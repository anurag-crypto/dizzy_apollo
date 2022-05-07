package com.example.facerecognization.Helper;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

public class RectOverlay extends GraphicOverlay.Graphic{
    private int mRectColor = Color.GREEN;
    private float mStokeWidth= 4.0f;
    private Paint mRoorPaint;
    private GraphicOverlay graphicOverlay;
    private Rect rect;

    public RectOverlay(GraphicOverlay graphicOverlay, Rect rect) {
        super(graphicOverlay);

        mRoorPaint=new Paint();
        mRoorPaint.setColor(mRectColor);
        mRoorPaint.setStyle(Paint.Style.STROKE);
        mRoorPaint.setStrokeWidth(mStokeWidth);

        this.graphicOverlay= graphicOverlay;
        this.rect=rect;
        postInvalidate();
    }

    @Override
    public void draw(Canvas canvas) {

        RectF rectF=new RectF(rect);
        rectF.left=translateX(rectF.left);
        rectF.right=translateX(rectF.right);
        rectF.top=translateX(rectF.top);
        rectF.bottom=translateX(rectF.bottom);

        canvas.drawRect(rectF,mRoorPaint);
    }
}
