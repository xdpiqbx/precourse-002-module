package ua.goit.mod_009.lesson_006_enum;

import java.util.Arrays;

public class EnumDemo_001 {
    public static void main(String[] args) {
        DayOfWeek day = DayOfWeek.FRIDAY;
        System.out.println(Arrays.toString(DayOfWeek.values()));
        final DayOfWeek friday = DayOfWeek.valueOf("FRIDAY");
        System.out.println(friday); // FRIDAY
        final String name = friday.name();
        final String dayOfWeek = friday.getDayOfWeek();
        final Integer dayId = friday.getDayIdentifier();
        System.out.println("Name: " + name + ", dayOfWeek: " + dayOfWeek + ", dayId: " + dayId); // Name: FRIDAY, dayOfWeek: Friday, dayId: 6
        workDayOrNot(day);
    }

    public static void workDayOrNot(DayOfWeek day) {
        switch (day){
            case SUNDAY:
            case SATURDAY:
                System.out.println("Вихідний");
                break;
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Робочий день");
                break;
            default:
                System.out.println("Wrong day");

        }
    }
}
