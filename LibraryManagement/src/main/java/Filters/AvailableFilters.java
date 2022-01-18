package Filters;
import java.util.*;
import java.util.List;
import com.myproject.lms.bean.*;
import com.myproject.lms.service.*;
public class AvailableFilters {

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
			System.out.println("3.Book by Category\n");
			
			AvailableFilters av=new AvailableFilters();
			Books b=new Books();
			
		    System.out.println("Enter Choice :\n");
			int choice=sc.nextInt();
			switch(choice)
			{
			
				case 1 : 	System.out.println("Enter Author Name: ");
							String author=str.nextLine();
							list=new ArrayList();
							list=filters.FilterByAuthorName(author);
							av.PrintList(list);
							break;
							
				case 2:		System.out.println("Enter Book Name: ");
							String name=str.nextLine();
							b=filters.FilterByBookName(name);
							System.out.println(b);
							break;
			
							
				case 3:     System.out.println("Enter Category :");			
							String category=str.nextLine();
							list=new ArrayList();
							list=filters.FilterByCategory(category);
							av.PrintList(list);
							break;
							
				
				
			}
		}	
		
	
	
	
	public void PrintList(List<Books> list)
	{
		System.out.println("Books Available :");
		System.out.println();

		for(int i=0;i<list.size();i++) 
		{
			System.out.println(list.get(i));
		}
	}
}
