package ex01;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Exam01
 */
@WebServlet("/Exam01")
public class Exam01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	int initCount =1;
	int dogetCount =1;
	int destoryCount =1;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Exam01() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		//서버가 처음 호출되었을 때 한번만 호출
		System.out.println("init 메서드 호출 : " + initCount++);
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		//서버가 중지되었을 때 호출
		System.out.println("destory 메서드 호출 : " + destoryCount++);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//새로고침할 때마다 호출
		System.out.println("doget 메서드 호출 : "+ dogetCount++);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
