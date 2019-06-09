package com.app.runner;

import java.security.Provider.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.service.INotificationService;
@Component
public class NotificationRunner implements CommandLineRunner {

	@Autowired
	private INotificationService Service;
	
	@Override
	public void run(String... args) throws Exception {

		Service.notificate();
	}

}
