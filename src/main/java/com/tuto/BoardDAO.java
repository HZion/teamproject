package com.tuto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.tuto.BoardVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAO {
    @Autowired
    JdbcTemplate jdbcTemplate;
    //Connection conn = null;
    //PreparedStatement stmt = null;
    //ResultSet rs = null;

    private final String BOARD_INSERT = "insert into BOARD (title, writer, content) values (?,?,?)";
    private final String BOARD_UPDATE = "update BOARD set title=?, writer=?, content=? where seq=?";
    private final String BOARD_DELETE = "delete from BOARD  where seq=?";
    private final String BOARD_GET = "select * from BOARD  where seq=?";
    private final String BOARD_LIST = "select * from BOARD order by seq desc";

    public int insertBoard(BoardVO vo) {
        System.out.println("===> JDBC로 insertBoard() 기능 처리");

		/*try {
			conn = JDBCUtil.getConnection();
			stmt = conn.prepareStatement(BOARD_INSERT);
			stmt.setString(1, vo.getTitle());
			stmt.setString(2, vo.getWriter());
			stmt.setString(3, vo.getContent());
			stmt.executeUpdate();
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
		}*/
        return jdbcTemplate.update(BOARD_INSERT,new Object[]{vo.getTitle(),vo.getWriter(),vo.getContent()});
    }

    // 글 삭제
    public int deleteBoard(/*BoardVO vo*/ int seq) {
        System.out.println("===> JDBC로 deleteBoard() 기능 처리");

        return jdbcTemplate.update(BOARD_DELETE,
                new Object[]{seq});
    }

    public int updateBoard(BoardVO vo) {
        System.out.println("===> JDBC로 updateBoard() 기능 처리");

        return jdbcTemplate.update(BOARD_UPDATE,
                new Object[]{vo.getTitle(),vo.getWriter(),vo.getContent(),vo.getSeq()});

    }

    public BoardVO getBoard(int seq) {
        BoardVO one = new BoardVO();
        System.out.println("===> JDBC로 getBoard() 기능 처리");
        return jdbcTemplate.queryForObject(BOARD_GET, new Object[]{seq},new BeanPropertyRowMapper<BoardVO>(BoardVO.class));

    }

    public List<BoardVO> getBoardList() {
        return jdbcTemplate.query(BOARD_LIST, new RowMapper<BoardVO>() {
            @Override
            public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException {
                BoardVO data =new BoardVO();
                data.setSeq(rs.getInt("seq"));
                data.setTitle(rs.getString("title"));
                data.setRegdate(rs.getDate("regdate"));
                data.setWriter(rs.getString("writer"));
                data.setContent(rs.getString("content"));
                return data;
            }
        });

    }


}