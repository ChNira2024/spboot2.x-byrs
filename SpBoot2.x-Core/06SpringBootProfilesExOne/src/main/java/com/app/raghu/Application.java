package com.app.raghu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
//by default run take application.properties(if u den't specify any environment)
//if u want ur own choice environment then right click project->Run as Configuration then select profile(as prod,qa,sit..etc) or select Arguments and 
//enter --spring.profiles.active=prod or qa or sit

//To run ur project jar in different environment using cmd: 
//C:\sts\Niranjana_Code\Niranjana_SpringCode\Spring_ByRS\06SpringBootProfilesExOne\target>java -jar 06SpringBootProfilesExOne-1.0.jar --spring.profiles.active=qa

//3 ways u can execute: 
//1way)run as configuration->select profile ->apply->run
//2nd way)run as configuration-> select Arguments and enter --spring.profiles.active=prod or qa or sit
//3rd way)right click project->Run as->maven clean ->maven build->specify goal(clean install)->here .jar will create->then refresh ur project and see the target folder for .jar file
//then go to location and run in cmd : C:\sts\Niranjana_Code\Niranjana_SpringCode\Spring_ByRS\06SpringBootProfilesExOne\target>java -jar 06SpringBootProfilesExOne-1.0.jar --spring.profiles.active=qa

//In default profile,if key-value not there then its value will take as null
//In own choice profile(prod,qa,sit),if key-value not there then its value will take from default profile