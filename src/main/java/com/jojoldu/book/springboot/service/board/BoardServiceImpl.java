package com.jojoldu.book.springboot.service.board;

import com.jojoldu.book.springboot.dao.board.BoardMapper;
import com.jojoldu.book.springboot.domain.board.BoardVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("boardService")
public class BoardServiceImpl implements BoardService{
	
	@Resource(name = "boardMapper")
	private BoardMapper boardMapper;

	@Override
	public List<BoardVO> getBoardList() {
		List<BoardVO> getBoardList = boardMapper.getBoardList();
		return getBoardList;
	}

	@Override
	public BoardVO getBoardDetail(int userId) {
		BoardVO getBoardDetail = boardMapper.getBoardDetail(userId);
		return getBoardDetail;
	}

	@Override
	public void addViewCount(int id) {
		boardMapper.addViewCount(id);
	}

}
