public class ClockHands {
    private myTimer seconds;
    private myTimer minutes;
    private myTimer hours;

    public ClockHands() {
        seconds = new myTimer(60);
        minutes = new myTimer(60);
        hours = new myTimer(24);

    }

    public void startClock() {
        while (true) {
            seconds.Advance();
            if (seconds.Value() == 0) {
                minutes.Advance();
                if (minutes.Value() == 0) {
                    hours.Advance();
                }
            }
            System.out.println(hours + " : " + minutes + " : " + seconds);
        }

    }
}
