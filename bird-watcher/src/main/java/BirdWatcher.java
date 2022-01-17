class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return this.birdsPerDay;
    }

    public int getToday() {
        if(birdsPerDay.length == 0)
            return 0;
        return this.birdsPerDay[this.birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[this.birdsPerDay.length - 1] += 1;
    }

    public boolean hasDayWithoutBirds() {
        for(int birds : birdsPerDay){
            if(birds==0)
                return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int totalBirds =0;
        for(int i = 0; i< Math.min(numberOfDays, birdsPerDay.length); i++){
            totalBirds += birdsPerDay[i];
        }
        return totalBirds;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for(int birds: birdsPerDay){
            if(birds >= 5)
                busyDays ++;
        }

        return busyDays;
    }
}
