package board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Action;
import model.ActionData;
import model.BoardDAO;
import model.BoardVO;

public class ReplyReg implements Action {

	@Override
	public ActionData execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		
		BoardVO vo = new BoardVO();
		vo.setId(Integer.parseInt(request.getParameter("id")));
		vo.setTitle(request.getParameter("title"));
		vo.setPname(request.getParameter("pname"));
		vo.setPw(request.getParameter("pw"));
		vo.setContent(request.getParameter("content"));
				
		int id = new BoardDAO().reply(vo);
		
		ActionData data = new ActionData();
		
		data.setRedirect(true);
		data.setPath("Detail?id="+id +"&page="+request.getParameter("page"));
		
		return data;
	}

}
