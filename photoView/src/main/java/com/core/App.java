package com.core;

import com.google.gson.Gson;

public class App {
	private String name;
	private String addr;

	App(String name, String addr) {
		this.name = name;
		this.addr = addr;
	}

	public static void main(String args[]) {
		App app = new App("sss", "xxx");
		System.out.println(new Gson().toJson(app));
	}
}
