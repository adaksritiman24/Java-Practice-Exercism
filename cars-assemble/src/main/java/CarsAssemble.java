public class CarsAssemble {
    private double successRate(int speed){
        if(speed <=4)
            return 1;
        else if( speed>4 && speed <=8)
            return 0.9;
        else if(speed == 9)
            return 0.8;
        return 0.77;        

    }
    public double productionRatePerHour(int speed) {
        return 221*speed*successRate(speed);
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed)/60;
    }
}
