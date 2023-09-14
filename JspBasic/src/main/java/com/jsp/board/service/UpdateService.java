package com.jsp.board.service;


import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.board.model.BoardRepository;
import com.jsp.board.model.BoardVO;

public class UpdateService implements IBoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		//샤롭게 입력받은 수정값으로 BoardVO객체를 생성해서 수정을 진행하세요.
		// 기존 리스트에 존재하는 객체를 새로운 객첼 교체
		// 수정이 완료되면 수정된 글의 상세보기 페이지로 응답이 나가야합니다.
		
		//form 에서 넘어오는 데이터 받기
		int bId = Integer.parseInt(request.getParameter("boardNo"));
		String writer = request.getParameter("writer");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		LocalDateTime updateTime = LocalDateTime.now();
		
		BoardVO vo = new BoardVO(writer,title,content,updateTime);
		// BoardVO vo = new BoardVO(
						//request.getParameter("writer"),
						//request.getParameter("title"),
						//request.getParameter("content"),
						//LocalDateTime.now();
		
		BoardRepository.getInstance().update(vo, bId);
	
		
		
		
	}

}
