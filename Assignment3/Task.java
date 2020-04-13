public abstract class Task implements Runnable {
    String name;
    boolean isFinished;

    public Task(String name) {
        this.name = name;
        this.isFinished = false;
    }

    public String getName() {
        return name;
    }

    public boolean getIsFinished() {
        return isFinished;
    }

    public void setIsFinished() {
        isFinished = true;
    }
}