package com.hillel.skoryk.homeworks.lesson6.competition;

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
