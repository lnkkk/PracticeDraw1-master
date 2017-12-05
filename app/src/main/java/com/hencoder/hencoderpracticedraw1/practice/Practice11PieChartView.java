package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    private Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private Path path = new Path();
    private String[] text = {"Lollipop", "Marshmallow", "Froyo", "Gingerbread"
            , "Ice", "Jeely Bean", "KiaKat"};


    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.YELLOW); //黄色
        canvas.drawArc(150, 50, 450, 350, -80, 75, true, paint);


        paint.setColor(Color.parseColor("#E91E63")); //浅黄色
        canvas.drawArc(150, 50, 450, 350, 0, 10, true, paint);

        paint.setColor(Color.GRAY); //灰色
        canvas.drawArc(150, 50, 450, 350, 15, 10, true, paint);

        paint.setColor(Color.GREEN); //绿色
        canvas.drawArc(150, 50, 450, 350, 30, 50, true, paint);

        paint.setColor(Color.BLUE); //蓝色
        canvas.drawArc(150, 50, 450, 350, 85, 85, true, paint);

        paint.setColor(Color.RED);
        canvas.drawArc(125, 25, 425, 325, 175, 105, true, paint);

        //下面是线的测量
        paint.setColor(Color.WHITE);
        paint.setStyle(Paint.Style.STROKE);
        paint.setTextSize(15);
        canvas.drawText(text[0], 50, 50, paint);

        //画连接线
        float textHeight = paint.getTextSize() / 2;
        path.moveTo(100, 50 + textHeight);
        path.lineTo(150, 50 + textHeight);
        path.rLineTo(50, 50);
        canvas.drawPath(path, paint);

    }
}
