package com.app.raghu.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
//@Profile //this is helps to run this application on every environment(if u don't mention any profile then container will take "default"
//@Profile("default")  //this is helps to run this application on developer environment
@Profile({"qa","default","uat"})
public class DbUserSetupRunner implements CommandLineRunner {

	public void run(String... args) throws Exception {
		System.out.println("FROM DbUser SETUP RUNNER");
	}

}
