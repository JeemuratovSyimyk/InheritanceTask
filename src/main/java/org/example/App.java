package org.example;

import org.example.Entity.NoteBook;
import org.example.Entity.Phone;
import org.example.Entity.earphone;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        NoteBook noteBook = new NoteBook("Dell","Dell",2020);
        noteBook.getNoteBook();
        System.out.println(noteBook);

        Phone phone = new Phone("Pixel","Google",2021,"Google Pixel 6");
        phone.getPhone();
        phone.getNoteBook();
        System.out.println(phone);

        earphone earphone = new earphone("Samsung","Samsung",2020,"Samsung");
        earphone.getearphone();
        earphone.getNoteBook();
        System.out.println(earphone);
    }
}
