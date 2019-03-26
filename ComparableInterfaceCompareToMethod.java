import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparable<Student> {
    public Student(String name, int id, int markLabTest) {
        this.name = name;
        this.id = id;
        this.markLabTest = markLabTest;
    }    

    public String getName() {
        return name;
    }
    
    public int getId() {
        return id;
    }

    public int getMarkLabTest() {
        return markLabTest;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMarkLabTest(int markLabTest) {
        this.markLabTest = markLabTest;
    }

    private String name;
    private int id;
    private int markLabTest;

    // sort by student lab test mark 
    @Override
    public int compareTo(Student s) {
         return this.markLabTest - s.getMarkLabTest(); 
    }
}


// Comparable interface with compareTo() method
// Comparator interface with compare() method, compare() two different parameter class objects
class NameComparatorInterfaceCompareMethod implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }    
}

class IdComparatorInterfaceCompareMethod implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if(s1.getId() < s2.getId()) return -1;
        else if(s1.getId() > s2.getId()) return 1;
        else return 0;
    }    
}


public class ComparableInterfaceCompareToMethod {

    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(new Student("name3",1,3));
        arrayList.add(new Student("name2",3,1));
        arrayList.add(new Student("name1",2,2));
        
        Collections.sort(arrayList);
        
        System.out.println("Student Names after sorted by lab test mark:");
        arrayList.forEach((Student s) -> {
            System.out.println(s.getName() + " " +
                               s.getId() + " " +
                               s.getMarkLabTest()
            );
        });
        System.out.println("\n");

        System.out.println("Sorted by student name:");
        NameComparatorInterfaceCompareMethod nameComparator = new NameComparatorInterfaceCompareMethod();
        Collections.sort(arrayList, nameComparator);
        arrayList.forEach((Student s) -> {
            System.out.println(s.getName() + " " +
                               s.getId() + " " +
                               s.getMarkLabTest()
            );
        }); 
        System.out.println("\n");

        System.out.println("Sorted by student id:");
        IdComparatorInterfaceCompareMethod idComparator = new IdComparatorInterfaceCompareMethod();
        Collections.sort(arrayList, idComparator);
        arrayList.forEach((Student s) -> {
            System.out.println(s.getName() + " " +
                               s.getId() + " " +
                               s.getMarkLabTest()
            );
        }); 
        System.out.println("\n");        
    }
    
}
