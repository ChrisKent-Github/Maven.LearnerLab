package io.zipcoder.interfaces;

import java.util.HashMap;

public class ZipCodeWilmington {
    private Students students;
    private Instructors instructors;




    public void hostLecture(Instructor teacher, double numberOfHours, Learner[] learners){

        teacher.lecture(learners, numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours, Learner[] learners){

        Teacher teacher = Instructors.getInstance().findById(id);
        teacher.lecture(learners, numberOfHours);
    }

    public HashMap<Student, Double> getStudyMap(){
        HashMap<Student, Double> studyMap = new HashMap<Student, Double>();
        Student[] studentBody = (Student[]) students.toArray();
            for(int i = 0; i < students.personList.size(); i++){
            studyMap.put(studentBody[i], studentBody[i].getTotalStudyTime());
        }
        return studyMap;
    }
}
