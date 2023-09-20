package com.hillel.skoryk.homeworks.lesson6.competition;

import com.hillel.skoryk.homeworks.lesson8.Obstacles;
import com.hillel.skoryk.homeworks.lesson8.Participants;

public class Competition {
    public static void main(String[] args) {

        Participant[] participants = new Participant[3];
        participants[0] = new Human("Саша", 500, 100);
        participants[1] = new Cat("Пуша", 200, 30);
        participants[2] = new Robot("Герльт", 400, 90);


        Obstacle[] obstacles = new Obstacle[2];
        obstacles[0] = new RunningTrack(300);
        obstacles[1] = new Wall(40);

        for (Participant participant : participants) {
            if (!participant.isDisqualified()) {
                System.out.println("Учасник " + participant.getName() + " розпочинає змагання.");
                for (Obstacle obstacle : obstacles) {
                    if (!participant.isDisqualified()) {
                        obstacle.overcome(participant);
                        if (participant.isDisqualified()) {
                            System.out.println("Учасник " + participant.getName() + " вибуває з участі.");
                        }
                    }
                }
                if (!participant.isDisqualified()) {
                    System.out.println("Учасник " + participant.getName() + " пройшов всі перешкоди.");
                }
            }
        }
    }
}



