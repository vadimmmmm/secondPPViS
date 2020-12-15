package sample;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public interface RouteBuilder {
    ArrayList<Route> BuildRouteByParams(String params, ArrayList<Route> routes);

    List<Route> divideRoutesByCategories(List<Route> route);

    void viewDetailedRoute(Route route);

    void addRouteToFavourites(Route route);
}
