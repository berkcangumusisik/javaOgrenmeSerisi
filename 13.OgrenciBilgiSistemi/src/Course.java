public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int verbal;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
    }

    void addTeacher(Teacher t){
        if(this.prefix.equals(t.branch)){
            this.teacher = t;
            printTeacher();
        }
        else{
            System.out.println("Böyle bir öğretmen bulunamadı");
        }
    }
    void printTeacher() {
        this.teacher.print();
    }
}
