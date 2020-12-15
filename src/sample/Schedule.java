package sample;

import javax.xml.transform.sax.SAXResult;
import java.util.ArrayList;

public class Schedule {
    public Integer id;
    public String departureStoppingPoints;
    public String arrivalStoppingPoint;
    public String departureTime;
    public String arrivalTime;
    public ArrayList<String> transportTypes;
    public ArrayList<String> stops;
}
