import java.lang.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
class Book{
    static int nextId=1;
    private int id;
    String lang;
    private String title;
    private String author;
    boolean isAvailable;
    Book(String lang,String title,String author){
        this.id=generateId();
        this.lang=lang;
        this.title=title;
        this.author=author;
    }
    static int generateId(){
        return nextId++;
    }
    int GetId(){
        return id;
    }
    String GetTitle(){
        return title;
    }
    String GetAuthor(){
        return author;
    }
    public String toString(){                                                  //display book values if not override this method then return address
        return "Id:"+id+",Language:"+lang+",Title:"+title+",Author:"+author;
    }
}
class Library{
    ArrayList<Book> library=new ArrayList<>();
    HashMap<Integer,Book> bookmap=new HashMap<>();
    void addBook(Book book){
        library.add(book);
        bookmap.put(book.GetId(),book);
        System.out.println("Book Added Successfully!");
    }
    void displayBooks(){
        if(library.isEmpty()){
            System.out.println("Library is Empty!");
        }
        else{
            for(Book b:library)
               System.out.println(b);  //(b)==(b.tostring)
        }     
    }
    void search_by_id(int id){
        if(bookmap.containsKey(id))
           System.out.println("Book Found:"+bookmap.get(id));
        else
           System.out.println("Book with Id "+id+" Not Found");  
    }
    void search_by_title(String name){
        boolean found=false;
        String lowerKeyword=name.toLowerCase();
        for(Book b:library){
            if(b.GetTitle().toLowerCase().contains(lowerKeyword)){
                System.out.println("Book Found:"+ b);
                found=true;
            }  
        }
        if(!found)
            System.out.println("Book with title "+name+" Not Found");
    }
    void search_by_author(String author){
        boolean found=false;
        String lowerKeyword=author.toLowerCase();
        for(Book b:library){
            if(b.GetAuthor().toLowerCase().contains(lowerKeyword)){
                System.out.println("Book Found:"+ b);
                found=true;
            }  
        }
        if(!found)
            System.out.println("Book with title "+author+" Not Found");
    }
    void menu(){
       Scanner sc=new Scanner(System.in);
       int n;
       char ch;
       do{
        System.out.println("----Menu----");
        System.out.println("1.Add Book");
        System.out.println("2.Display");
        System.out.println("3.Search by ID");
        System.out.println("4.Search by Name");
        System.out.println("5.Search by Author");
        System.out.println("6.Exit");
        System.out.println("Enter the choice:");
        n=sc.nextInt();
        switch(n){
            case 1:
                sc.nextLine();
                System.out.println("Enter Book Info");
                System.out.print("Book Name:");
                String book_name=sc.nextLine();
                System.out.print("Book Author:");
                String author_name=sc.nextLine();
                System.out.print("Book Langauge:");
                String book_lang=sc.nextLine();
                Book b=new Book(book_lang,book_name,author_name);
                addBook(b);
                break;
            case 2:
                System.out.println("Display all books:");
                displayBooks();
                break;
            case 3:
                System.out.println("Search by ID");
                System.out.print("Enter ID:");
                int id=sc.nextInt();
                sc.nextLine();
                search_by_id(id);
                break;
            case 4:
                System.out.println("Search by Book Name");
                System.out.print("Enter name:");
                String name=sc.nextLine();
                search_by_title(name); 
                break;
            case 5:
                System.out.println("Search by Book Author");
                System.out.print("Enter Author Name:");
                String A_name=sc.nextLine();
                search_by_author(A_name); 
                break;  
            case 6:
                System.out.println("Exit....");
                break;
            default:
                System.out.println("Invalid choice!");           
        }
        System.out.println("Want to continue?(Y/N):");
        ch=sc.next().charAt(0);
       }while(ch=='Y'||ch=='y');
    
    }
}
 class LibraryApp {
    public static void main(String[] args) {
        Library library = new Library();
        library.menu();
    }
}

