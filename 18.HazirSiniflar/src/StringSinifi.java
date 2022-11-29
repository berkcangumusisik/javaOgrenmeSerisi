import java.util.Arrays;

public class StringSinifi {
    public static void main(String[] args) {
        String str = "berkcan";
        System.out.println(str.charAt(1)); //e
        System.out.println(str.concat("n")); // berkcann
        System.out.println(str.contains("an")); // true
        System.out.println(str.endsWith("n")); // true
        System.out.println(str.equals("Ahmet")); //false
        System.out.println(str.indexOf("b")); // 0
        System.out.println(str.isEmpty()); // false
        System.out.println(str.length()); // 7
        System.out.println(str.replace("n", " ")); // berkca

        String[] sp = str.split("a");
        System.out.println(Arrays.toString(sp));

        System.out.println(str.startsWith("ber")); // true

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
    }
}

/*
 * .charAt() => Belirtilen indisteki elemanı verir.
 * .concat() => Sonuna karakter ekler.
 * .contains() => Belirtilen dizgenin olup olmadığına bakar.
 * .endsWith() => Bitiş karakteri bu mu değerini kontrol eder.
 * .equals() => İki dizeyi karşılatırarak true/ false değer döner.
 * .indexOf() => Bir dizede belirtilen karakterin ilk bulunduğu konumu verir.
 * .isEmpty() => Dizenin boş olup olmadığını kontrol eder.
 * .length() => Dizenin uzunluğunu verir.
 * .replace() => Elemanları günceller.
 * .split() => Belirtilen elemandan itibaren dizeyi böler.
 * startsWith() => Başlangıç karakteri bu mu değerini kontrol eder.
 * .toLowerCase() => dizenin tamanını küçük yazar.
 * .toUpperCase() => dizenin tamamını büyük yazar.
 * .trim() => sağdan ve soldan boşlukları siler.
  */