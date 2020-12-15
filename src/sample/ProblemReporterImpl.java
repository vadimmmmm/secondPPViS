package sample;

public class ProblemReporterImpl implements ProblemReporter{
    public String typeProblem;


    public void selectProblemType(String typeProblem){
        this.typeProblem = typeProblem;
    }

    public Integer selectRoadLane(){
        return null;
    }

    public void reportProblem(String firstLine,String secondLine, String thirdLine, Integer number){

    }

}
