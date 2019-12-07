import java.time.LocalDate;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class main {
    private Boolean SignUp(String userName, String password){
        Parent P = new Parent(userName, password, 0);
        //Store parent in DB
        return TRUE;
    }

    private Boolean LogIn(String userName, String password){
        if (CheckPassword(userName, password)==TRUE){
            //Get details from DB
            Parent P = new Parent(userName, password, parent_ID);
            return TRUE;
        }
        else {
            //Display error
            return FALSE;
        }
    }
    private Boolean CheckPassword(String userName, String password){
        //Search database for password
        if(DBpassword==password) return TRUE;
        else return FALSE;
    }



    public void makeChild(int parent_ID, String name){
        Child C = new Child(parent_ID, name);
        //Upload child to DB
    }

    public void selectChild(int child_ID){
        //search DB using child_ID to get his name
        Child C = new Child(parent_ID, name)
    }


    public void makeDay(String answers, LocalDate Day_ID){
        if(checkDay(Day_ID)==FALSE){
            Day(answers, P.getPID, C.getCID, Day_ID)
        }
        rewriteDay(answers, Day_ID)
    }

    public Boolean checkDay(LocalDate Day_ID){
        if (/*check database for today's entry*/) return TRUE;
        else return FALSE;
    }

    public void rewriteDay(String newAnswers, LocalDate OldDay_ID){
        //go to OldDay in DB and replace old answers with newAnswers
    }
}
