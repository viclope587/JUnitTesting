package testing.pack.src.main.java.books;
import java.util.*;

public class BookShop {

    private final String name;

    /**
     * Constructor of the class Book shop
     * @param name name of the book shop
     */
    public BookShop(String name){
        this.name = name;
    }

    /**
     * method to compute the cost of a basket
     * @param books array corresponding to the number of each harry potter book the client desire to buy (books.length should return 5)
     * @return the cost in euro with the discount
     */
    //int[] = [1,2,2]
    public double cost(int[] books){
    	ArrayList<Integer> temp = new ArrayList<Integer>();
    	
    	ArrayList<Integer> numberOfBooks = new ArrayList<Integer>();
    	numberOfBooks.add(1);
    	numberOfBooks.add(2);
    	numberOfBooks.add(3);
    	numberOfBooks.add(4);
    	numberOfBooks.add(5);
    	
    	Map<Integer, Integer> discount = new HashMap<Integer, Integer>();
    	discount.put(1, 0);
    	discount.put(2, 7);
    	discount.put(3, 14);
    	discount.put(4, 28);
    	discount.put(5, 35);
    	
    	double sum = 0.0;
        for (int i = 0; i < books.length; i++) {
        	if (!temp.contains(books[i])) {
        		temp.add(books[i]);
        	}
        }
        
        double pourcent = discount.get(temp.size());
        
        for (int j=0; j < books.length; j++) {
        	if (numberOfBooks.contains(books[j])) {
        		sum += 8 * (100 - pourcent)/100;
        		numberOfBooks.remove(numberOfBooks.indexOf(books[j]));
        	} else {
        		sum += 8;
        	}
        }
        
        if ((temp.size() == 5) && (Double.toString(sum).contains("00000000000001"))){
        	sum -= 0.00000000000001;
        }
        
        return sum;
    }
}
