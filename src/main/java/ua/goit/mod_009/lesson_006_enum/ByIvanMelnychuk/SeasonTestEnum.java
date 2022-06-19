package ua.goit.mod_009.lesson_006_enum.ByIvanMelnychuk;

enum Season {
    Summer,
    Autumn,
    Winter,
    Spring;

    @Override
    public String toString() {
        switch(this) {
            case Summer: return "Літо";
            case Autumn: return "Осінь";
            case Winter: return "Зима";
            case Spring: return "Весна";
        }
        return super.toString();
    }
}

class SeasonFormatter {
    public String getSeasonName(Season season) {
        switch(season) {
            case Summer: return "Summer";
            case Autumn: return "Autumn";
            case Winter: return "Winter";
            case Spring: return "Spring";
        }

        throw new IllegalArgumentException("We don't know name for " + season);
    }
}

class SeasonTestEnum {
    public static void main(String[] args) {
        SeasonFormatter sf = new SeasonFormatter();
        System.out.println(sf.getSeasonName(Season.Summer));

        // Enum methods
        System.out.println(Season.Summer.name()); // Returns the name of this enum constant - Summer
        System.out.println(Season.valueOf("Summer").name());
        System.out.println(Season.Summer); // Літо
        System.out.println(Season.Winter.ordinal()); // Returns the ordinal of this enumeration constant
        Season.values(); // Array of objects in ordinal
        for (Season value: Season.values()) {
            System.out.println(value.name());
        }
    }
}