package org.camp.servlet;

import java.io.IOException;
import java.util.Date;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FortuneTelling2
 */
@WebServlet("/FortuneTelling2")
public class FortuneTelling2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public FortuneTelling2() {
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

		//Resultスコープへ結果を設定
		ResultData data = new ResultData();
		data.setD(new Date());
		data.setLuck(luckList[index]);
		request.setAttribute("DATA", data);

		final String result = "/WEB-INF/FortuneTellingResult.jsp";
		RequestDispatcher rd = request.getRequestDispatcher(result);
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
