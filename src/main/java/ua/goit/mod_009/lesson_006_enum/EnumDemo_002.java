
package ua.goit.mod_009.lesson_006_enum;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;

public class EnumDemo_002 {
    public static void main(String[] args) {
        DayOfWeek day = DayOfWeek.FRIDAY;
        System.out.println(Arrays.toString(DayOfWeek.values()));
        final DayOfWeek friday = DayOfWeek.valueOf("FRIDAY");
        System.out.println(friday); // FRIDAY
        final String name = friday.name();
        final String dayOfWeek = friday.getDayOfWeek();
        final Integer dayId = friday.getDayIdentifier();
        System.out.println("Name: " + name + ", dayOfWeek: " + dayOfWeek + ", dayId: " + dayId); // Name: FRIDAY, dayOfWeek: Friday, dayId: 6
        day.workDayOrNot();
        System.out.println("Hello Java");

//        EnumSet<DayOfWeek> dayOfWeeks = EnumSet.of(DayOfWeek.FRIDAY, DayOfWeek.MONDAY);
        EnumSet<DayOfWeek> dayOfWeeks = EnumSet.allOf(DayOfWeek.class); // [SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY]
        System.out.println(dayOfWeeks);
        EnumMap<DayOfWeek, List<String>> dayPlans = new EnumMap<>(DayOfWeek.class);
        dayPlans.put(DayOfWeek.MONDAY, Arrays.asList("Сходить к врачу", "Убарть"));
        System.out.println(dayPlans);
    }
}
