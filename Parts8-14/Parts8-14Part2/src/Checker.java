public class Checker {

    public static boolean isDayOfTheWeek(String string) {
        if (string.matches("mon|tue|wed|thu|fri|sat|sun")) {
            return true;
        }
        return false;
    }

    public static boolean allVowels(String string) {
        if (string.matches("(a|e|i|u|o|)*")) {
            return true;
        }
        return false;
    }

    public static boolean timeOfDay(String string) {
        //##/##/## 24 hour time 23:44:45
        if (string.matches("(([01])[0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9])")) {
            return true;
        }
        return false;
    }
}
