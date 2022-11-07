package com.jojoldu.book.springboot.web;

import com.jojoldu.book.springboot.domain.board.BoardVO;
import com.jojoldu.book.springboot.service.board.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/board")
    public String selectPostList(Model model) {

        List<BoardVO> boardList = boardService.getBoardList();
        model.addAttribute("boardList", boardList);
        return "board";
    }

    @GetMapping("/board/detail")
    public String selectPostDetail(@RequestParam int id, Model model) {

        boardService.addViewCount(id);
        BoardVO post = boardService.getBoardDetail(id);
        model.addAttribute("post",post);

        return "boardDetail";
    }

}
