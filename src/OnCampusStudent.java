public class OnCampusStudent extends Student2{
    private int badgeNo;

    public OnCampusStudent(){

    }
    public OnCampusStudent(String firstName, String lastName, int badgeNo){
        super(firstName, lastName);
        this.badgeNo = badgeNo;
        setId(generateId());
    }


    public String generateId() {
        return (getFirstName().substring(0,3) + getLastName().substring(0,3) + badgeNo).toLowerCase();
    }

    @Override
    public String toString() {
        return super.toString() +
                "badgeNo=" + badgeNo +
                '}';
    }
}
    /*
        Methods:
        -public String generateId() - override super class's method -> student's first and last name's first 3 letters + badgeNo
        Example: "Joe Biden" badgeNo - 122  -> joebid122
        -toString() override Student class's toString to add badgeNo and id


        In the Main class:

        Create an array of Students with size 4.
        Add 4 different students(both online and oncampus)
        Use a loop to go through your array and call each object's toString() method
        */
