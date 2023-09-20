package com.hillel.skoryk.homeworks.lesson6.competition;

interface Participant {
    void run(int distance);

    void jump(int height);

    boolean isDisqualified();

    String getName();
}
