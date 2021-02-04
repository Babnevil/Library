/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

/**
 *
 * @author Me
 */
public class Library {

    /**
     * @param args the command line arguments
     */
    private Book[] books;   //array-based implementation of the bag data struct
    private int numBooks;   // the number of books currently in the bag
    
    public Library() { } // default constructor to create an empty bag
    
    private int find(Book book) { // helper method to find a book in the bag
        int index = 0;
        for (Book wanted : books){  //IMPLEMENT FOR REAL
            if (wanted == book){
                index = 1;
            }
            else
                index = 2;
        }
        return index;
    } 
    private void grow() {
        Book[] tempBag = new Book[numBooks + 4];
        int length = books.length + 4;
        System.arraycopy(books, 0, tempBag, 0, length);
        books = tempBag;
        
    }
    public void add(Book book) {
        if (books.length == 0)
            books[0] = book;
        else {
            Book[] tempBag = new Book[numBooks + 1];
            int length = numBooks + 1;
            System.arraycopy(books, 0, tempBag, 0, length);
            books = tempBag;
            books[length] = book;
            numBooks +=1;
        }
    }
    //public boolean remove(Book book) { }
    //public boolean cheackOut(Book book) { }
    //public boolean returns(Book book) { }
    public void print() { }
    public void printByDate() { }
    public void printByNumber() { }
    
}
