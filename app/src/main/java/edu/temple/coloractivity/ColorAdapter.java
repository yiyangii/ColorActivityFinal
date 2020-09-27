package edu.temple.coloractivity;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.graphics.Color;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ColorAdapter extends BaseAdapter {
    Context context;
    ArrayList<String> items;
    int colors[];
    public ColorAdapter(Context context,ArrayList<String> items){
        this.context = context;
        this.items = items;
        colors = new int[6];
        colors[0] = Color.WHITE;
        colors[1] = Color.RED;
        colors[2] = Color.YELLOW;
        colors[3] = Color.GREEN;
        colors[4] = Color.LTGRAY;
        colors[5] = Color.BLUE;
        colors[6] = Color.GRAY;
    }
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int i) {
        return items.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView textView;
        if(convertView == null){
            textView = new TextView(context);
            textView.setTextSize(5);
            textView.setPadding(5,5,5,5);
        }else{
            textView = (TextView)convertView;
            textView.setText(getItem(position).toString());
            textView.setBackgroundColor(colors [position% colors.length]);
        }
        return null;
    }
}
