/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.micmc23000.assignment2b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.github.micmc23000.assignment2b.User;//you may have to change this import depending on where you store the User class
import javax.ws.rs.Produces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author michael
 */

@Service
public class UserService {
 @Autowired
    UserService userService;
		 
    static List<User> userList = new ArrayList();

    static {
        userList.add(new User("bob", "pass", "SuperAdmin"));
        userList.add(new User("tom", "pass", "Admin"));
        userList.add(new User("mary", "pass", "User"));
      

    }

    public static List<User> getAllUsers() {
        return userList;
    }// end getAllUsers

    
    public boolean addAUser(User p) {
        return userList.add(p);
    }
	
	
	
	@GetMapping("/login")
	@PostMapping("/pages/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public int login(String username ,String password,List<User> userlist){
    List<User> allUsers = userService.getAllUsers();

        for (User b : allUsers){
		if(b.getUserName().equals(username)&&b.getPassword().equals(password)){
		if(b.getRole().equals("SuperAdmin")){
				return 3;}
		else if(b.getRole().equals("Admin")){
		return 2;}
		else if(b.getRole().equals("User")){
		return 1;}
		
		
		
			
		}
		
		}
		
		 return 0;
	}
	
@GetMapping("/pages/{id}")
    @Produces(MediaType.APPLICATION_JSON_VALUE)
    public ArrayList getLinks(@PathVariable("id")int Role){        
      List<String>getLinks = new ArrayList();
		if(Role==1){
			getLinks.add("/Product/all");}
			if(Role==2){
			getLinks.add("/Product/all");
			getLinks.add("/Product/add");}
		if(Role==3){
			getLinks.add("/Product/all");
			getLinks.add("/Product/add");
		getLinks.add("/Product/delete");}
		
		
       return .(beersID);
    }
		
	
       	
    public void deleteAUser(String code) {
        
        Iterator<User> iterator = userList.iterator();
        while (iterator.hasNext()) {
            User user = iterator.next();
            if (user.getUserName().equalsIgnoreCase(code)) {
                iterator.remove();
            }
        }
    }//end deleteAUser

}//end class UserService