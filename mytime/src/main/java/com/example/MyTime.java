package com.example;

public class MyTime {
    private int hours;
    private int minutes;
    private int seconds;
    private boolean isPM;
    
    public void setHours(int hours) {
        this.hours = (hours <= 12 && hours > 0) ? hours : this.hours;
    }
    
    public int getHours() {
        return hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = (minutes < 60 && minutes >= 0) ? minutes : this.minutes;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = (seconds < 60 && seconds >= 0) ? seconds : this.seconds;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setIsPM(boolean isPM) {
        this.isPM = isPM;
    }

    public boolean getIsPM() {
        return isPM;
    }
    
    public void advanceTime(int seconds) {
        this.seconds += seconds;
        this.minutes += this.seconds / 60;
        // this.seconds -= ;
        this.hours += this.minutes / 60;
        // this.minutes -= ;
        if (this.hours > 12) {
            this.isPM = !isPM;
        }
        this.hours -= this.hours / 12 * 12;
        if (this.hours == 0) {
            this.hours = 1;
        }
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
            this.isPM = !isPM;
        }
    }
    
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d %s", hours, minutes, seconds, (isPM) ? "PM" : "AM");
    }
}