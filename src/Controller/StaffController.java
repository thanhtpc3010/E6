package Controller;

import Entity.Staff;


import java.util.List;

public class StaffController {
    private static List<Staff> staffs;
    public StaffController(List<Staff> staffs) {
        StaffController.staffs = staffs;
    }
    public static List<Staff> getById(int id) {
        return staffs.stream()
                .filter(s->s.getId()==id)
                .toList();
    }
    public static List<Staff> getByName(String name) {
        return staffs.stream()
                .filter(s -> s.getName() != null && s.getName().contains(name)) // Kiểm tra null trước
                .toList();
    }
}
