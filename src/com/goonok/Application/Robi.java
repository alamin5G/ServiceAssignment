package com.goonok.Application;
import com.goonok.Interface.*;

public class Robi {

	private Service service;

	public void setService(Service service) {
		this.service = service;
	}
	
	public void activateService() {
		service.service();
	}
}
