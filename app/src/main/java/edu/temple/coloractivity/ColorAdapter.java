package edu.temple.coloractivity;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public class ColorAdapter extends BaseAdapter {

    Context context;
    ArrayList<String> items;
    int colors[];

    public ColorAdapter(Context context, ArrayList<String> items){
        this.context = context;
        this.items = items;

        colors = new int[11];
        colors[0] = Color.WHITE;
        colors[1] = Color.BLACK;
        colors[2] = Color.BLUE;
        colors[3] = Color.CYAN;
        colors[4] = Color.DKGRAY;
        colors[5] = Color.GRAY;
        colors[6] = Color.GREEN;
        colors[7] = Color.LTGRAY;
        colors[8] = Color.MAGENTA;
        colors[9] = Color.RED;
        colors[10] = Color.TRANSPARENT;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        TextView textView;
        if (convertView == null) {
            textView = new TextView(context);
            textView.setTextSize(20);
            textView.setPadding(5,5,5,5);
        }
        else
            textView = (TextView) convertView;

        textView.setText(getItem(position).toString());
        textView.setBackgroundColor(colors[position % colors.length]);
        return textView;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        View v = getView(position, convertView, parent);
        return v;
    }

}