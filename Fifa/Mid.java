class Fifa {
    public int noOfGoals;
    public String venue;
    public int havingWorldCups;

    public Fifa() {
        System.out.println("Who will be the winner?");
    }

    public Fifa(int noOfGoals, String venue) {
        this();
        this.noOfGoals = noOfGoals;
        this.venue = venue;
    }


    public String toString() {
        return "Fifa -> noOfGoals: " + noOfGoals + ", venue: " + venue;
    }

    // public void incrementWorldCups() {
    //     havingWorldCups++;
    // }

    
}

class BrazilFans extends Fifa {
    int havingWorldCups;
    public BrazilFans(int noOfGoals, String venue, int havingWorldCups) {
        super(noOfGoals, venue);
        this.havingWorldCups = havingWorldCups;
        // this.incrementWorldCups();
        // this.incrementWorldCups();
        // this.incrementWorldCups();
        // this.incrementWorldCups();
        // this.incrementWorldCups();
    }

    public String toString() {
        return "BrazilFans -> [Fifa -> noofGoals: "+noOfGoals+", venue:"+venue+"], havingWorldCups:"+havingWorldCups;
    }

    public void incrementWorldCups(){
        this.havingWorldCups++;
    }
}

class ArgentinaFans extends Fifa {
    int havingWorldCups;
    public ArgentinaFans(int noOfGoals, String venue, int havingWorldCups){
        super(noOfGoals,venue);
        this.havingWorldCups=havingWorldCups;
    }
    public String toString(){
         return "ArgentinaFans -> [Fifa -> noofGoals: "+noOfGoals+", venue:"+venue+"], havingWorldCups:"+havingWorldCups;
    }
    public void incrementWorldCups(){
        this.havingWorldCups++;
    }

}

public class Mid {
    public static void main(String[] args) {
        ArgentinaFans argentina = new ArgentinaFans(10, "Qatar", 2);
        BrazilFans brazil = new BrazilFans(7, "Qatar", 5);

        if (argentina.noOfGoals > brazil.noOfGoals) {
            argentina.incrementWorldCups();
        } else {
            brazil.incrementWorldCups();
        }

        System.out.println(argentina.toString());
        System.out.println(brazil.toString());
    }
}