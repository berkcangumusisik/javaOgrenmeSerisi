public class OverridingMain {
    public static void main(String[] args) {
        BaseKrediManager[] krediManagers = new BaseKrediManager[] { new BaseKrediManager(),
                new OgretmenKrediManager(), new OgrenciKrediManager(), new TarimKrediManager() };

        for (BaseKrediManager krediManager : krediManagers) {
            System.out.println(krediManager.hesapla(1000));
        }
    }
}