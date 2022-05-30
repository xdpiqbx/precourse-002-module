package ua.goit.mod_009.lesson_006_enum;

public enum DayOfWeek {
    SUNDAY("Sunday",1){
        @Override
        public void workDayOrNot() {
            System.out.println(this.getDayOfWeek() + " Вихідний");
        }
    },
    MONDAY("Monday", 2){
        @Override
        public void workDayOrNot() {
            System.out.println(this.getDayOfWeek() + " Робочий день");
        }
    },
    TUESDAY("Tuesday", 3){
        @Override
        public void workDayOrNot() {
            System.out.println(this.getDayOfWeek() + " Робочий день");
        }
    },
    WEDNESDAY("Wednesday",4){
        @Override
        public void workDayOrNot() {
            System.out.println(this.getDayOfWeek() + " Робочий день");
        }
    },
    THURSDAY("Thursday",5){
        @Override
        public void workDayOrNot() {
            System.out.println(this.getDayOfWeek() + " Робочий день");
        }
    },
    FRIDAY("Friday",6){
        @Override
        public void workDayOrNot() {
            System.out.println(this.getDayOfWeek() + " Робочий день");
        }
    },
    SATURDAY("Saturday",7){
        @Override
        public void workDayOrNot() {
            System.out.println(this.getDayOfWeek() + " Вихідний");
        }
    };
    private String dayOfWeek;
    private Integer dayIdentifier;
    DayOfWeek(String dayOfWeek, Integer id){
        this.dayOfWeek = dayOfWeek;
        this.dayIdentifier = id;
    }
    public String getDayOfWeek() {
        return dayOfWeek;
    }
    public Integer getDayIdentifier() {
        return dayIdentifier;
    }
    public abstract void workDayOrNot();
}
