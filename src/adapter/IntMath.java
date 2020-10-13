package adapter;

public class IntMath implements Adapter {

    private Math adapter;

    public IntMath() {
        this.adapter = new Math();
    }

    @Override
    public int twiceOf(int num) {
        return (int) this.adapter.twoTime((float) num);
    }

    @Override
    public int halfOf(int num) {
        return (int) this.adapter.halfTime((float)num);
    }
}
