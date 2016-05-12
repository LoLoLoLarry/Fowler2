import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Lolololarry on 09.05.16.
 */
public class TestMovie {
    Movie movie = new Movie("TestMovie", 1);

    @Test
    public void getPriceCode() throws Exception {
        assertEquals(movie.getPriceCode(), 1);
    }

    @Test
    public void setPriceCode() throws Exception {
        movie.setPriceCode(2);
        assertEquals(movie.getPriceCode(), 2);
    }

    @Test
    public void getTitle() throws Exception {
        assertEquals(movie.getTitle(),"TestMovie");
    }
}
