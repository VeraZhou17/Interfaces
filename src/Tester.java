import java.util.ArrayList;
import java.util.Collections;

public class Tester {
    public static void main(String[] args) {
//        ArrayList<TwoDimensionalGeometry> things = new ArrayList<TwoDimensionalGeometry>();
//
//        Circle circ = new Circle(10);
//        Rectangle rect = new Rectangle(5, 6);
//        SwimmingPool pool = new SwimmingPool(10, 20, 30, false);
//        things.add(circ);
//        things.add(rect);
//        things.add(pool);
//
//        for (TwoDimensionalGeometry thing : things)
//        {
//            System.out.println(thing.area());
//            System.out.println(thing.perimeter());
//        }
//
//        ArrayList<ThreeDimensionalGeometry> moreThings = new ArrayList<ThreeDimensionalGeometry>();
//        moreThings.add(new Cube(10));
//        moreThings.add(pool);
//
//        for (ThreeDimensionalGeometry thing : moreThings)
//        {
//            System.out.println(thing.volume());
//        }
//
//        // using the Comparable interface to sort
//        Student s3 = new Student("Carol", 817675410, 93.02);
//        Student s2 = new Student("Barbara", 671112132, 96.98);
//        Student s1 = new Student("Adam", 529100415, 91.35);
//
//        ArrayList<Student> students = new ArrayList<Student>();
//        students.add(s1);
//        students.add(s2);
//        students.add(s3);
//
//        Collections.sort(students);
//        for (Student student : students)
//        {
//            System.out.println(student);
//        }

        ArrayList<Garden> gardenItems = new ArrayList<Garden>();
        ArrayList<Dog> dogItems = new ArrayList<Dog>();

        Garden g1 = new Garden();
        Garden g2 = new Garden();
        Garden g3 = new Garden();

        Dog d1 = new Dog();
        Dog d2 = new Dog();
        Dog d3 = new Dog();

        gardenItems.add(g1);
        gardenItems.add(g2);
        gardenItems.add(g3);

        dogItems.add(d1);
        dogItems.add(d2);
        dogItems.add(d3);

        for (int i = 0; i < gardenItems.size(); i++)
        {
            String callingMethod = gardenItems.get(i).giveWater();
        }

        for (int i = 0; i < dogItems.size(); i++)
        {
            String callingMethod = dogItems.get(i).giveWater();
        }
    }
}
