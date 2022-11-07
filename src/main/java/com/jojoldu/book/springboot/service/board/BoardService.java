package com.jojoldu.book.springboot.service.board;

import java.util.List;


import com.jojoldu.book.springboot.domain.board.BoardVO;

public interface BoardService {
	
	List<BoardVO> getBoardList();
	
	BoardVO getBoardDetail(int userId);

	void addViewCount(int id);

}
