package com.gyanv.beyond;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    public static final String MyPREF = "myprefernces";
    SharedPreferences sharedpreferences;
    private GridView gridView;
    private GroupAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView) findViewById(R.id.group_list);
        final ArrayList<Group> groupList = new ArrayList<>();

        groupList.add(new Group(R.drawable.aries, "ARIES", "ariesiitr"));
        groupList.add(new Group(R.drawable.mdg, "MDG", "mdgiitr"));
        groupList.add(new Group(R.drawable.choreo, "CHOREO", "choreo.iitr"));
        groupList.add(new Group(R.drawable.music, "Music Section", "musicsectioniitr"));
        groupList.add(new Group(R.drawable.mars, "MaRS", "marsiitr"));
        groupList.add(new Group(R.drawable.kshitij, "Kshitij", "kshitijiit"));
        groupList.add(new Group(R.drawable.drams, "DRAMS", "dramaticsiitr"));
        groupList.add(new Group(R.drawable.standup, "Stand Up Club", "standupclubiitroorkee"));

        mAdapter = new GroupAdapter(this, groupList);

        gridView.setAdapter(mAdapter);

        gridView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);

        // set sharedpreferences


//        CheckBox btnChecked = (CheckBox) findViewById(R.id.notify_me_checkbox);
//        btnChecked.setOnClickListener(this);

        //setting an onclicklistener to the checkboxes
//        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapter, View view, int position,
//                                    long l) {
//                //do your work here
//                Group group = groupList.get(position);
//
//                // getID
//                String g_id = group.getPage_id();
//                sharedpreferences = getSharedPreferences(MyPREF, Context.MODE_PRIVATE);
//                SharedPreferences.Editor editor = sharedpreferences.edit();
//                editor.putString("group_id", g_id);
//
//                Toast toast = Toast.makeText(getApplicationContext(),
//                        "This is a message displayed in a Toast",
//                        Toast.LENGTH_SHORT);
//                Log.e("wtf", "pkkkkkk");
//
//                toast.show();
//
//            }
//        });

        // shared preferences storing


    }


}
