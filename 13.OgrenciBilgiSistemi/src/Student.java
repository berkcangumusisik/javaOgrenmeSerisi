public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    public Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        double fizik_Ave = this.fizik.note *0.8 + this.fizik.verbalNote * 0.2;
        double mat_Ave = this.mat.note *0.8 + this.mat.verbalNote * 0.2;
        double kimya_Ave = this.kimya.note *0.7 + this.kimya.verbalNote * 0.3;
        this.avarage = Math.round (fizik_Ave + kimya_Ave + mat_Ave) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
    }
    public void verbalNote(int verb_mat, int verb_fizik, int verb_kimya){
        if (verb_mat >= 0 && verb_mat <= 100) {
            this.mat.verbalNote = verb_mat;
        }

        if (verb_fizik >= 0 && verb_fizik <= 100) {
            this.fizik.verbalNote = verb_fizik;
        }

        if (verb_kimya >= 0 && verb_kimya <= 100) {
            this.kimya.verbalNote = verb_kimya;
        }
    }

}