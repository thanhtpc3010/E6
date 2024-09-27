import Controller.StaffController;
import Controller.StudentController;
import Entity.Gender;
import Entity.Staff;
import Entity.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        List<Staff> staff = new ArrayList<>();
        students.add(new Student("C2307G5911","Thanh", LocalDate.of(2003,10,30), Gender.Male,"Ha Noi"));
        students.add(new Student("C2309G5975","Vinh",LocalDate.of(2005,12,1),Gender.Other,"Ha Noi"));
        students.add(new Student("C2309G5955","Hieu",LocalDate.of(1999,03,25),Gender.Male,"Ha Noi"));

        staff.add(new Staff(1,"BB","Aptech",1000,Gender.Male));
        staff.add(new Staff(2,"CC","Aptech",1000,Gender.Female));
        staff.add(new Staff(3,"DD","Aptech",1000,Gender.Male));

        //Hien thi thong tin ban tre nhat lop
        StudentController sc = new StudentController(students);
        Optional<Student> studentYoungest =sc.getYoungest();
//        students.forEach(System.out::println);
        System.out.println(studentYoungest);

        //Search student get by name
        StudentController.getByName("Thanh").forEach(System.out::println);

        StaffController sc2 = new StaffController(staff);
        System.out.println("Get by ID 1:");
        StaffController.getById(1).forEach(System.out::println);

        StaffController sc3 = new StaffController(staff);
        System.out.println("Get by Name 'DD':");
        StaffController.getByName("DD").forEach(System.out::println);
    }
}