package com.hillel.skoryk.homeworks.lesson8;

import java.util.Scanner;

public class CompetitionRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Оберіть кількість учасників (максимум 3):");
        int numberOfParticipants = scanner.nextInt();

        if (numberOfParticipants < 1 || numberOfParticipants > 3) {
            System.out.println("Невірна кількість учасників. Виберіть від 1 до 3.");
            return;
        }

        Participants[] participants = new Participants[numberOfParticipants];
        for (int i = 0; i < numberOfParticipants; i++) {
            System.out.println("Оберіть тип учасника (1 - Людина, 2 - Кіт, 3 - Робот):");
            int choice = scanner.nextInt();

            String name;
            int maxRunDistance;
            int maxJumpHeight;

            System.out.println("Введіть ім'я учасника:");
            name = scanner.next();

            System.out.println("Введіть максимальну відстань для бігу:");
            maxRunDistance = scanner.nextInt();

            System.out.println("Введіть максимальну висоту стрибка:");
            maxJumpHeight = scanner.nextInt();

            switch (choice) {
                case 1:
                    participants[i] = new Human(name, maxRunDistance, maxJumpHeight);
                    break;
                case 2:
                    participants[i] = new Cat(name, maxRunDistance, maxJumpHeight);
                    break;
                case 3:
                    participants[i] = new Robot(name, maxRunDistance, maxJumpHeight);
                    break;
                default:
                    System.out.println("Невірний вибір типу учасника. Оберіть 1, 2 або 3.");
                    i--; // Decrement i to repeat the input for this participant.
                    break;
            }
        }

        Obstacles[] obstacles = new Obstacles[2];
        obstacles[0] = new RunningTrack(300);
        obstacles[1] = new Wall(40);

        for (Participants participant : participants) {
            if (!participant.isDisqualified()) {
                System.out.println("Учасник " + participant.getName() + " розпочинає змагання.");
                for (Obstacles obstacle : obstacles) {
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

        scanner.close();
    }
}
