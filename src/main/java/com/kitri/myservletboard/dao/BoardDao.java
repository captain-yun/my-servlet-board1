package com.kitri.myservletboard.dao;

import com.kitri.myservletboard.data.BoardDto;
import com.kitri.myservletboard.data.BoardVO;

import java.util.ArrayList;

public interface BoardDao {
    BoardVO getById();
    ArrayList<BoardVO> getAll();
    void save(BoardDto board);
    void update(BoardDto board);
    void delete();
}
