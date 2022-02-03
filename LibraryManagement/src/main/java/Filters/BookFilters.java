package Filters;
import java.util.*;
import java.util.List;
import com.myproject.lms.bean.*;
import com.myproject.lms.service.*;
public class BookFilters {

	List<Books> list=new ArrayList<Books>();

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void getFilters()
	{
		AdminFilterService filters=new AdminFilterServiceImpl();
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		@SuppressWarnings("resource")
		Scanner str=new Scanner(System.in);
		
	
			System.out.println("1.Books by Author");
			System.out.println("2.Books by Name");
			System.out.println("3.Book by Category");
			System.out.println("4.Sort Book by Year\n");
			
			SortbookByPublishYear sby=new SortbookByPublishYear();
			BookFilters av=new BookFilters();
			Books b=new Books();
			
		    System.out.println("Enter Choice :\n");
			int choice=sc.nextInt();
			switch(choice)
			{
			
				case 1 : 	System.out.println("Enter Author Name: ");
							String author=str.nextLine();
							list=new ArrayList();
							list=filters.FilterByAuthorName(author);
							if(list.size()>0) {
								av.PrintList(list);

							}
							else 
							{
								System.out.println("No Books Available with the Author...!!!");
							}
							break;
							
				case 2:		System.out.println("Enter Book Name: ");
							String name=str.nextLine();
							b=filters.FilterByBookName(name);
							if(b!=null) {
								System.out.println(b);

							}else {
								System.out.println();
								System.out.println("Sorry Book Not Available.....!!");
							}
							break;
			
							
				case 3:     System.out.println("Enter Category :");			
							String category=str.nextLine();
							list=new ArrayList();
							list=filters.FilterByCategory(category);
							if(list.size()>0) {
								av.PrintList(list);

							}else {
								System.out.println("No Books Available with the Category...!!!");
							}
							break;
							
							
				case 4:   System.out.println("Enter Year from where you want books :");
						  int year=sc.nextInt();
						  list=new ArrayList();
						  list=sby.sortByYear(year);
						  if(list.size()>0) 
						  {
								av.PrintList(list);

							}else {
								System.out.println("No Books Available from that year...!!!");
							}
						
			}
		}	
		
	
	
	
	public void PrintList(List<Books> list)
	{
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%10s %20s %20s %30s %20s", "BOOK_ID", "BOOK_NAME", "BOOK_CATEGORY", "BOOK_AUTHOR", "PUBLISHED_YEAR");
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
		for (Books book : list) 
		{
			System.out.format("%10d %20s %20s %30s %20s",book.getBookId(),book.getBookName(),book.getBookCategory(),book.getAuthorName(),book.getYearOfPublication());
			System.out.println();
		}
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
	}
}
