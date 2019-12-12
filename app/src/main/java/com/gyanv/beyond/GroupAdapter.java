package com.gyanv.beyond;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

//import android.support.v4.content.ContextCompat;

public class GroupAdapter extends ArrayAdapter<Group> {

    //    private Context mContext;
    private List<Group> groupList = new ArrayList<>();

    public GroupAdapter(@NonNull Context context, ArrayList<Group> list) {
        super(context, 0, list);
//        mContext = context;
        groupList = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.group_item, parent, false);
        }

        Group currentGroup = groupList.get(position);

        TextView name = (TextView) listItemView.findViewById(R.id.group_name);
        name.setText(currentGroup.getName());

        ImageView image = (ImageView) listItemView.findViewById(R.id.thumbnail);
        image.setImageResource(currentGroup.getIcon());

        return listItemView;
    }
}
