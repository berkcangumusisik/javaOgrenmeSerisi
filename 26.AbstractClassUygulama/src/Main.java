public class Main {
    public static void main(String[] args) throws Exception {
        CustomerManager customerManager = new CustomerManager();
        customerManager.databaseManager = new SqlServerDatabaseManager();
        customerManager.getCustomers();
    }
}
