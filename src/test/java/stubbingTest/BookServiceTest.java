package stubbingTest;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import stubbing.BookService;
import stubbing.Bookrepo;
import stubbing.Book;

public class BookServiceTest {

	@InjectMocks
	private BookService bookservice;
	@Mock
	private Bookrepo bookrepo;

	@Before
	public void beforetest() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void stubbingtest() {
		List<String> bookids = new ArrayList<>();
		bookids.add("01");
		bookids.add("02");

		Book b1 = new Book("01", "let us c", 500);
		Book b2 = new Book("02", "let us c++", 400);

//		when(bookrepo.findbookbyid("01")).thenReturn(b1);
//		when(bookrepo.findbookbyid("02")).thenReturn(b2);

		doReturn(b1).when(bookrepo).findbookbyid("01");
		doReturn(b2).when(bookrepo).findbookbyid("02");

		int actualcost = bookservice.totalcost(bookids);

		assertEquals(900, actualcost);
	}
}
