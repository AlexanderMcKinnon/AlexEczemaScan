import java.time.LocalDate;

public class Day {
    protected String answers;
    protected int parent_ID;
    protected int child_ID;
    protected LocalDate Day_ID;


    public Day(String answers, int parent_ID, int child_ID, LocalDate Day_ID){
        this.answers = answers;
        this.Day_ID = Day_ID;
        this.parent_ID = parent_ID;
        this.child_ID = child_ID;
    }
}
