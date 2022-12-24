public class App {
    public static void main(String[] args){
        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
        customerManager.add();

    }
}
/*
Interface (Arayüzler)
* Java'da soyutlamanın en önemli özelliği, interface'lerdir.
* Bir interface, bir sınıfın yapısını tanımlayan bir soyutlama seviyesidir.
* Bir sınıfın interface'ini uygulaması, sınıfın interface'inde tanımlanan tüm metotları içermesi anlamına gelir.
* implements anahtar kelimesi ile interface'lerin uygulanmasını sağlarız.
* Bir sınıf birden fazla interface'i uygulayabilir.
* Bir interface birden fazla interface'i extend edebilir.

 */