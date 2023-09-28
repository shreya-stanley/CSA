public class Mathhex {
    public static void main(String[] args) {
        System.out.println(swap(345));
        System.out.println(swap(678));
        System.out.println(swap(932));

        timeLeft(1, 15, 4, 36);
        timeLeft(1, 34, 8, 20);
        dayOfWeek(0,1);
        dayOfWeek(0,14);
        dayOfWeek(6,22);
        dayOfWeek(5,4);
        dayOfWeek(1,24);
        dayOfWeek(2,1);

    }

    public static int swap(int initial) {
        int ones = initial % 10;
        int tens = initial % 100 / 10;
        int hundreds = initial % 1000 / 100;
        int answer = hundreds * 100 + ones * 10 + tens * 1;
        return answer;
    }

    public static void timeLeft(int currentHour, int curMin, int departureHour, int depMin) {
        int totalDepMin = departureHour * 60 + depMin;
        int curDepMin = currentHour * 60 + curMin;
        int depMins = totalDepMin - curDepMin;
        int timeLeftHrs = depMins / 60;
        int timeLeftMins = depMins % 60;
        System.out.println(timeLeftHrs + " hours and " + timeLeftMins + " minutes");
    }

    public static int dayOfWeek(int day, int date) {
        int a = (date + day - 1) % 7;
        System.out.println(a);
        return a;

    }
}
