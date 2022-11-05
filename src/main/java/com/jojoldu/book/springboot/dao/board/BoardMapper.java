package com.jojoldu.book.springboot.dao.board;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.jojoldu.book.springboot.domain.board.BoardVO;

@Mapper
@Repository
public interface BoardMapper {
	List<BoardVO> getBoardList();
	
	BoardVO getBoardDetail(int userId);

}
