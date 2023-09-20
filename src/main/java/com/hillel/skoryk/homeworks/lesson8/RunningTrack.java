package com.hillel.skoryk.homeworks.lesson8;

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
