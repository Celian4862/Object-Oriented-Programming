public class MyTime {
    private int hours = 0;
    private int minutes = 0;
    private int seconds = 0;
    
    public void setHours(int hours) {
        this.hours = (hours <= 12 && hours > 0) ? hours : this.hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = (minutes < 60 && minutes >= 0) ? minutes : this.minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = (seconds < 60 && seconds >= 0) ? seconds : this.seconds;
    }
    
    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
    
    public void advanceTime(int seconds) {
        this.seconds += seconds;
        this.minutes += this.seconds / 60;
        this.seconds -= this.seconds / 60 * 60;
        this.hours += this.minutes / 60;
        this.minutes -= this.minutes / 60 * 60;
        this.hours -= this.hours / 12 * 12;
    }
    
    public void tickBySecond() {
        seconds++;
        if (seconds > 59) {
            seconds = 0;
            tickByMinute();
        }
    }
    
    public void tickByMinute() {
        minutes++;
        if (minutes > 59) {
            minutes = 0;
            tickByHour();
        }
    }
    
    public void tickByHour() {
        hours++;
        if (hours > 12) {
            hours = 0;
        }
    }
    
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}