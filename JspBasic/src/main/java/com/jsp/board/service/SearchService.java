package com.jsp.board.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.board.model.BoardRepository;
import com.jsp.board.model.BoardVO;

public class SearchService implements IBoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		//뭐라고 검색했는지 받아오기
		String keyword = request.getParameter("keyword");
		List<BoardVO> list = BoardRepository.getInstance().search(keyword);
		request.setAttribute("boardList", list);
	}

}
