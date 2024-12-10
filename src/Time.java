import java.awt.color.ICC_ColorSpace;

public class Time {
    private int hr;
    private int min;
    private int sec;

    public Time(int hr, int min, int sec) {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }

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
