package com.vamsi.Service;

import com.vamsi.Repository.HelloRepository;

public class HelloServiceImpl implements HelloService {

	
	private HelloRepository hr;
	
	public HelloServiceImpl(HelloRepository hr) {
		this.hr=hr;
		
	}
	

	
	public String getit() {
		
		return hr.getMessage();
	}

}
