import java.util.*;
class PythagoreanTriplet{

    int a, b, c;
    public PythagoreanTriplet(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public static TripletsList makeTripletsList(){
        return new TripletsList();
    }
    public void printVal(){
        System.out.println(a+" "+b+" "+" "+c);  
    }

    @Override
    public boolean equals(Object othertriplet){
        PythagoreanTriplet other = (PythagoreanTriplet) othertriplet;
        return (a == other.a && b == other.b && c == other.c);
    }
}    
class TripletsList{    
    public Factoring withFactorsLessThanOrEqualTo(int value){
        return new Factoring();
    }
}
class Factoring{
    public Builder thatSumTo(int N){
        ArrayList<List<Integer>> triplets_found = new ArrayList<List<Integer>>(); 
        
        for(int mark1 = N/2 + 1; mark1 <= (2*N)/3; mark1++){
            for(int mark2 = 1; mark2 <= (mark1/2); mark2 ++){
                int a = mark2;
                int b = mark1 - mark2;
                int c = N - mark1;

                if(a*a + b*b == c*c){
                    Integer [] triplet = new Integer[] {a, b, c};
                    List<Integer> trip = Arrays.asList(triplet);
                    triplets_found.add(trip);
                }
            }
        }
        return new Builder(triplets_found);
    }
}
class Builder{
    ArrayList<List<Integer>> t;
    
    public Builder(ArrayList<List<Integer>> triplets_found){
        this.t = triplets_found;
    }

    public List<PythagoreanTriplet> build(){
        if (t.size()==0){
            return Collections.emptyList();
        }
        else if(t.size() == 1){
            return Collections.singletonList(
                new PythagoreanTriplet(t.get(0).get(0), t.get(0).get(1), t.get(0).get(2))
            );
        }
        else{
            List<PythagoreanTriplet> list= new ArrayList<PythagoreanTriplet>();
            for(List<Integer> item : t){
                list.add(
                    new PythagoreanTriplet(item.get(0),item.get(1),item.get(2))
                );
            }
            return list;
        }
    }
}
