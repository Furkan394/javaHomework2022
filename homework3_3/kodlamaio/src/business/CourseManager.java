package business;

import core.logging.Logger;
import dataAccess.CourseDao;
import entities.Course;

public class CourseManager {
    private CourseDao courseDao;
    private Logger[] loggers;

    public CourseManager(CourseDao courseDao, Logger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    public void add(Course course) throws Exception {

        Course[] courses = new Course[] {
                new Course("Engin Demiroğ", ".NET", "Backend", 25),
                new Course("Engin Demiroğ", "Java", "Backend", 20),
        };

        for(Course c : courses){
            if (course.getCourseName() == c.getCourseName()){
                throw new Exception("Kurs ismi tekrar edemez");
            }

            if (course.getCategory() == c.getCategory()){
                throw new Exception("Kategori ismi tekrar edemez");
            }
        }

        if (course.getPrice() < 0){
            throw new Exception("Kurs fiyatı 0'dan küçük olamaz");
        }

        courseDao.add(course);
        for(Logger logger : loggers){
            logger.log(course.getCourseName());
        }
    }
}
