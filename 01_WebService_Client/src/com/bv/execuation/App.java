package com.bv.execuation;

import com.bv.provider.HelloWorldImplService;
import com.bv.provider.Helloworld;

public class App {

	public static void main(String[] args) {
		HelloWorldImplService service = new HelloWorldImplService();
		Helloworld obj = service.getHelloWorldImplPort();
		System.out.println(obj.getdata("Pramod"));

	}

}
