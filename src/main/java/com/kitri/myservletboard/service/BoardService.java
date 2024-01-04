package com.kitri.myservletboard.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BoardService {
    // 싱글톤 객체로 만들기
    private BoardService() {};
    private static final BoardService instance = new BoardService();
    
    public static BoardService getInstance() {
        return instance;  
    }

    public void list(HttpServletRequest request, HttpServletResponse response) {
        // 1. 데이터베이스에 저장되어 있는 게시글 목록을 가져온다.
        // 2. 가져온 게시글 목록을 전부 request의 setAttribute를 통해 모델에 담는다.

    }

    public void create(HttpServletRequest request, HttpServletResponse response) {
    }

    public void update(HttpServletRequest request, HttpServletResponse response) {
    }

    public void delete(HttpServletRequest request, HttpServletResponse response) {
    }
}
