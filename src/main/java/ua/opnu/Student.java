package ua.opnu;

public class Student {
    String name;
    int year;
    int courseCount;
    String[] disciplines;
    Student(String name, int year) {
        this.name = name;
        if (year < 1 || year > 4) {
            year = 1;
        }
        this.year = year;
        disciplines = new String[20];
        courseCount = 0;
    }
    void addCourse(String courseName) {
        if (courseName == null) return;
        if (courseCount == disciplines.length) return;
        disciplines[courseCount] = courseName;
        courseCount++;
    }

    void dropAll() {
        courseCount = 0;
    }
    int getCourseCount() {
        return courseCount;
    }
    String getName() {
        return name;
    }
    int getYear() {
        return year;
    }
    int getTuition() {
        return year * 20000;
    }


}

