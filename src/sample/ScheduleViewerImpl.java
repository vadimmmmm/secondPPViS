package sample;

import java.util.ArrayList;

public class ScheduleViewerImpl implements ScheduleViewer{
    public void selectScheduleType(){

    }
    public void viewRoutesList(ArrayList<RouteSchedule> routeSchedules){
        for(RouteSchedule routeSchedule: routeSchedules){
            for(Schedule schedule: routeSchedule.getRouteSchedule()){
                System.out.println(schedule.departureTime);
                System.out.println(schedule.arrivalTime);
            }
        }
    }
    public void viewStoppingPointsList(ArrayList<StoppingPointSchedule> stoppingPointSchedules){
        for(StoppingPointSchedule stoppingPointSchedule: stoppingPointSchedules){
            for(Schedule schedule: stoppingPointSchedule.getRouteSchedule()){
                System.out.println(schedule.arrivalStoppingPoint);
                System.out.println(schedule.departureStoppingPoints);
                for(String stops: schedule.stops){
                    System.out.println(stops);
                }
            }
        }
    }

    public void viewRouteSchedule(RouteSchedule routeSchedule){
        for(Schedule schedule: routeSchedule.getRouteSchedule()){
            System.out.println(schedule.departureTime);
            System.out.println(schedule.arrivalTime);
        }
    }
    public void viewStoppingPointSchedule(StoppingPointSchedule stoppingPointSchedule){
        for(Schedule schedule: stoppingPointSchedule.getRouteSchedule()){
            System.out.println(schedule.arrivalStoppingPoint);
            System.out.println(schedule.departureStoppingPoints);
            for(String stops: schedule.stops){
                System.out.println(stops);
            }
        }
    }

}
