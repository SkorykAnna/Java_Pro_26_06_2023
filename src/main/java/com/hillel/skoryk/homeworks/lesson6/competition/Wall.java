package com.hillel.skoryk.homeworks.lesson6.competition;

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
