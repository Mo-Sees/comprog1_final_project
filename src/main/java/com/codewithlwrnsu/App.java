package com.codewithlwrnsu;

import database.Database;

public class App
{
    public static void main( String[] args ) {

        Database connect = new Database();
        connect.connect();



    }
}
