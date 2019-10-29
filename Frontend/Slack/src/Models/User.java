package Models;

import Controllers.DBSupport;

public class User {
    private String _name;
    private String _password;
    private int _id;
    /**
     * Create a workspace and call for the DBSUpport to request it put into the DB
     * @Author Dylan Mrzlak
     */
    
    public static User createUser(String name, String password, String passwordConfirm){
        if(password.compareTo(passwordConfirm) != 0)
            return null;//passwords do not match
        if(1==0)//TODO Name is taken. Don't know how to search the database to see if a name is taken.
            return null;
        User ret = new User;
        ret._name = name;
        ret._password = password;
        ret._id = 1;//TODO generate new unique ID number for the user.
        return ret;
    }
    
    public static boolean pinMessage(Message message){
        if(message.isPinned())
            return false;
        message.pin();//TODO once message is created
    }
    
    public static boolean createWorkspace(String workspaceName, String name){
        DBSupport.HTTPResponse result = DBSupport.joinWorkspace(workspaceName, name);
        return result.code < 300;
    }
}
