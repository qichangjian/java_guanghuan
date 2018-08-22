package day12.Task1;

public class Score {
    private int score;

    public void setScore(int score) throws Exception {

        if(score <= 100 && score >=0){
            this.score = score;
        }else{
            throw new Exception("范围0-100");
        }

    }
}
