/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializabledeserializeexample;

import java.io.EOFException;
import java.util.ArrayList;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class SerializableDeserializeExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, EOFException, ClassNotFoundException {
        /**
         * serialize (write) the object to a binary text file.
         * serializable is implemented in the Student class
         * 'public class Student implements serializable'
         */
               
        //Create an example Array list of student objects.
        ArrayList<User> sl = new ArrayList<>();
        sl.add(new User("Jake", "!Pa55word"));
        sl.add(new User("Jennifer@email.com", "@pA22word"));
        sl.add(new User("Jace$", "Pa$$w0rd2"));

        //Save the file to binary text file named students.txt
        File file = new File("studentsList.txt");
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        //write all of the objects with an enhanced for loop.
        for(User s: sl){
            oos.writeObject(s);
        }
        
        //**Important Always close the streams**
        fos.close();
        oos.close();
        
        /**
         * Retreive (read) the data student objects back.
         */
        
        //reads the data back in.
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        //new Array list to add students back to.
        ArrayList<User> returnSL = new ArrayList<>();
        
        //** Required try and catch block while loop to promote student objects back.
        try{
            while(true){
                
                User rsl = (User) ois.readObject();
                returnSL.add(rsl);
            }
            
        }catch(EOFException eofex){}
        
        //read back to screen to confirm student object retrievement.
        for(User confirm: returnSL){
            System.out.println(confirm);
        }

        
        System.out.println("\n");
        
        //*Checking the UserPasswordList object list
        ArrayList<UserPasswordList> userList = new ArrayList<>();
        userList.add(new UserPasswordList("Adobe", "jake1", "!Pa55word2", "app note here"));
        userList.add(new UserPasswordList("Gmail", "jake@email.com", "!Pa55woRD", "site note"));
        userList.add(new UserPasswordList("Office","!Pa55word2", "just a note"));
        userList.add(new UserPasswordList("Amazon","!Pa55word2"));
        //*/
     
        File passList = new File("userPasswordList.upvf");
        FileOutputStream fosL = new FileOutputStream(passList);
        ObjectOutputStream oosL = new ObjectOutputStream(fosL);
             
        //write all of the objects with an enhanced for loop.
        for(UserPasswordList sL: userList){
            oosL.writeObject(sL);
        }
        
        //**Important Always close the streams**
        fos.close();
        oos.close();
        
        /**
         * Retreive (read) the data student objects back.
         */
        
        //reads the data back in.
        FileInputStream fisL = new FileInputStream(passList);
        ObjectInputStream oisL = new ObjectInputStream(fisL);
        
        //new Array list to add students back to.
        ArrayList<UserPasswordList> returnPL = new ArrayList<>();
        
        //** Required try and catch block while loop to promote student objects back.
        try{
            while(true){
                
                UserPasswordList rpl = (UserPasswordList) oisL.readObject();
                returnPL.add(rpl);
            }
            
        }catch(EOFException eofex){}
        
        //read back to screen to confirm student object retrievement.
        for(UserPasswordList confirmP: returnPL){
            System.out.println(confirmP);
        }
        
        
        System.out.println("\n");
        
        ArrayList<User> JakePassList = new ArrayList<>();
        User Jake = new  User("jake", "!Pa55word");
        JakePassList.add(Jake);
        ArrayList<UserPasswordList> jakeList = new ArrayList<>();
        jakeList.add(new UserPasswordList("Photoshop", "jake1", "!Pa55word2", "app note here"));
        jakeList.add(new UserPasswordList("Google", "jake@email.com", "!Pa55woRD", "site note"));
        jakeList.add(new UserPasswordList("Windows","!Pa55word2", "just a note"));
        jakeList.add(new UserPasswordList("application","!Pa55word2"));
        
        Jake.setUserList(jakeList);
        
        User Jake2 = new  User("jake2", "!Pa55word2");
        JakePassList.add(Jake2);
        ArrayList<UserPasswordList> jakeList2 = new ArrayList<>();
        jakeList2.add(new UserPasswordList("App", "jake2", "!Pa55word2", "new app note here"));
        jakeList2.add(new UserPasswordList("Site", "jake2@email.com", "!Pa55woRD", "new site note"));
        jakeList2.add(new UserPasswordList("Appllication","!Pa55word2", "a note"));
        jakeList2.add(new UserPasswordList("App","!Pa55word2"));
        
        Jake2.setUserList(jakeList2);
        
        
        File jList = new File("jake.upvf");
        FileOutputStream fosJ = new FileOutputStream(jList);
        ObjectOutputStream oosJ = new ObjectOutputStream(fosJ);
             
        //write all of the objects with an enhanced for loop.
        for(User jL: JakePassList){
            oosJ.writeObject(jL);
        }
        
        //**Important Always close the streams**
        fosJ.close();
        oosJ.close();
        
        /**
         * Retreive (read) the data student objects back.
         */
        
        //reads the data back in.
        FileInputStream fisJ = new FileInputStream(jList);
        ObjectInputStream oisJ = new ObjectInputStream(fisJ);
        
        //new Array list to add students back to.
        ArrayList<User> returnPJ = new ArrayList<>();
        User rpJ = null;
        
        //** Required try and catch block while loop to promote student objects back.
        try{
            
            while(true){
                
                rpJ = (User) oisJ.readObject();
                returnPJ.add(rpJ);
            }
                        
        }catch(EOFException eofex){}
        
        ArrayList<UserPasswordList> userList1 = rpJ.getUserList();
                
        //read back to screen to confirm JakePassList User object retrievement
        //with all User Password lists.
        for(User confirmJ: returnPJ){
            System.out.println(confirmJ);
                            
            for(UserPasswordList ujl: userList1){
                System.out.printf("\t" + ujl + "\n");
            }                  
        }
        
        //System.out.println();
        
    }//End main.
    
}//End class.
