package com.example.andreeaproblem;

import android.content.Context;
import android.widget.FrameLayout;

import android.util.AttributeSet;

public class ReverseDrawingOrderLayout extends FrameLayout {

    public ReverseDrawingOrderLayout(Context context) {
        super(context);
        setChildrenDrawingOrderEnabled(true);
    }

    public ReverseDrawingOrderLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        setChildrenDrawingOrderEnabled(true);
    }

    public ReverseDrawingOrderLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setChildrenDrawingOrderEnabled(true);
    }

    @Override
    protected int getChildDrawingOrder(int childCount, int i) {
        return childCount - 1 - i;
    }
}
