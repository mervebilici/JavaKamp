
public class CourseManager {
  
	public void add(Course course) {
		System.out.println("Kurs Eklendi! " + course.name);
	}
	
	public void update(Course course) {
		System.out.println("Kurs GŁncellendi! " + course.name);
	}
	
	public void delete(Course course) {
		System.out.println("Kurs Silindi! " + course.name);
	}
}
