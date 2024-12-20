/*
 * Ranticha Chumjai SID : 672115042
 * Program for to SE102 Tutorial2
 */
import java.io.File;
import java.io.FileNotFoundException ;
import java.util.Scanner ;
import java.util.StringTokenizer ;
import java.util.Vector;

public class data {
    public static void main(String[] args) throws  FileNotFoundException{
        
        File info = new File("info.csv") ;
        Scanner input = new Scanner(info) ;

        for(int i = 0 ; i < 7 ; i++ ) {
            input.nextLine() ;
        }

        Vector<Student> listName = new Vector<Student>() ;

        while(input.hasNextLine()) {
            String dataLine = input.nextLine() ;
            StringTokenizer space = new StringTokenizer(dataLine.trim() , ",") ;
            space.nextToken() ;
            Student i = new Student(space.nextToken() , space.nextToken() ,space.nextToken()) ;
            listName.addElement(i) ; 
        }

        System.out.println("Total student is : " + listName.size());
        for(char i = 'A' ; i <= 'Z' ; i++) {
            displayList(listName , i) ;
        }

    }
    
    public static void displayList(Vector<Student> listName , char letter) {
        char firstletter ;
        Vector<Student> toString = new Vector<>() ;
        int amountStudent = 0 ;
        String firstName ;

        for(int i = 0 ; i < listName.size() ; i++) {
            firstName = listName.elementAt(i).getFirstName() ;
            firstletter = firstName.charAt(0) ;

            if (firstletter == letter) {
                toString.addElement(listName.elementAt(i)) ;
                amountStudent++ ;
            }
        }

        System.out.println();
        System.out.println(letter + " : " + amountStudent);

        for(Student i : toString) {
            System.out.println(i);
        }
    }
}
