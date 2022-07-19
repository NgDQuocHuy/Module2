public class StopWatch {
    private long startTime = 0;
    private long endTime = 0;
    private boolean running = false;

    public long getStartTime() {
        return startTime = System.currentTimeMillis();
    }
    public long getEndTime() {
        return endTime = System.currentTimeMillis();
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
        this.running = true;
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
        this.running = false;
    }

    public long getElapsedTime() {
        long elapedTime;
        if (running) {
            elapedTime = System.currentTimeMillis() - startTime;
        } else {
            elapedTime = endTime - startTime;
        }
        return elapedTime;
    }
}
