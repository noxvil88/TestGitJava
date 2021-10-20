public class Swim extends Obstacle {
    private int distance;

    public Swim(int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Friend friend) {
        friend.swim(distance);
    }
}
