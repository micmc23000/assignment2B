package com.github.micmc23000.assignment2b;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michael
 */
public class User {
    
    
    private String userName;
    private String password;
    private String role;
    
    public User() {
    }

    public User( String userName, String password, String role) {
     
        this.userName = userName;
        this.password = password;
        this.role = role;
      
    }



    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the role
     */
    public String getRole() {
        return role;
    }

    /**
     * @param role the role to set
     */
    public void setRole(String role) {
        this.role = role;
    }

 

   

    @Override
    public String toString() {
        return "User{" +  ", userName=" + userName + ", password=" + password + ", role=" + role +'}';
    }

}
