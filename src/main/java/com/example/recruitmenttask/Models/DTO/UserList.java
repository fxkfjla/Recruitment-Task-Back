package com.example.recruitmenttask.Models.DTO;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.example.recruitmenttask.Models.User;

@XmlRootElement(name = "users")
public class UserList
{
	public UserList() {}
	
	public UserList(List<User> users)
	{
		this.userList = users;
	}
	
	// Getters, setters
	@XmlElement(name = "user")
	public List<User> getUsers() { return userList; }
	public void setUsers(List<User> users) { this.userList = users; }
	
	private List<User> userList;
}