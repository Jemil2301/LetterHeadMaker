package com.example.i.letterheadmaker;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.pdf.PdfDocument;
import android.os.Environment;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;

public class Create2 extends AppCompatActivity {
    CardView card;
    FloatingActionButton fab;
  //  Button templets;
    EditText body;
    String C1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create2);

        card=(CardView)findViewById(R.id.card);
        body=(EditText)findViewById(R.id.Etbody);

        card.setBackgroundResource(R.drawable.design3);
       // templets=(Button)findViewById(R.id.temp);
        fab=(FloatingActionButton)findViewById(R.id.dow);
        ActivityCompat.requestPermissions(Create2.this, new String[] {Manifest.permission.READ_EXTERNAL_STORAGE,Manifest.permission.WRITE_EXTERNAL_STORAGE}, PackageManager.PERMISSION_GRANTED);

        /*templets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Create2.this,temp.class);
                intent.putExtra("create","create2");
                startActivity(intent);

            }
        });*/
        Intent in =getIntent();
        C1=in.getStringExtra("c1");
        body.setText(C1);
    }
    public void Createpdf(View view) {
        String currentDateTimeString = java.text.DateFormat.getDateTimeInstance().format(new Date());
        String name="/myPDF "+currentDateTimeString+".pdf";

        PdfDocument myDocument = new PdfDocument();
        PdfDocument.PageInfo myPageInfo = new PdfDocument.PageInfo.Builder(card.getWidth(),card.getHeight(),1).create();
        PdfDocument.Page myPage = myDocument.startPage(myPageInfo);

        Paint myPaint = new Paint();
        Bitmap screen;
        card.buildDrawingCache();
        card.setDrawingCacheEnabled(true);
        screen = Bitmap.createBitmap(card.getDrawingCache());
        card.setDrawingCacheEnabled(false);
      /*  View v1 = view.getRootView();
        v1.setDrawingCacheEnabled(true);
        screen = Bitmap.createBitmap(v1.getDrawingCache());
        v1.setDrawingCacheEnabled(false);*/

        myPage.getCanvas().drawBitmap(screen,0,0,myPaint);
        myDocument.finishPage(myPage);

        String filePath = Environment.getExternalStorageDirectory().getPath() + name;
        File myFile = new File(filePath);
        try {
            myDocument.writeTo(new FileOutputStream(myFile));
            Toast.makeText(Create2.this,"Created in Internal Storage",Toast.LENGTH_LONG).show();

        }
        catch (Exception e){
            e.printStackTrace();
            Toast.makeText(Create2.this,"Error",Toast.LENGTH_LONG).show();
        }
        myDocument.close();


    }
}
