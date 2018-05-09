package board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Action;
import model.ActionData;
import model.BoardDAO;
import model.BoardVO;

public class ModifyReg implements Action {

	@Override
	public ActionData execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		BoardVO vo = new BoardVO();
		vo.setId(Integer.parseInt(request.getParameter("id")));
		vo.setPw(request.getParameter("pw"));
		vo.setPname(request.getParameter("pname"));
		vo.setTitle(request.getParameter("title"));
		vo.setContent(request.getParameter("content"));
		
		String page = request.getParameter("page");
				
		BoardDAO dao = new BoardDAO();
		BoardVO res = dao.sch(vo);
		
		String msg = "암호 인증 실패";
		String url = "ModifyForm?id="+vo.getId() + "&page=" + page;
		
		if(res!=null) {
			
			if(request.getParameter("upfile")!=null) {
				vo.setUpfile(request.getParameter("upfile"));			
			}else {
				vo.setUpfile(new InsertReg().fileUpload(request));
			}

			dao.modify(vo);
			msg="변경되었습니다.";
			url="Detail?id=" + vo.getId() + "&page=" + page;
		}
		
		dao.close();
		
		request.setAttribute("msg", msg);
		request.setAttribute("url", url);
		request.setAttribute("main", "alert.jsp");
		
		return new ActionData();
	}

}
