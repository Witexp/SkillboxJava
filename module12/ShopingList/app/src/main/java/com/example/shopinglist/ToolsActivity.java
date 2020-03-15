package com.example.shopinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ToolsActivity extends AppCompatActivity {

    ListView listView;
    ArrayAdapter<String> arrayAdapter;
    ArrayList<String> arrayList;
    int choosedItemPosition;
    private static final String PREFERENCES = "PREFERENCES_TOOLS";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tools);
        arrayList = new ArrayList<>();
        listView = findViewById(R.id.list_view_tools);
        SharedPreferences sharedPreferencesRestore = getSharedPreferences(PREFERENCES,MODE_PRIVATE);
        for(int i = 0; i < sharedPreferencesRestore.getInt("length",0); i++)
        {
            arrayList.add(sharedPreferencesRestore.getString(String.valueOf(i),""));
        }
        arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_single_choice,arrayList);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                choosedItemPosition = position;
            }
        });
    }

    public void onClickButtonAddTools(View view) {
        EditText editText = findViewById(R.id.edit_text_Tools);
        String item = editText.getText().toString();
        if(item.equals("")){
            Toast toast = Toast.makeText(this,"Добавьте покупку",Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,0,0);
            toast.show();
        } else {
            arrayList.add(item);
            editText.setText("");
            arrayAdapter.notifyDataSetChanged();

        }
    }

    public void onClickButtonRemoveTools(View view) {
        if(arrayList.isEmpty()){
            Toast toast = Toast.makeText(this,"Список уже пуст",Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,0,0);
            toast.show();
        } else {
            arrayList.remove(choosedItemPosition);
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        onSaveData();
//        Toast toast = Toast.makeText(this, "onDestroy",Toast.LENGTH_LONG);
//        toast.setGravity(Gravity.CENTER,0,0);
//        toast.show();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
//        Toast toast = Toast.makeText(this, "onSaveInstatState",Toast.LENGTH_LONG);
//        toast.setGravity(Gravity.CENTER,0,0);
//        toast.show();
        onSaveData();
    }
    void onSaveData(){
        String[] items = arrayList.toArray(new String[0]);
        SharedPreferences preferencesSave = getSharedPreferences(PREFERENCES,MODE_PRIVATE);
        SharedPreferences.Editor editor = preferencesSave.edit();
        for(int i = 0 ; i < items.length; i++)
        {
            editor.putString(String.valueOf(i),items[i]);
        }
        editor.putInt("length", items.length);
        editor.apply();
    }
}
