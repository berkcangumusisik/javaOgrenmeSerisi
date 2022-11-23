public class Teacher {
    String name;
    String branch;
    String mpNo;
    public Teacher(String name, String branch, String mpNo) {
        this.name = name;
        this.branch = branch;
        this.mpNo = mpNo;
    }
    void print() {
        System.out.println("İsim: " + this.name);
        System.out.println("Branş: " + this.branch);
        System.out.println("Telefon No: " + this.mpNo);
    }
}
