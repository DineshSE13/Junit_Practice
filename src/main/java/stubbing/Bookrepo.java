package stubbing;

import java.util.List;

public interface Bookrepo {

	List<Book> findnewbooks(int days);

	Book findbookbyid(String bookids);
}
