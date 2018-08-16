package com.yahoo.r4hu7.instagram;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;

public class CircleCardView extends CardView {
    public CircleCardView(@NonNull Context context) {
        super(context);
    }

    public CircleCardView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CircleCardView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int m = widthMeasureSpec > heightMeasureSpec ? widthMeasureSpec : heightMeasureSpec;
        setMeasuredDimension(m, m);
        this.setRadius(getHeight() / 2);
    }
}
