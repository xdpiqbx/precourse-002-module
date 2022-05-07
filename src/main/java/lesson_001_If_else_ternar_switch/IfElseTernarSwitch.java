package main.java.lesson_001_If_else_ternar_switch;

import java.util.Random;

public class IfElseTernarSwitch {
    public static void main(String[] args) {

        boolean randomBool = getRandomBool();
        if(randomBool){
            System.out.println("Is True =)");
        }else{
            System.out.println("Is False !!!");
        }

        int iAge = getRandomInt();
        whatToDoWithAge(iAge);

        System.out.println(
            getRandomInt() > 15 ? getRandomInt() : "Some other"
        );

        int iSomeNum = getRandomInt();
        switch(iSomeNum){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Other");
        }
    }
    private static void whatToDoWithAge(int iAge) {
        if(iAge >= 18){
            System.out.println("Is adult");
        }else if(iAge >= 14){
            System.out.println("Is NOT adult");
        }else{
            System.out.println("Too small");
        }
    }

    public static boolean getRandomBool(){
        Random random = new Random();
        return random.nextBoolean();
    }

    public static int getRandomInt(){
        Random random = new Random();
        return random.nextInt(25);
    }
}
