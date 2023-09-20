package com.hillel.skoryk.homeworks.lesson6.competition;

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
