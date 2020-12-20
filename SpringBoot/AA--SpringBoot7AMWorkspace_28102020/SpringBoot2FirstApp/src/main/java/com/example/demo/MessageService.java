package com.example.demo;

import org.springframework.stereotype.Component;

//ctrl+shift+O (imports)

@Component
public class MessageService {

	public void getMsg() {
		System.out.println("FROM FIRST APP");
	}
}
