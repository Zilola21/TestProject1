public class Email {
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String password;
    private int capacity;
    private int maxAttachments;
    private String DOMAIN_NAME = "duotech.io";

  public Email(){

  }

    public Email(String firstName, String lastName){
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

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getMaxAttachments() {
        return maxAttachments;
    }

    public void setMaxAttachments(int maxAttachments) {
        this.maxAttachments = maxAttachments;
    }

    public String getDOMAIN_NAME() {
        return DOMAIN_NAME;
    }

    public void setDOMAIN_NAME(String DOMAIN_NAME) {
        this.DOMAIN_NAME = DOMAIN_NAME;
    }
    public String generateEmail(){
        return "";
    }
    public String generatePassword(){
        return "";
    }

    @Override
    public String toString() {
        return "Email{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", password='" + password + '\'' +
                ", capacity=" + capacity +
                ", maxAttachments=" + maxAttachments +
                '}';

    }
}
/*
Steps:




        B. Implement the class StudentEmail which is a subclass of Email

        It contains the following:

        Data field with private visibility:

        batchNo - represents batchNo of the student.

        Constructor:

        constructor that accepts and initializes firstName , lastName and batchNo. Besides that it needs to do the following:

        initializes emailAddress using generateEmail() method.
        initializes password using generatePassword() method.
        initializes capacity to 25.
        initializes maxAttachmentSize to 50.
        Methods:

        generateEmail() - override it so it returns the following: firstName + . + lastName + _b + batchNo + @ + student. + DOMAIN_NAME Example: Bahar Mahmud, batch 5 -> bahar.mahmud_b5@student.duotech.io

generatePassword() - override it so it returns the following: random password with length 8 that consists of lowercase, uppercase chars and numbers Example: gad6FshR

        toString() - override it so it returns the info in following format (use super class's toString() for super class field values): TYPE: Student BATCH NO: batchNo NAME: firstName + lastName GENERATED EMAIL ADDRESS: emailAddress GENERATED PASSWORD: password CAPACITY: capacity MAX ATTACHMENT SIZE: maxAttachmentSize


        C. Implement the class StaffEmail which is a subclass of Email

        It contains the following:

        Data fields with private visibility:

        departmentId - represents the department id of the staff member as int. 1 represents Accounting 2 represents Sales 3 represents Marketing 4 represents Instructors
        DEPARTMENTS - represents a constant, a String array that holds all departments values. It should be initialized to hold "Accounting", "Sales", "Marketing", "Instructors" departments.

        Constructor:

        constructor that accepts and initializes firstName , lastName and departmentId. Besides that it needs to do the following:

        initializes emailAddress using generateEmail() method.
        initializes password using generatePassword() method.
        initializes capacity to 50.
        initializes maxAttachmentSize to 100.
        Methods:

        generateEmail() - override it so it returns the following: firstName + . + lastName + _d + departmentId + @ + department + . + DOMAIN_NAME Example: Akmal Bek, departmentId 4 (Instructors) -> akmal.bek_d4@instructors.duotech.io

        generatePassword() - override it so it returns the following: random password with length 8 that consists of lowercase, uppercase chars and numbers and special chars such as !@#$%^&*() Example: $Qcr48hJ

        toString() - override it so it returns the info in following format (use super class's toString() for super class field values): TYPE: Student BATCH NO: batchNo NAME: firstName + lastName GENERATED EMAIL ADDRESS: emailAddress GENERATED PASSWORD: password CAPACITY: capacity MAX ATTACHMENT SIZE: maxAttachmentSize





        D. Implement application logic in Main class:

        Your application should do the following:

        - Asks the user about the number of emails he/she wants to generate (hint: create and store them in an array of super type)
        - Creates the corresponding number of emails, where it asks the following info for each email:
        - The type of the email
        - First name
        - Last name
        - Batch Number, if it is for a student email
        - Department ID, if it is for a staff email
*/