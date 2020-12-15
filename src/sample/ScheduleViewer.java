package sample;
import java.util.ArrayList;

public interface ScheduleViewer {
    public void selectScheduleType();
    public void viewRoutesList(ArrayList<RouteSchedule> routeSchedules);
    public void viewStoppingPointsList(ArrayList<StoppingPointSchedule> stoppingPointSchedules);
    public void viewRouteSchedule(RouteSchedule routeSchedule);
    public void viewStoppingPointSchedule(StoppingPointSchedule stoppingPointSchedule);
}
