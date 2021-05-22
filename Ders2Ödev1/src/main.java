
public class main {
	public static void main(String[] args) {
		Course course1=new Course(1, "C#", 50, "Engin Demiroð");
		Course course2=new Course(2, "JAVA", 54, "Engin Demiroð");
		
		Course [] courses= {course1, course2};
		for(Course course: courses) {
			System.out.println("Kurs Adý: "+ course.name);
		}
		Category category1=new Category();
		category1.id=1;
		category1.name="Backend";
		
		Category category2=new Category();
		category2.id=2;
		category2.name="Frontend";
		
		Category[] categories= {category1, category2};
		for(Category category : categories) {
			System.out.println("Kategori: "+ category.name);
		}
		
		CourseManager courseManager=new CourseManager();
		courseManager.add(course1);
		courseManager.update(course2);
		courseManager.delete(course1);
	
	}
	
}
