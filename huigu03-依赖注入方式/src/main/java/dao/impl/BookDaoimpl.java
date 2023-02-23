package dao.impl;

import dao.BookDao;

public class BookDaoimpl implements BookDao {
    int connectionNum;
    String databaseName;

    public void setConnectionNum(int connectionNum) {
        this.connectionNum = connectionNum;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public void save(){
        System.out.println("book dao save..."+","+databaseName+","+connectionNum);
    }
}
