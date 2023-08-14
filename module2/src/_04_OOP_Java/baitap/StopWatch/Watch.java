package _04_OOP_Java.baitap.StopWatch;

import java.util.Date;

import java.time.Instant;
import java.time.Duration;

class Watch {
    private long startTime;
    private long endTime;

    public Watch() {
        start();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start() {
        startTime = getCurrentTimeInMillis();
    }

    public void stop() {
        endTime = getCurrentTimeInMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }

    private long getCurrentTimeInMillis() {
        return Instant.now().toEpochMilli();
    }
}
