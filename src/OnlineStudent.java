public class OnlineStudent extends Student2{

    private String state;
    public OnlineStudent(){

    }
    public OnlineStudent(String firstName, String lastName, String state){
        super(firstName, lastName);
        this.state = state;
        setId(generateId());
    }

    public String generateId(){
        return (getFirstName().substring(0,3) + getLastName().substring(0,3) + state).toLowerCase();

    }

    @Override
    public String toString() {
        return super.toString() +
                "state='" + state + '\'' +
                '}';
    }
}
   /*


    Methods:
            -public String generateId() - override super class's method -> student's first and last name's first 3 letters + state
    Example: "Joe Biden" -> joebidde
  -toString() override Student class's toString to add id and state

*/