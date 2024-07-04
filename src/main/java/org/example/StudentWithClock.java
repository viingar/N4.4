package org.example;

public class StudentWithClock implements Learner{
    private Learner learner;
    public StudentWithClock(Learner learner) {
        this.learner = learner;
    }
    @Override
    public void learn() {
        long start = System.currentTimeMillis();
        learner.learn();
        System.out.printf("Время учёбы: %s ms \n", System.currentTimeMillis() - start);
    }
}
