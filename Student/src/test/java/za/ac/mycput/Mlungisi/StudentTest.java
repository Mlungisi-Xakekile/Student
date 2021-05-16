package za.ac.mycput.Mlungisi;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @BeforeEach
    void setUp(){
      //  Student studName = new Student();
    }

    @Test
    @DisplayName("collection")
    public void collection(){
        Collection<Object> students = new ArrayList<Object>();

        //Add
        students.add("Nonxo");
        students.add("Mbishe");
        students.add("Zugange");
        System.out.println("Students :" + students);
        {
            System.out.println("************************************");
        }

        //Find
        if (students.contains("Mbishe")) {
            System.out.println("Mbishe Found successfully");
        } else {
            System.out.println("Failed :( ");
        }

        {
            System.out.println("************************************");
        }

        //Remove
        students.remove("Zugange");
        System.out.println("Collection after removing Kind: " + students);
    }

    {
        System.out.println("************************************");
    }

    @Test
    @DisplayName("list")
    public void list(){

        // List
        List<Integer> StudNumber= new ArrayList<Integer>();
        StudNumber.add(88888);
        StudNumber.add(77777);
        StudNumber.add(66666);
        System.out.println("************************************");
        System.out.println(StudNumber);
        // Add
        List<Integer> StudNumber2= new ArrayList<Integer>();
        StudNumber2.add(11111);
        StudNumber.addAll(StudNumber2);
        // Remove
        StudNumber.remove(1);

        // Find
        System.out.println("student number : " + StudNumber.get(1));
        System.out.println(StudNumber);
        System.out.println("************************************");

    }

    @Test
    @DisplayName("set")
    public void set() {
        // Sets
        Set setAge = new HashSet();

        setAge.add(25);
        setAge.add(19);
        setAge.add(22);
        System.out.println("************************************");
        System.out.println(setAge);
        // Add
        Set<Integer> setAge2 = new HashSet<>();
        setAge2.add(32);
        setAge2.addAll(setAge);
        // Remove
        setAge.remove(1);
        // Find
        if (setAge.contains("22")) {
            System.out.println("22 found!");
            System.out.println(setAge);
            System.out.println("************************************");
        }
    }

    @Test
    @DisplayName("map")
    public void map() {
        // Map
        Map<Integer, String> course = new HashMap<>();
        course.put(1, "Java");
        course.put(2, "Scala");
        course.put(3, "PHP");
        System.out.println("************************************");
        System.out.println(course);



            // Add
            Map<Integer, String> course2 = new HashMap<>();
            course2.put(4, "C+");
            course.putAll(course2);
            // Remove
            course.remove(2);
            // Find
            course.containsValue("Scala");
            System.out.println(course);
            System.out.println("************************************");

        }

}