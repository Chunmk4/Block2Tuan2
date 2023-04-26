package Tuan2.BaiThucHanh4;

public class Test {
    public static void main(String[] args) {
        StudentImpl student = new StudentImpl("Tra My",19,true);

        student.eat();
        student.slepp();
        student.registerCourse("lap Trinh CodeGym");
        student.attendClass();
    }
}
