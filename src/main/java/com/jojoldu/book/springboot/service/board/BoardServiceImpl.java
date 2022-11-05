package com.jojoldu.book.springboot.service.board;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jojoldu.book.springboot.dao.board.BoardMapper;
import com.jojoldu.book.springboot.domain.board.BoardVO;

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

}
