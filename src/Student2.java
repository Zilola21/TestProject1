public class Student2{
        private String firstName;
        private String lastName;
        private String id;

        public Student2(){

        }
        public Student2(String firstName, String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
        }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId(String s) {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String generateId(){
            return "";
    }

    @Override
    public String toString() {
        return "Student2{" +
                "firstName='" + firstName + '\'' +
                "lastName='" + lastName + '\'' + "id= " + id +
                '}';
    }
}



/*
  Create a class OnlineStudent as a subclass of Student with the following:

  Variables (private):
  String state

   Constructor:
  - initializes firstName and lastName and state
  - also in the body of the constructor initialize the id by calling the generateId() method


  Methods:
  -public String generateId() - override super class's method -> student's first and last name's first 3 letters + state
   Example: "Joe Biden" -> joebidde
  -toString() override Student class's toString to add id and state





  Create a class OnCampusStudent as a subclass of Student with the following:

  Variables (private):
  int badgeNo

   Constructor:
  - initializes firstName and lastName and badgeNo
  - also in the body of the constructor initialize the id by calling the generateId() method


  Methods:
  -public String generateId() - override super class's method -> student's first and last name's first 3 letters + badgeNo
   Example: "Joe Biden" badgeNo - 122  -> joebid122
  -toString() override Student class's toString to add badgeNo and id


  In the Main class:

   Create an array of Students with size 4.
   Add 4 different students(both online and oncampus)
   Use a loop to go through your array and call each object's toString() method
   */

