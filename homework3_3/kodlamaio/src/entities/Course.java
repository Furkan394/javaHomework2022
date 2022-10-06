package entities;

public class Course {
    private String instructor;
    private String courseName;
    private String category;
    private double price;

    public Course() {
    }

    public Course(String instructor, String courseName, String category, double price) {
        this.instructor = instructor;
        this.courseName = courseName;
        this.category = category;
        this.price = price;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
