package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.util.ArrayList;

public class MainView extends Application {
    ArrayList<Button> allButtons = new ArrayList<>();
    public ScheduleSection scheduleSection;
    public ReportSection reportSection;
    public FavouriteSection favouriteSection;
    public Menu menu;
    public RouteSection routeSection;

    @Override
    public void start(Stage stage) {
        Button buildRoute = new Button();
        buildRoute.setText("Build a route");
        buildRoute.setPrefWidth(100);

        Button schedule = new Button();
        schedule.setText("Schedule");
        schedule.setPrefWidth(100);
        schedule.setLayoutX(0);
        schedule.setLayoutY(40);


        Button favouriteRoutes = new Button();
        favouriteRoutes.setText("Favourite routes");
        favouriteRoutes.setPrefWidth(100);
        favouriteRoutes.setLayoutX(0);
        favouriteRoutes.setLayoutY(70);

        Button report = new Button();
        report.setText("Report a problem");
        report.setPrefWidth(100);
        report.setLayoutX(0);
        report.setLayoutY(100);


        Button showMenu = new Button();
        showMenu.setText("Show menu");
        showMenu.setPrefWidth(100);
        showMenu.setLayoutX(0);
        showMenu.setLayoutY(130);
        this.allButtons.add(report);
        this.allButtons.add(favouriteRoutes);
        this.allButtons.add(schedule);
        this.allButtons.add(buildRoute);
        this.allButtons.add(showMenu);
        for (Button button : this.allButtons) {
            this.getScheduleSection().buttons.add(button);
            this.getReportSection().buttons.add(button);
            this.getFavouriteSection().buttons.add(button);
            this.menu.buttons.add(button);
            this.getRouteSection().buttons.add(button);
        }

        schedule.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                scheduleSection.buttonPressed(schedule.getText());
            }
        });
        report.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                reportSection.buttonPressed(report.getText());
            }
        });
        favouriteRoutes.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                showHeader(favouriteRoutes.getText());
            }
        });
        showMenu.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                showMenu(showMenu.getText());
            }
        });

        buildRoute.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                showRouteSection(buildRoute.getText());
            }
        });
        Group group = new Group(buildRoute, schedule, favouriteRoutes, report,showMenu);
        Scene scene = new Scene(group);
        stage.setScene(scene);
        stage.setTitle("MainWindow");
        stage.setWidth(300);
        stage.setHeight(250);
        stage.show();
    }

    public RouteSection getRouteSection() {
        return routeSection;
    }

    public Menu getMenu() {
        return menu;
    }

    public FavouriteSection getFavouriteSection() {
        return favouriteSection;
    }

    public ReportSection getReportSection() {
        return reportSection;
    }

    public ScheduleSection getScheduleSection() {
        return scheduleSection;
    }

    public void setArgs(String[] args) {
        Application.launch(args);

    }

    public void showRouteSection(String text) {
        this.getRouteSection().buttonPressed(text);
    }

    public void showHeader(String text) {
        this.getFavouriteSection().buttonPressed(text);
    }

    public void showMenu(String text) {
        this.getMenu().buttonPressed(text);
    }

    public void dispose() {

    }
}
