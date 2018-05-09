package model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Action {
	
	public ActionData execute(
			HttpServletRequest request,
			HttpServletResponse response );

}
