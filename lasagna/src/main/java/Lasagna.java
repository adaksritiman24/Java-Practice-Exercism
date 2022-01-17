public class Lasagna {
    private int cookingTime = 40;
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return cookingTime;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int completedTime){
        return cookingTime - completedTime;
    }


    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int noOfLayers){
        return noOfLayers*2;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int noOfLayers, int ovenTime){
        return 2*noOfLayers + ovenTime;
    }
}
