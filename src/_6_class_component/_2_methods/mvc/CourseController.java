package _6_class_component._2_methods.mvc;

public class CourseController {
    CourseServices courseService = new CourseServices();

    public void addCourse(Course course) {
        courseService.addCourse(course);
    }

    public void updateCourse(Course course) {
        courseService.updateCourse(course);
    }

    public void deleteCourse(Course course) {
        courseService.deleteCourse(course);
    }

    public Course getCourse(int id) {
        return courseService.getCourse(id);
    }
}
