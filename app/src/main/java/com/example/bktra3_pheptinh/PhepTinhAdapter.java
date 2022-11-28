package com.example.bktra3_pheptinh;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class PhepTinhAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<PhepTinh> xeConList;

    public PhepTinhAdapter(Context context, int layout, List<PhepTinh> xeConList) {
        this.context = context;
        this.layout = layout;
        this.xeConList = xeConList;
    }

    @Override
    public int getCount() {
        return xeConList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        view = inflater.inflate(layout,null);

        //ánh xạ view
        TextView txtTen = (TextView) view.findViewById(R.id.textviewTen);
        ImageView imgHinh = (ImageView) view.findViewById(R.id.imageViewHinh);

        //gán giá trị
        PhepTinh xeCon = xeConList.get(i);

        txtTen.setText(xeCon.getTen());
        imgHinh.setImageResource(xeCon.getHinh());

        return view;
    }
}
