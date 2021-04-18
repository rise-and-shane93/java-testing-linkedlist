public class Job {
    private int duration;
    private int jobNumber;

    public Job(int duration, int jobNumber) {
        this.duration = duration;
        this.jobNumber = jobNumber;
    }

    public int getJobDuration() {
        return this.duration;
    }

    public int getJobId() {
        return this.jobNumber;
    }
}