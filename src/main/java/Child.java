public class Child {
    protected String name;
    protected int child_ID;
    protected int age;
    protected int weight;
    protected int height;
    private static int nextID = 1;
    protected int parents_ID;


    public Child(int parent_ID, String name, int newID) {
        this.name = name;
        this.parents_ID = parent_ID;
        if(newID==0){child_ID = nextID++;}
        else{child_ID = newID};
    }
    public int getCID() {return this.child_ID;}
}
