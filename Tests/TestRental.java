import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Lolololarry on 09.05.16.
 */
public class TestRental {
    Movie movie = new Movie("TestMovie", 0);
    Rental rental = new Rental(movie, 42);

    @Test
    public void getDaysRented() throws Exception {
        assertEquals(rental.getDaysRented(),42);
    }

    @Test
    public void getMovie() throws Exception {
        assertEquals(rental.getMovie(),movie);
    }
}

