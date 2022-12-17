package com.tuto.member;
import com.tuto.*;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAO {
    @Autowired
    SqlSession sqlSession;

    public int insertGwamog(BoardVO vo){
        int result = sqlSession.insert("Gwamog.insertGwamog",vo);
        return result;
    }
    public int deletGwamog(int seq){
        int result = sqlSession.delete("Gwamog.deleteGwamog",seq);
        return result;

    }
    public int updateGwamog(BoardVO vo){
        int result = sqlSession.update("Gwamog.updateGwamog", vo);
        return result;

    }
    public BoardVO getGwamog(int seq){
        BoardVO result = sqlSession.selectOne("Gwamog.getGwamog", seq);
        return result;
    }
    public List<BoardVO> getGwamogList(){
        List<BoardVO> list = sqlSession.selectList("Gwamog.getGwamogList");
        return list;
    }


}