package Sortings;

import java.util.Comparator;

import com.myproject.lms.bean.Books;

public class SortbyYear implements Comparator<Books>{

	public int compare(Books o1, Books o2) 
	{
		return o1.getYearOfPublication() - o2.getYearOfPublication();

	}

	
}
