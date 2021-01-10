package com.example.cartoon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

import java.util.ArrayList;

public class MainActivity_Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__main);

        ArrayList<CartooN> CartoonLaibrary = new ArrayList<>() ;

        CartooN A = new CartooN("My Daddy Long Legs",8.2,1,40,1990,R.drawable.mydaddylonglegs,"https://www.youtube.com/watch?v=k9bWZlsKUTQ&list=PLy4PR9qtbxzPkzqi3zQBZY25m0v5xlyLt");
        CartooN B = new CartooN("UFO Robot Goldrake",7,1,74,1975,R.drawable.ufo,"https://www.youtube.com/watch?v=8hXntXglfUQ&list=PLOB0zyAAZVASrwHrulnl6i7OVO8elvLW1");
        CartooN C = new CartooN("Popeye the Sailor",7.1,25,220,1960,R.drawable.popeyethesailor,"https://www.youtube.com/watch?v=pSsJ3gznWTo");
        CartooN D = new CartooN("Bumpety Boo",6.2,1,130,1985,R.drawable.bumpetyboo,"https://www.youtube.com/watch?v=TInr9w4mq-I");
        CartooN E = new CartooN("Sangokushi",8.9,1,47,1971,R.drawable.sangokushi,"https://www.youtube.com/watch?v=EY2tjnIiGqI&list=PL68zhxR3HaEBg3A1b5-yx9v317yGiRj7g");
        CartooN F = new CartooN("Adnan and Lina",8.7,1,26,1978,R.drawable.adnanandlina,"https://www.youtube.com/watch?v=GrEyTgJMC3M");

        CartoonLaibrary.add(A);
        CartoonLaibrary.add(B);
        CartoonLaibrary.add(C);
        CartoonLaibrary.add(D);
        CartoonLaibrary.add(E);
        CartoonLaibrary.add(F);

        Toolbar toolbar =findViewById(R.id.toolbar);
        RecyclerView CartoonList = findViewById(R.id.RV1);
        toolbar.setLogo(R.drawable.ic_action_bday);
        setSupportActionBar(toolbar);


        PrimaryDrawerItem item1 = new PrimaryDrawerItem().withIdentifier(1).withName("Home").withIcon(R.drawable.ic_baseline_home_24);
        PrimaryDrawerItem item2 = new PrimaryDrawerItem().withIdentifier(2).withName("profile").withIcon(R.drawable.ic_baseline_person_24);
        PrimaryDrawerItem item3 = new PrimaryDrawerItem().withIdentifier(3).withName("Settings").withIcon(R.drawable.ic_baseline_settings_24);

        SecondaryDrawerItem item4 = new SecondaryDrawerItem().withIdentifier(4).withName("About");

        Drawer result = new DrawerBuilder()
                .withActivity(this)
                .withToolbar(toolbar)
                .addDrawerItems(
                        item1,
                        item2,
                        item3,
                        new DividerDrawerItem(),
                        item4
                )
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {

                        Toast.makeText(MainActivity_Main.this,"you clicked on "+drawerItem.getIdentifier(),Toast.LENGTH_LONG).show();

                        return true;
                    }
                })
                .build();



        CartoonList.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        CartoonList.setLayoutManager(lm);

        cartoonAdapter cA =new cartoonAdapter(CartoonLaibrary,MainActivity_Main.this);
        CartoonList.setAdapter(cA);

        Button g = findViewById(R.id.gotocharacter);
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent tocharacter = new Intent(MainActivity_Main.this,MainActivity5.class);
                startActivity(tocharacter);

            }
        });

    }
}