import java.util.*;
class Book{
	String title;
	int numbersOfAuthors;
	String authors[]=new String[numbersOfAuthors];
	int numberOfPages;
	float price;
	String Publisher;
	
	
	Book(String title, int numbersOfAuthors, String authors[], int numberOfPages,float
	price, String Publisher){
		
		this.title= title;
		this.numbersOfAuthors = numbersOfAuthors;
		this.authors = authors;
		this.numberOfPages = numberOfPages;
		this.price = price;
		this.Publisher = Publisher;
	}
	
	void printBookDetails(){
		System.out.println("Book title : " + title);
		System.out.println("numbers Of Authors of book : " + numbersOfAuthors);
		System.out.println("Names of authors : " );
		for(String auth: authors){
			System.out.println(auth);
		}
		System.out.println("number Of Pages : " + numberOfPages);
		System.out.println("price of book : " + price);
		System.out.println("Book Publisher : " + Publisher);
		
	}
	
}

class Libary{
	int numberOfBooks;
	Book allbooks[] = new Book[50]; 
	static int count;
	
	void add(Book b1){
		count++;
		allbooks[count-1]= b1;
	}
	void remove(String bookTitle){
		for(int i = 0; i<allbooks.length; i++){
			if(allbooks[i].title == bookTitle){
				for(int j=i+1; j<allbooks.length; j++){
					allbooks[i]=allbooks[j+1];
				}
				break;
			}
		}
		
	}
	
	void printBook(String bookTitle){
		for(int i = 0; i<allbooks.length; i++){
			if(allbooks[i].title == bookTitle){
				allbooks[i].printBookDetails();
				break;
			}
		}
	}
	
	void allBookPrice(){
		float sum=0;
		for(int i = 0; i<allbooks.length; i++){
			if(allbooks[i]==null){
				break;
			}
			sum+=allbooks[i].price;
		}
		System.out.println("All Book Price : "+sum);
	}
	
}

public class Books{
	public static void main(String args[]){
		
		String[] arr = {"Saurav", "only Saurav"};
		Book b1 = new Book(
		"JavaDSA1",
		2,
		arr,
		455,
		1000.50f,
		"nobody"
		);
		
		
		String[] arr1 = {"Saurav", "only Saurav"};
		Book b2 = new Book(
		"JavaDSA2",
		2,
		arr1,
		435,
		1300.50f,
		"idk"
		);
		
		Libary l1 = new Libary();
		l1.add(b1);
		l1.add(b2);
		l1.printBook("JavaDSA2");
		l1.allBookPrice();
	}
}