package io.zipcoder.interfaces;

public enum Educator implements Teacher{
    AUTUMN(Instructors.getInstance().getInstructor(1234), 0),
    ANDREW(Instructors.getInstance().getInstructor(2345), 0),
    ADAM(Instructors.getInstance().getInstructor(3456), 0),
    IZZY(Instructors.getInstance().getInstructor(4567), 0);
    public Instructor instructor;
    public double timeWorked;

    Educator(Person instructor, double timeWorked) {
        this.instructor = (Instructor) instructor;
        this.timeWorked = timeWorked;
    }

    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
        timeWorked += numberOfHours;
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        this.instructor = new Instructor(1234,AUTUMN.name());
        this.instructor = new Instructor(2345,ANDREW.name());
        this.instructor = new Instructor(3456,ADAM.name());
        this.instructor = new Instructor(4567,IZZY.name());
        instructor.lecture(learners, numberOfHours);
//        for (Learner student:learners) {
//            student.learn(numberOfHours/ learners.length);
//        }
        timeWorked += numberOfHours;
    }

    public double getTimeWorked(){
        return timeWorked;
    }
}


