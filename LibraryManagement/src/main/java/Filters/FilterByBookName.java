package Filters;
import java.util.Comparator;

import com.myproject.lms.bean.Books;

public class FilterByBookName implements Comparator<Books>{

	public int compare(Books o1, Books o2) {
			
		return o1.getBookName().compareToIgnoreCase(o2.getBookName());
	}

}
