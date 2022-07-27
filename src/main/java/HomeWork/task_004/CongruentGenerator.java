package HomeWork.task_004;

public class CongruentGenerator {
    private final long a;

    public CongruentGenerator(long a) {
        this.a = a;
    }

    // x[0] = seed
    // x[n + 1] = 1 (a x[n] + c) % m

    public long next(long c, long m, long seed){
        return (a * seed + c) % m;
    }
}
