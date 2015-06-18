package com.gson;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Gson gson = new Gson();
        User user = gson.fromJson(JsonString.jsonString(), User.class);
        Log.i("user", user.toString());*/

        GsonBuilder g = new GsonBuilder();
        g.registerTypeAdapter(Company.class, new CompanyInstaceCreator());
        g.registerTypeAdapter(Department.class, new DepartmentInstanceCreator());
        g.registerTypeAdapter(Date.class, new DateDeserializer());
        Gson gson = g.create();

        Company navigationArray = gson.fromJson(JsonString.jsonString(), Company.class);
        //Employee[] navigationArray = gson.fromJson(JsonString.jsonString(), Employee[].class);


        //Company c = gson.fromJson(JsonString.jsonString(), Company.class);
        //Employee c = gson.fromJson(JsonString.jsonString(), Employee.class);


      /* Log.i("employee",
                gson.fromJson("{'id':1,'firstName':'Lokesh', 'due_date': '2015-04-20', 'lastName':'Gupta','roles':['ADMIN','MANAGER'],'department':{'deptName':'Finance'}}",
                        Employee.class) +"");*/

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

