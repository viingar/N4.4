package org.example;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class StudentGetTime implements Learner {
    private Learner learner;

    public StudentGetTime(Learner learner) {
        this.learner = learner;
    }

    @Override
    public void learn() {
        Date timeStamp = Calendar.getInstance().getTime();
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        String timeString = timeFormat.format(timeStamp);
        System.out.println("Текущее время: " + timeString);
    }
}