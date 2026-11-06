 package pkg;
 
 public class Movie {
    String name;
    double rating;
int ratings;
double monies;
     public Movie(String a,double b,int c,double d){
name = a;
rating = b;
ratings = c;
monies = d;
     }
     public Movie(){
name = "avengers";
rating = 8.0;
ratings = 33;
monies = 623357910;
     }
     public void movieToString(){
System.out.println("Name: "+name);
System.out.println("Rating: "+rating);
System.out.println("Number of ratings: "+ratings);
System.out.println("Revenue: "+monies);

     }
     public String getMovieName(){
return name;
     }
     public double getRevenue(){
        return monies;
     }
     public double getRating(){
        return rating;
     }
     public void addRating(double a){
        rating=((ratings*rating)+a)/(ratings+1);
     }
     public boolean compareRatings(Movie a){
if (this.rating > a.getRating()) {
    return true;
} else if(this.rating < a.getRating()) {
    return false;
} else {
    return false;
}
     }
     public String revenueToString(){
        String daado = ",";
        double leftover=monies;
        double divisior = monies;
        while(monies >1000){
monies =monies/1000;
            daado= daado + monies;
            leftover = leftover%1000;

        }
        return daado;
     }
     
}