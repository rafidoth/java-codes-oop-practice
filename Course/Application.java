public class Application {
  public static void main(String[] args) {
    Course cl = new Course("OOP", "CSI211", 3);
    Course c2 = new Course("SPL", "CSI121", 1);
    cl.display();
    c2.display();
    cl.updateCourse(c2);
    cl.display();
    c2.display();
  }
}