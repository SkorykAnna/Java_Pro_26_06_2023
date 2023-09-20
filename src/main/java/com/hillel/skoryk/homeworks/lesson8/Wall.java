package com.hillel.skoryk.homeworks.lesson8;

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
