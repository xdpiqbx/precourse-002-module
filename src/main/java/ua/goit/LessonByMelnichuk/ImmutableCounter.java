package ua.goit.LessonByMelnichuk;

public class ImmutableCounter {
    private final int count;

    public ImmutableCounter(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public ImmutableCounter increment(){
        return new ImmutableCounter(getCount() + 1);
    }

    @Override
    public String toString() {
        return "ImmutableCounter{" +
                "count=" + count +
                '}';
    }
}
