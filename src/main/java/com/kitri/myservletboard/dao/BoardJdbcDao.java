package com.kitri.myservletboard.dao;

public class BoardJdbcDao {
    private BoardJdbcDao() {};
    private static final BoardJdbcDao instance = new BoardJdbcDao();

    public static BoardJdbcDao getInstance() {
        return instance;
    }



}
