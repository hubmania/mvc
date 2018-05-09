package board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Action;
import model.ActionData;
import model.BoardDAO;

public class Detail implements Action {
	
	@Override
	public ActionData execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		ActionData data = new ActionData();
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		BoardDAO dao = new BoardDAO();
		dao.addCount(id);
		
		request.setAttribute("data", dao.detail(id));
		request.setAttribute("main","detail.jsp");
		dao.close();
		
		return data;
	}
}
