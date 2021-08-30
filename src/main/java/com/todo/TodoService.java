package com.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {
	
	private static List<Todo> todos = new ArrayList();

	static {
		todos.add(new Todo("team", "basket-ball"));
		todos.add(new Todo("team","football"));
		todos.add(new Todo("team","beach soccer"));
	}

	public List<Todo> retrieveTodos() {
		return todos;
	}
	
	public void addtodo(Todo todo) {
		todos.add(todo);
	}
	
	
}


