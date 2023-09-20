package com.hillel.skoryk.homeworks.lesson6.competition;

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
