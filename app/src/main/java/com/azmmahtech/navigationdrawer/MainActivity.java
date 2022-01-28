package com.azmmahtech.navigationdrawer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle mTooggle;

    /////////////كود التحكم في الابوشن////////////////
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (mTooggle.onOptionsItemSelected(item))
            return true;

        return super.onOptionsItemSelected(item);
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    ////////////////////////كود اظهار زر القائمة اخفاء واظهار///////////////////
    drawerLayout =findViewById(R.id.drawer_layout);
    mTooggle=new ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close);
    drawerLayout.addDrawerListener(mTooggle);
    mTooggle.syncState();
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);







        }
}