package com.example.urvik_000.lt100metis;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.location.LocationListener;
import android.support.v4.app.FragmentManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class MeniuActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener{

    Integer REQUEST_CAMERA=1, SELECT_FILE=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meniu);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        final ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.

        // inflate the layout of the popup window
        LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
        final View popupView = inflater.inflate(R.layout.popup_window, null);

        // create the popup window
        int width = LinearLayout.LayoutParams.WRAP_CONTENT;
        int height = LinearLayout.LayoutParams.WRAP_CONTENT;
        boolean focusable = true; // lets taps outside the popup also dismiss it
        final PopupWindow popupWindow = new PopupWindow(popupView, width, height, focusable);

        final View v = inflater.inflate(R.layout.content_meniu, null);

        popupWindow.showAtLocation(v, Gravity.CENTER, 0, 0);
        Button btn = (Button)popupView.findViewById(R.id.button2);
        btn.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {
                View contentView = popupWindow.getContentView();
                TextView txt4 = findViewById(R.id.textView4);
                EditText et2 = contentView.findViewById(R.id.editText2);
                String name = et2.getText().toString();
                txt4.setText(name);
                popupWindow.dismiss();
            }});

       /* try{
            FileReader failas = new FileReader("C:\\Users\\urvik_000\\Desktop\\duom.txt");
            //FileReader failas = new FileReader("duom.txt");
            BufferedReader bf = new BufferedReader(failas);
            String line = bf.readLine();
            File f = new File("C:\\Users\\urvik_000\\Desktop\\duom.txt");
            f.mkdirs();

                if(f.length()==0){

                    boolean focusable = false; // lets taps outside the popup also dismiss it
                    final PopupWindow popupWindow = new PopupWindow(popupView, width, height, focusable);
                    popupWindow.showAtLocation(v, Gravity.CENTER, 0, 0);
                    Button btn = (Button)popupView.findViewById(R.id.button2);
                    btn.setOnClickListener(new Button.OnClickListener(){

                        @Override
                        public void onClick(View v) {
                            View contentView = popupWindow.getContentView();
                            TextView txt4 = findViewById(R.id.textView4);
                            EditText et2 = contentView.findViewById(R.id.editText2);
                            String name = et2.getText().toString();
                            txt4.setText(name);

                            try{ Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\urvik_000\\Desktop\\LT100metis\\app\\src\\main\\res\\duom.txt"), "utf-8"));
                                writer.write(name);
                            }catch(IOException exc){

                            }

                            popupWindow.dismiss();
                        }});

                } else {

                        TextView txt4 = findViewById(R.id.textView4);
                        String vardas = bf.readLine();
                        txt4.setText(vardas);

                }
        }catch(IOException ex){

            String mess = ex.getMessage();

            Toast.makeText(this, mess, Toast.LENGTH_SHORT).show();
        }*/


        ImageButton ib = findViewById(R.id.imageButton2);
        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                SelectImage();
            }
        });

        /*Button btn = (Button)popupView.findViewById(R.id.button2);
        btn.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {
                View contentView = popupWindow.getContentView();
                TextView txt4 = findViewById(R.id.textView4);
                EditText et2 = contentView.findViewById(R.id.editText2);
                String name = et2.getText().toString();      //šitoje eilutėje problemytėėėėėėė et2 = null
                txt4.setText(name);

                popupWindow.dismiss();
            }});*/

        //getMenuInflater().inflate(R.menu.meniu, menu);
        return true;
    }

    /*@Override
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
    }*/

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.

        int id = item.getItemId();
        FragmentManager fm = getSupportFragmentManager();

        /*ImageButton ib = findViewById(R.id.imageButton2);
        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                SelectImage();
            }
        });*/

        if (id == R.id.nav_main_page){
            fm.beginTransaction().replace(R.id.mainFrame, new MainPageFragment()).commit();
        } else if (id == R.id.nav_road) {
            fm.beginTransaction().replace(R.id.mainFrame, new MyRoadFragment()).commit();
        }else if (id == R.id.nav_road1) {
            fm.beginTransaction().replace(R.id.mainFrame, new FirstRoutFragment()).commit();
        } else if (id == R.id.nav_road2){
            fm.beginTransaction().replace(R.id.mainFrame, new SecondRoutFragment()).commit();
        } else if (id == R.id.nav_road3){
            fm.beginTransaction().replace(R.id.mainFrame, new ThirdRoutFragment()).commit();
        } else if (id == R.id.nav_game) {
            fm.beginTransaction().replace(R.id.mainFrame, new GameFragment()).commit();
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void SelectImage(){
        final CharSequence[] items={"Camera","Gallery", "Cancel"};

        AlertDialog.Builder builder = new AlertDialog.Builder(MeniuActivity.this);
        builder.setTitle("Add Image");

        builder.setItems(items, new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                if (items[i].equals("Camera")) {

                    Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                    startActivityForResult(intent, REQUEST_CAMERA);

                } else if (items[i].equals("Gallery")) {

                    Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                    intent.setType("image/*");
                    //startActivityForResult(intent.createChooser(intent, "Select File"), SELECT_FILE);
                    startActivityForResult(intent, SELECT_FILE);

                } else if (items[i].equals("Cancel")) {
                    dialogInterface.dismiss();
                }
            }
        });
        builder.show();
    }

    @Override
    public  void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode,data);

        ImageButton imageButton = findViewById(R.id.imageButton2);
        if(resultCode== Activity.RESULT_OK){

            if(requestCode==REQUEST_CAMERA){

                Bundle bundle = data.getExtras();
                final Bitmap bmp = (Bitmap) bundle.get("data");
                imageButton.setImageBitmap(bmp);

            }else if(requestCode==SELECT_FILE){

                Uri selectedImageUri = data.getData();
                imageButton.setImageURI(selectedImageUri);
            }

        }
    }
}

