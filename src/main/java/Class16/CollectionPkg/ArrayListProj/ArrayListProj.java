package Class16.CollectionPkg.ArrayListProj;

import net.bytebuddy.description.ByteCodeElement;

import javax.print.DocFlavor;
import java.lang.reflect.Array;
import java.net.SecureCacheResponse;
import java.nio.file.LinkPermission;
import java.util.*;
import java.util.jar.JarOutputStream;
import java.util.spi.LocaleServiceProvider;

public class ArrayListProj
{
    public static void main(String[] args) {
        /*
        126 questions of Java Collections

        ARRAY LIST
//        ArrayList <String> c1 = new ArrayList <String> ();
//        c1.add("Red");
//        c1.add("Green");
//        c1.add("Black");
//        c1.add("White");
//        c1.add("Pink");
//        System.out.println("\nOriginal array list: " + c1);

        1. Write a Java program to create a new array list, add some elements (string) and print out the collection.
        2. Write a Java program to iterate through all elements in a array list.
        3. Write a Java program to insert an element into the array list at the first position
        4. Write a Java program to retrieve an element (at a specified index) from a given array list.
        5. Write a Java program to update specific array element by given element
        6. Write a Java program to remove the third element from a array list
        7. Write a Java program to search an element in a array list.
        8. Write a Java program to sort a given array list.
        9. Write a Java program to copy one array list into another.
        10. Write a Java program to shuffle elements in a array list.
        11. Write a Java program to reverse elements in a array list.
        12. Write a Java program to extract a portion of a array list.
        13. Write a Java program to compare two array lists
        14. Write a Java program of swap two elements in an array list.
        15. Write a Java program to join two array lists.
        16. Write a Java program to clone an array list to another array list.
        17. Write a Java program to empty an array list.
        18. Write a Java program to test an array list is empty or not.
        19. Write a Java program to trim the capacity of an array list the current list size.
        20. Write a Java program to increase the size of an array list.
        21. Write a Java program to replace the second element of a ArrayList with the specified element.
        22. Write a Java program to print all the elements of a ArrayList using the position of the elements.

        LINKED LIST
        1. Write a Java program to append the specified element to the end of a linked list.
        2. Write a Java program to iterate through all elements in a linked list.
        3. Write a Java program to iterate through all elements in a linked list starting at the specified position.
        4. Write a Java program to iterate a linked list in reverse order.
        5. Write a Java program to insert the specified element at the specified position in the linked list.
        6. Write a Java program to insert elements into the linked list at the first and last position.
        7. Write a Java program to insert the specified element at the front of a linked list.
        8. Write a Java program to insert the specified element at the end of a linked list.
        9. Write a Java program to insert some elements at the specified position into a linked list.


         */
        LinkedList<String> l_list = new LinkedList<String>();
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
//        l_list.add("White");
//        l_list.add("Pink");
        System.out.println("\nThe linked list: " + l_list);

        LinkedList<String> newLlist = new LinkedList<String>();
        newLlist.add("White");
        newLlist.add("pink");
        l_list.addAll(1,newLlist);
        System.out.println("The new added list: "+l_list);


















        }

    }


