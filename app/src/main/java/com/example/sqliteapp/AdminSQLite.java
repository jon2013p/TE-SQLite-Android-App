package com.example.sqliteapp;

import  android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Creado por Sebastián Morales, Nicole Zambrano, Chantal Morales, Kevin Segovia e Israel Vásquez
 */

public class AdminSQLite extends SQLiteOpenHelper {

    public AdminSQLite(Context context, String name, SQLiteDatabase.CursorFactory factory, int version){
        super(context,name,factory, version);
    }


    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL("create table articulos(codigo int primary key, descripcion text, precio real)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

    }

}
