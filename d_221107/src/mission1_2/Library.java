package mission1_2;

import java.util.ArrayList;

public class Library {
    String libraryName;
    ArrayList<Book> booklist;

    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.booklist = new ArrayList<>();
    }

    public void showLibraryInfo(ArrayList<Book> booklist){
        System.out.println(this.libraryName+"의 도서목록은 ");
        for( int i=0; i<booklist.size(); i++){

            System.out.printf("제목: "+ booklist.get(i).getTitle()+", 저자: "+booklist.get(i).getAuthor()+"\n");

         }


    }




}
