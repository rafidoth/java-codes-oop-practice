public class Movie {

    // a.
    private String name;
    protected String origin;
    public String genre;
    public float rating;

    //b.
    public String getName() {
        return this.name;
    }

    public String getOrigin() {
        return this.origin;
    }

    //c
    public Movie(String name, String origin, String genre, float rating) {
        this.name = name;
        this.origin = origin;
        this.genre = genre;
        this.rating = rating;
    }


    public Movie(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }

    
    //d
    public void details() {
        System.out.println("You are watching " + name);
        System.out.println("Origin: " + origin);
        System.out.println("Genre: " + genre);
        System.out.println("Rating: " + rating);
    }

    public static void main(String[] args){
        Movie ob1= new Movie("Shutter Island","USA","Thriller",8.2f);
        ob1.details();
    }
}