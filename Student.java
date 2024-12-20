public class Student {

    private String SID ;
    private String firstName ;
    private String lastName ;

    public Student(String SID , String firstName ,String lastName) {
        this.SID = SID ;
        this.firstName = firstName ;
        this.lastName = lastName ;
    }

    public String getSID() {
        return SID ;
    }

    public String getFirstName() {
        return firstName ;
    }

    public String getLastName() {
        return lastName ;
    }

    @Override
    public String toString() {
        return this.SID + " " + this.firstName + " " + this.lastName ;
    }
    
}