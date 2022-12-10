package com.tuto.member;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAO {
    @Autowired
    SqlSession sqlSession;

    public int insertBoard(BoardVO vo){
        int result = sqlSession.insert("Board.insertBoard",vo);
        return result;
    }
    public int deletBoard(int seq){
        int result = sqlSession.delete("Board.deletBoard",seq);
        return result;

    }
    public int updateBoard(BoardVO vo){
        int result = sqlSession.update("Board.updateBoard", vo);
        return result;

    }
    public BoardVO getBoard(int seq){
        BoardVO result = sqlSession.selectOne("Board.getBoard", seq);
        return result;
    }
    public List<BoardVO> getBoardList(){
        List<BoardVO> list = sqlSession.selectList("Board.getBoardList");
        return list;
    }


}