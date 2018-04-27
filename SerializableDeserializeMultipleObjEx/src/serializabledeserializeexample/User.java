/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializabledeserializeexample;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author johntaylor
 */
public class User implements Serializable{
    
    private String name;
    private String password;
    private ArrayList userList;
    
    
    User(String UserName, String Password){
        this.name = UserName;
        this.password = Password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String Password) {
        this.password = Password;
    }

    public ArrayList<UserPasswordList> getUserList() {
        return userList;
    }

    public void setUserList(ArrayList<UserPasswordList> userList) {
        this.userList = userList;
    }
    
    
    @Override
    public String toString(){
        return String.format("User Name: " + this.name + "\nPassword: " + this.password);
    }
    
}//End student class.
