import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class Parent {
    private static int nextID = 1;
    protected String userName;
    protected String password;
    protected int parent_ID = 1;
    protected int currentChild_ID;

    public Parent(String username, String password, int newID){
        this.userName = username;
        this.password = password;
        if (newID==0){parent_ID = ++nextID;}
        else {parent_ID = newID};
    }
    public int getPID() {return this.parent_ID;}

}