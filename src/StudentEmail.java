public class StudentEmail extends Email{
        private int batchNO;

   public StudentEmail(){

   }


    public StudentEmail(String firstName, String lastName, int batchNO, String emailAddress, String password, int capacity, int maxAttachmentSize) {
        super(firstName, lastName);
        this.batchNO = batchNO;
        setPassword(generatePassword());
        setEmailAddress(generateEmail());
        setCapacity(25);
        setMaxAttachments(50);
    }

    @Override
    public String generateEmail() {
        return super.generateEmail();
    }

    @Override
    public String generatePassword() {
        return super.generatePassword();
    }

    @Override
    public String toString() {
        return "StudentEmail{" +
                "batchNO=" + batchNO + super.toString() +
                '}';
    }

}


    /*
B. Implement the class StudentEmail which is a subclass of Email

        Methods:

        generateEmail() - override it so it returns the following: firstName + . + lastName + _b + batchNo + @ + student. + DOMAIN_NAME Example: Bahar Mahmud, batch 5 -> bahar.mahmud_b5@student.duotech.io

        generatePassword() - override it so it returns the following: random password with length 8 that consists of lowercase, uppercase chars and numbers Example: gad6FshR

        toString() - override it so it returns the info in following format (use super class's toString() for super class field values): TYPE: Student BATCH NO: batchNo NAME: firstName + lastName GENERATED EMAIL ADDRESS: emailAddress GENERATED PASSWORD: password CAPACITY: capacity MAX ATTACHMENT SIZE: maxAttachmentSize

     */