// Outer class
public class Out {
    public int a = 5;
    // Inner class
    public class In {
        public int b = 10;
        public void print() {
            int a = 15;
            System.out.println("a = " + a);
            System.out.println(Out.this.a);
        }
    }

    public void run(){
        In in = new In();
        in.print();
    }
}
