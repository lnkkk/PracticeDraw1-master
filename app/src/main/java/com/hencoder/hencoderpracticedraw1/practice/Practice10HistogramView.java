package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    private Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private Path path = new Path();
    private String[] text = {"Froto", "GB", "ICS", "JB", "KitKat", "L", "M"};

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        paint.setColor(Color.WHITE);
        paint.setStyle(Paint.Style.STROKE);
        path.moveTo(50, 0);
        path.lineTo(50, 350);
        path.rLineTo(800, 0);
        canvas.drawPath(path, paint);

        paint.setTextSize(18);
        canvas.drawText(text[0], 100, 370, paint);
        canvas.drawText(text[1], 200, 370, paint);
        canvas.drawText(text[2], 300, 370, paint);
        canvas.drawText(text[3], 400, 370, paint);
        canvas.drawText(text[4], 500, 370, paint);
        canvas.drawText(text[5], 600, 370, paint);
        canvas.drawText(text[6], 700, 370, paint);

        paint.setColor(Color.GREEN);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(170, 330, 230, 350, paint);
        canvas.drawRect(270, 260, 330, 350, paint);
        canvas.drawRect(370, 230, 430, 350, paint);
        canvas.drawRect(470, 200, 530, 350, paint);
        canvas.drawRect(570, 150, 630, 350, paint);
        canvas.drawRect(670, 50, 730, 350, paint);
    }
}
