

public class Marks {
    String id;
    double quizMark;
    double midMark;
    double finalMark;
    
    Marks(String userId, double qMark, double midMark, double finalMark){
        this.id = userId;
        this.quizMark = qMark;
        this.midMark = midMark;
        this.finalMark = finalMark;
    }

    void passedOrNot(){
        double result = this.quizMark + this.midMark+this.finalMark;
        if(result>= 55){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }
    }

}

