package org.camp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FortuneTelling
 */
@WebServlet("/FortuneTelling")
public class FortuneTelling extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public FortuneTelling() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");

		//大吉〜大凶の11要素
		String luckList[] = {"大吉", "中吉", "吉", "半吉", "末吉", "末小吉", "凶", "小凶", "半凶", "末凶", "大凶"};
		//乱数クラスを生成
		Random rand = new Random();
		Integer index = rand.nextInt(luckList.length);
		try(PrintWriter out = response.getWriter()){
			out.print("あなたの運勢は。。。" + luckList[index] + "!!");
		}

		response.getWriter().append("Served at:").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
