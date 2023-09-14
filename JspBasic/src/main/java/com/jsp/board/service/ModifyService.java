package com.jsp.board.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.board.model.BoardRepository;

public class ModifyService implements IBoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		int bId = Integer.parseInt(request.getParameter("bId"));
		request.setAttribute("article", BoardRepository.getInstance().getContent(bId)); 
		request.setAttribute("boardNo", bId);
		//응답나가면 사라짐 !
		//리퀘에 셋팅하겠따 ! bId 를
		
	}

}
