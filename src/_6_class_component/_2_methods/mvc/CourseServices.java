package _6_class_component._2_methods.mvc;

public class CourseServices {
    CourseDao courseDao = new CourseDao();

    public void addCourse(Course course) {
        courseDao.addCourse(course);
    }

    public void updateCourse(Course course) {
        courseDao.updateCourse(course);
    }

    public void deleteCourse(Course course) {
        courseDao.deleteCourse(course);
    }

    public Course getCourse(int id) {
        return courseDao.getCourse(id);
    }

}
