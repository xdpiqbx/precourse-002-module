package LessonByMelnichuk.lambdaStream.streamsTraining.customRand;

public class RandomAlgorithm {
    private int a, c, m;

    public RandomAlgorithm(int a, int m) {
        this.a = a;
        this.m = m;
    }

    public RandomAlgorithm c (int c){
        this.c = c;
        return this;
    }

    public int next(){
        int i = a * c * m;
        a += 1;
        c += 2;
        m += 3;
        return (i + 800) % 670;
    }
}
