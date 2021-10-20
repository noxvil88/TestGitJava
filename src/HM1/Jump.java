public class Jump extends Obstacle {
    private int height;

    public Jump(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Friend friend) {
        friend.jump(height);
    }
}
