import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Lolololarry on 09.05.16.
 */
public class TestCustomer {
    Customer customer = new Customer("TestCustomer");
    Movie movie = new Movie("TestMovie", 2);
    Rental rental = new Rental(movie, 42);

    @Test
    public void addRental() throws Exception {
        customer.addRental(rental);
        System.out.print(customer.statement());
        assertEquals(customer.statement(), "Rental Record for TestCustomer\n" +
                "\tTitle\t\tDays\tAmount\n" +
                "\tTestMovie\t\t42\t60.0\n" +
                "Amount owed is 60.0\n" +
                "You earned 1 frequent renter points");
    }

    @Test
    public void getName() throws Exception {
        assertEquals(customer.getName(), "TestCustomer");
    }

    @Test
    public void statement() throws Exception {
        customer.addRental(rental);
        assertEquals(customer.statement(), "Rental Record for TestCustomer\n" +
                "\tTitle\t\tDays\tAmount\n" +
                "\tTestMovie\t\t42\t60.0\n" +
                "Amount owed is 60.0\n" +
                "You earned 1 frequent renter points");
    }
}
