package sample;

public interface ProblemReporter {
    public void selectProblemType(String typeProblem);

    public Integer selectRoadLane();

    public void reportProblem(String firstLine,String secondLine, String thirdLine, Integer number);
}
