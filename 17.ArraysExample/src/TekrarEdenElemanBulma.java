import java.util.Arrays;

public class TekrarEdenElemanBulma {
    public static void main(String[] args) {
        int[] liste = {3, 9, 3, 3, 2, 1, 9, 0, 3, 3, 6, 3};
        int[] duplicate = new int[liste.length];
        int startIndex = 0;
        for (int i = 0; i < liste.length; i++) {
            for(int j = 0; j < liste.length; j++){
                if (liste[i] == liste[j] && i != j) {
                    if(!isFind(duplicate, liste[i])){
                    duplicate[startIndex++] = liste[i];
                }
                    break;
                }
            }
        }
        for (int i = 0; i < duplicate.length; i++) {
            if(duplicate[i] != 0){
                System.out.println(duplicate[i]);
            }
        }
        
    }

    static boolean isFind(int[] liste, int value){
        for (int i = 0; i < liste.length; i++) {
            if (liste[i] == value) {
                return true;
            }
        }
        return false;
    }
}
