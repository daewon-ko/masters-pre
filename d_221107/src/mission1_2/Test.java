package mission1_2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        Library A = new Library("온마을");
        Library B = new Library("두마을");

        ArrayList<Book> aList = new ArrayList<Book>();
        ArrayList<Book> a_1List = aList;
        ArrayList<Book> bList = new ArrayList<Book>();
//        ArrayList<Object> c= new ArrayList();
//        ArrayList<Object>c_copy = new ArrayList();
//        c.add(1);
//        c.add(2);
//        System.arraycopy(c,0,c_copy,0,2);
//        for(int i =0; i<c.size(); i++){
//            System.out.println(c_copy.get(i));
//        }

        aList.add(new Book("태백산맥", "조정래"));
        aList.add(new Book("이기적유전자", "리처드 도킨즈"));
        aList.add(new Book("자전거 도둑", "박완서"));
        aList.add(new Book("토지", "박경리"));
        aList.add(new Book("대변동", "제러드 다이아몬드"));

        // System.arraycopy 메서드를 사용하려고 하니
        // ArrayStoreException이 뜬다 이유는?..

        for(Book b : aList){

        }


//        for(int i=0; i< aList.size(); i++){
//            a_1List.add(aList.get(i));
//        }

        //aList[2] = new Book("그 많던 싱아는 누가 다 먹었을까","박완서");
        // 위와 같이는 왜 안될까?

        aList.set(2, new Book("그 많던 싱아는 누가 다 먹었을까", "박완서"));

        for(int i=0; i< aList.size(); i++){
            bList.add(aList.get(i));
        }
        bList.add(new Book("사피엔스","유발 하라리"));







//        System.arraycopy(aList,0,a_1List,0,5);
//
//        for(int i =0; i< a_1List.size(); i++){
//            System.out.println(a_1List.get(i).getAuthor());
//            System.out.println(a_1List.get(i).getTitle());
//        }
        A.showLibraryInfo(aList);
        System.out.println();
        B.showLibraryInfo(bList);
        System.out.println();
        System.out.println("A-1의 도서목록은");

        A.showLibraryInfo(a_1List);

//        for(int i =0; i< a_1List.size(); i++){
//            System.out.print("제목: "+a_1List.get(i).getTitle()+", 저자: "+a_1List.get(i).getAuthor()+"\n");
//
//        }

    }





}
