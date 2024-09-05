package ENUM;



public class EnumExample {

   public enum Day {
        SUNDAY("Weekend"), 
        MONDAY("Weekday"), 
        TUESDAY("Weekday"), 
        WEDNESDAY("Weekday"), 
        THURSDAY("Weekday"), 
        FRIDAY("Weekday"), 
        SATURDAY("Weekend");

        // Enum field
        private String typeOfDay;

        // Constructor for the enum
        Day(String typeOfDay) {
            this.typeOfDay = typeOfDay;
        }

        // Method to get the type of the day
        public String getTypeOfDay() {
            return typeOfDay;
        }
    }

    public static void main(String[] args) {
        // Example 1: Display all days and their types
        System.out.println("All Days and their types:");
        for (Day day : Day.values()) {
            System.out.println(day + " is a " + day.getTypeOfDay());
        }

        // Example 2: Using enum in a switch statement
        
        Day today = Day.WEDNESDAY;
        System.out.println("\nUsing switch statement:");
        switch (today) {
            case MONDAY:
                System.out.println("Back to work!");
                break;
            case FRIDAY:
                System.out.println("Almost weekend!");
                break;
            case SUNDAY:
            case SATURDAY:
                System.out.println("It's the weekend!");
                break;
            default:
                System.out.println("Midweek day.");
                break;
        }

        // Example 3: Checking specific enum value
        
        System.out.println("\nChecking specific day:");
        if (today == Day.WEDNESDAY) {
            System.out.println("Today is Wednesday!");
        }

        // Example 4: Comparing ordinal values
        
        
        System.out.println("\nComparing ordinal values:");
        if (Day.MONDAY.ordinal() < Day.WEDNESDAY.ordinal()) {
            System.out.println("Monday comes before Wednesday");
        }

        // Example 5: Finding the next day
        
        
        System.out.println("\nFinding the next day:");
        Day tomorrow = Day.values()[(today.ordinal() + 1) % Day.values().length];
        System.out.println("If today is " + today + ", tomorrow will be " + tomorrow);
    }
}
