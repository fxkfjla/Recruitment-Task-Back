package com.example.recruitmenttask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.recruitmenttask.Utils.XMLDataHandler;

@SpringBootApplication
public class RecruitmenttaskApplication
{
	public static void main(String[] args)
	{
		XMLDataHandler.generateUsersToXML(50000, "users.xml", true);
		
		SpringApplication.run(RecruitmenttaskApplication.class, args);
	}
}