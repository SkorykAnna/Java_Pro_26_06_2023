package com.hillel.skoryk.homeworks.lesson6.competition;

import java.util.Scanner;

interface Participant {
    void run(int distance);
    void jump(int height);
    boolean isDisqualified();
    String getName();
}

class Human implements Participant {
    private String name;
    private int maxRunDistance;
    private int maxJumpHeight;
    private boolean disqualified;

    public Human(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println("Людина " + name + " пробігла " + distance + " м");
        } else {
            System.out.println("Людина " + name + " не змогла пробігти " + distance + " м");
            disqualified = true;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println("Людина " + name + " стрибнула на " + height + " см");
        } else {
            System.out.println("Людина " + name + " не змогла стрибнути на " + height + " см");
            disqualified = true;
        }
    }

    @Override
    public boolean isDisqualified() {
        return disqualified;
    }

    @Override
    public String getName() {
        return name;
    }
}


class Cat implements Participant {
    private String name;
    private int maxRunDistance;
    private int maxJumpHeight;
    private boolean disqualified;

    public Cat(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println("Кіт " + name + " пробіг " + distance + " м");
        } else {
            System.out.println("Кіт " + name + " не зміг пробігти " + distance + " м");
            disqualified = true;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println("Кіт " + name + " стрибнув на " + height + " см");
        } else {
            System.out.println("Кіт " + name + " не зміг стрибнути на " + height + " см");
            disqualified = true;
        }
    }

    @Override
    public boolean isDisqualified() {
        return disqualified;
    }

    @Override
    public String getName() {
        return name;
    }
}

class Robot implements Participant {
    private String name;
    private int maxRunDistance;
    private int maxJumpHeight;
    private boolean disqualified;

    public Robot(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println("Робот " + name + " пробіг " + distance + " м");
        } else {
            System.out.println("Робот " + name + " не зміг пробігти " + distance + " м");
            disqualified = true;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println("Робот " + name + " стрибнув на " + height + " м");
        } else {
            System.out.println("Робот " + name + " не зміг стрибнути на " + height + " см");
            disqualified = true;
        }
    }

    @Override
    public boolean isDisqualified() {
        return disqualified;
    }

    @Override
    public String getName() {
        return name;
    }
}


interface Obstacle {
    void overcome(Participant participant);
}


class RunningTrack implements Obstacle {
    private int distance;

    public RunningTrack(int distance) {
        this.distance = distance;
    }

    @Override
    public void overcome(Participant participant) {
        participant.run(distance);
    }
}


class Wall implements Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void overcome(Participant participant) {
        participant.jump(height);
    }
}



public class Competition {
    public static void main(String[] args) {

        Participant[] participants = new Participant[3];
        participants[0] = new Human("Саша", 500, 100);
        participants[1] = new Cat("Пуша", 200, 30);
        participants[2] = new Robot("Г'еральт", 400, 90);


        Obstacle[] obstacles = new Obstacle[2];
        obstacles[0] = new RunningTrack(300);
        obstacles[1] = new Wall(40);

        for (Participant participant : participants) {
            if (!participant.isDisqualified()) {
                System.out.println("Учасник " + participant.getName() + " розпочинає змагання.");
                for (Obstacle obstacle : obstacles) {
                    if (!participant.isDisqualified()) {
                        obstacle.overcome(participant);
                    }
                }
                if (!participant.isDisqualified()) {
                    System.out.println("Учасник " + participant.getName() + " пройшов всі перешкоди.");
                }
            }
        }
    }
}



