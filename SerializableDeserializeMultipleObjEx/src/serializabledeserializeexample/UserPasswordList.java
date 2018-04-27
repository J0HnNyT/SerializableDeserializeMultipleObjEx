/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializabledeserializeexample;

import java.io.Serializable;

/**
 *
 * @author johntaylor
 */
public class UserPasswordList implements Serializable {
    
    private String title;
    private String userName;
    private String password;
    private String note;
    
    UserPasswordList(String appSiteTitle, String asUserName, String asPassword, String asNote){
        this.title = appSiteTitle;
        this.userName = asUserName;
        this.password = asPassword;
        this.note = asNote;
    }
    
    UserPasswordList(String appSiteTitle, String asPassword, String asNote){
        this.title = appSiteTitle;
        this.userName = "";
        this.password = asPassword;
        this.note = asNote;
    }
    
        UserPasswordList(String appSiteTitle, String asPassword){
        this.title = appSiteTitle;
        this.userName = "";
        this.password = asPassword;
        this.note = "";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    
    @Override
    public String toString(){
        return String.format(getTitle() + getUserName() + getPassword() + getNote());
    }
    
}
