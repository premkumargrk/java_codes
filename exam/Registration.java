package exam;

public final class Registration {
    private final String StudentID;
    private final StringBuilder details;

    /*public*/ 
    public Registration (String ID, String name){
        this.StudentID=ID;
        this.details=new StringBuilder(name);
    }
    public void register(final String sub){
        final int fee=500;
        System.out.println("Student: "+StudentID+ "registered subject: "+sub+"(fee =" +fee+")");
    }
    public void showdetails(){
        System.out.println("ID: "+StudentID+", name: "+details);
    }
}
