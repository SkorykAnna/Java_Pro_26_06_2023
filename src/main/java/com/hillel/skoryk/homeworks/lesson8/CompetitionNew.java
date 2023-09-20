package com.hillel.skoryk.homeworks.lesson8;

/* import java.util.Scanner;

interface Participants {
    void run(int distance);
    void jump(int height);
    boolean isDisqualified();
    String getName();
}

class Human implements Participants {
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


class Cat implements Participants {
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

class Robot implements Participants {
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


interface Obstacles {
    void overcome(Participants participant);
}


class RunningTrack implements Obstacles {
    private int distance;

    public RunningTrack(int distance) {
        this.distance = distance;
    }

    @Override
    public void overcome(Participants participant) {
        participant.run(distance);
    }
}


class Wall implements Obstacles {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void overcome(Participants participant) {
        participant.jump(height);
    }
}



public class CompetitionNew {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Оберіть тип учасника (1 - Людина, 2 - Кіт, 3 - Робот):");
        int choice = scanner.nextInt();

        Participants participant;
        switch (choice) {
            case 1:
                participant = new Human("Саша", 500, 100);
                break;
            case 2:
                participant = new Cat("Пуша", 200, 30);
                break;
            case 3:
                participant = new Robot("Г'еральт", 400, 90);
                break;
            default:
                System.out.println("Невірний вибір. Виберіть 1, 2 або 3.");
                return;
        }

        Obstacles[] obstacles = new Obstacles[2];
        obstacles[0] = new RunningTrack(300);
        obstacles[1] = new Wall(40);

        if (!participant.isDisqualified()) {
            System.out.println("Учасник " + participant.getName() + " розпочинає змагання.");
            for (Obstacles obstacle : obstacles) {
                if (!participant.isDisqualified()) {
                    obstacle.overcome(participant);
                }
            }
            if (!participant.isDisqualified()) {
                System.out.println("Учасник " + participant.getName() + " пройшов всі перешкоди.");
            }
        }

        scanner.close();
    }
}

*/



