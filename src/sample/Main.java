package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main {
    public static void main(String[] args) {
        ScheduleViewerImpl scheduleViewer = new ScheduleViewerImpl();
        ProblemReporterImpl problemReporter = new ProblemReporterImpl();
        FavouritesViewerImpl favouritesViewer = new FavouritesViewerImpl();
        RouteBuilderImpl routeBuilder = new RouteBuilderImpl();
        Schedule schedule = new Schedule();
        RouteSchedule routeSchedule = new RouteSchedule();
        StoppingPointSchedule stoppingPointSchedule = new StoppingPointSchedule();
        Route route = new Route();
        ShowMap showMap = new ShowMap();
        BuildRoute buildRoute = new BuildRoute();
        MarkFavourite markFavourite = new MarkFavourite();
        DeselectTransportTypes deselectTransportTypes = new DeselectTransportTypes();
        ShowStoppingPointSchedule showStoppingPointSchedule = new ShowStoppingPointSchedule();
        ShowRouteSchedule showRouteSchedule = new ShowRouteSchedule();
        CommandSelectRouteForBuilding commandSelectRouteForBuilding = new CommandSelectRouteForBuilding();
        SubmitReportedProblem submitReportedProblem = new SubmitReportedProblem();
        MainView mainView = new MainView();
        mainView.scheduleSection = new ScheduleSection();
        mainView.reportSection = new ReportSection();
        mainView.favouriteSection = new FavouriteSection();
        mainView.menu= new Menu();
        mainView.routeSection = new RouteSection();

        mainView.setArgs(args);

    }
}
