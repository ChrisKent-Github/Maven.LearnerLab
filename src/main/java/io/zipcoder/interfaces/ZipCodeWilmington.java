package io.zipcoder.interfaces;

import java.util.HashMap;

public class ZipCodeWilmington {
    private Students students;
    private Instructors instructors;




    public void hostLecture(Instructor teacher, double numberOfHours, Learner[] learners){
//        Learner[] learners = students.personList.toArray(new Learner[0]);
//      Student[] studentBody = (Student[]) students.toArray();
        teacher.lecture(learners, numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours, Learner[] learners){
        //        Teacher teacher = (Teacher) instructors.findById(id);
//        Student[] studentBody = students.toArray();
//        Learner[] learners = (Learner[]) students.personList.toArray(new Learner[0]);
        Teacher teacher = Instructors.getInstance().findById(id);
        teacher.lecture(learners, numberOfHours);
    }

    public HashMap<Student, Double> getStudyMap(){
        HashMap<Student, Double> studyMap = new HashMap<Student, Double>();
        Student[] studentBody = (Student[]) students.toArray();
//        for (Student student: students.personList) {
            for(int i = 0; i < students.personList.size(); i++){
            studyMap.put(studentBody[i], studentBody[i].getTotalStudyTime());
        }
        return studyMap;
    }
}
