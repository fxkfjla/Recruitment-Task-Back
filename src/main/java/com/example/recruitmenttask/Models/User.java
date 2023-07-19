package com.example.recruitmenttask.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User
{
	public User() {}
	
	public User(String name, String surname, String login)
	{
		this.name = name;
		this.surname = surname;
		this.login = login;
	}
	
	public User(UserRequest user)
	{
		name = user.getName();
		surname = user.getSurname();
		login = user.getLogin();
	}
	
	// Getters, setters
	public String getName() { return name; }
	public String getSurname() { return surname; }
	public String getLogin() { return login; }
	public void setName(String name) { this.name = name; }
	public void setSurname(String surname) { this.surname = surname; }
	public void setLogin(String login) { this.login = login; }
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String surname;
	private String login;
}
