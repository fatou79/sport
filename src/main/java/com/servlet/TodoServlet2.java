package com.servlet;
import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.LoginService;
import com.todo.Todo;
import com.todo.TodoService;


@WebServlet(urlPatterns = "/todo.do")

public class TodoServlet2 extends HttpServlet {
	
	private LoginService service = new LoginService();
	private TodoService todoService = new TodoService();
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		request.setAttribute("todos", todoService.retrieveTodos());

		request.getRequestDispatcher("/WEB-INF/views/todo.jsp").forward(request, response);
	}
	
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String newTodo = request.getParameter("todo");
		String cat = request.getParameter("catego");
		todoService.addtodo(new Todo(newTodo, cat));
		request.setAttribute("todos", todoService.retrieveTodos());

		request.getRequestDispatcher("/WEB-INF/views/todo.jsp").forward(request, response);
	}
	
}
	
	

