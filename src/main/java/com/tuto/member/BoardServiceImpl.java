package com.tuto.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BoardServiceImpl implements BoardService{
 @Autowired
 BoardDAO boardDAO;

    public int insertGwamog(BoardVO vo) {
        return boardDAO.insertGwamog(vo);
    }

    public int deleteGwamog(int seq) {
        return boardDAO.deletGwamog(seq);
    }

    public int updateGwamog(BoardVO vo) {
        return boardDAO.updateGwamog(vo);
    }

    public BoardVO getGwamog(int seq) {
        return boardDAO.getGwamog(seq);
    }

    public List<BoardVO> getGwamogList() {
        return boardDAO.getGwamogList();
    }

}
