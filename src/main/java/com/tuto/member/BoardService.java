package com.tuto.member;
import  java.util.List;

public interface BoardService {
    public int insertGwamog(BoardVO vo);
    public int deleteGwamog(int seq);
    public int updateGwamog(BoardVO vo);
    public BoardVO getGwamog(int seq);
    public List<BoardVO> getGwamogList();
}
