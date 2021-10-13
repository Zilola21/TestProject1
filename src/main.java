
class main2 {
    public static void main(String[] args) {
        Student2[] students = new Student2 []{new OnCampusStudent("Joe","Biden",45),
                new OnCampusStudent("George", "Bush", 45), new OnlineStudent("Albert", "Gore", "NYC"),
                new OnlineStudent("Bill", "Clinton", "AR")};
        for(Student2 student2: students){
            System.out.println(student2);
        }
    }
}
