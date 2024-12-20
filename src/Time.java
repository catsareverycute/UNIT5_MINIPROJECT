/**
 * Represents military time (HH:MM:SS)
 */
public class Time {
    private int hr;
    private int min;
    private int sec;

/**
 * Constructor for Time class. Creates instance of Time with given hours, minutes, and seconds
 * 
 * @param hr hours (0-23)
 * @param min minutes (0-59)
 * @param sec seconds (0-59)
 */
    public Time(int hr, int min, int sec) {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }

    /**
     * Returns time in HH:MM:SS as a string, pads zero if unit is less than 10
     * 
     * @return string representing time
     */
    public String toString() {
        String time = "";
        if (hr < 10) {
            time += "0" + hr + ":";
        } else {
            time += hr + ":";
        }
        if (min < 10) {
            time += "0" + min + ":";
        } else {
            time += min + ":";
        }
        if (sec < 10) {
            time += "0" + sec;
        } else {
            time += sec;
        }
        return time;
    }

    /**
     * Increases second by one, changing secs/mins/hrs as necessary
     */
    public void tick() {
        sec ++;
        if (sec == 60) {
            sec = 0;
            min++;
        }
        if (min == 60) {
            min = 0;
            hr++;
        }
        if (hr == 24) {
            hr = 0;
        }
    }

    /**
     * Adds time of an instance of Time to this instance's time, changing secs/mins/hrs as necessary
     * 
     * @param time Time instance's time that's being added
     */
    public void add(Time time) {
        sec += time.sec;
        min += time.min;
        hr += time.hr;
        if (sec >= 60) {
            min += sec/60;
            sec = sec % 60;
        }
        if (min >= 60) {
            hr += min/60;
            min = min % 60;
        }
        if (hr >= 24) {
            hr = hr % 24;
        }
    }
}
