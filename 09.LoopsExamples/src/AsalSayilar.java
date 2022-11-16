public class AsalSayilar {
    public static void main(String[] args) {
        for(int i=2; i<=100; i++){
            boolean isAsal = true;
            for(int j=2; j<i; j++){
                if(i % j == 0){
                    isAsal = false;
                }
            }
            if(isAsal)
                System.out.print(i+" ");
        }
    }
}
/*
 * Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.

Senaryo
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 
 */