package sample;

import java.util.ArrayList;

public class FavouritesViewerImpl implements FavouritesViewer {

    public ArrayList<Route> showFavouriteRoutes(RouteBuilderImpl routeBuilder) {
        for (Route r : routeBuilder.favouritesRoutes) {
            System.out.println(r.id);
            System.out.println(r.TransportTypes);
            System.out.println(r.departureStoppingPoint);
            System.out.println(r.arrivalStoppingPoint);
            for (String stops : r.stops) {
                System.out.println(stops);
            }
        }
        return routeBuilder.favouritesRoutes;
    }

    public void unmarkFavourite(Route route, RouteBuilderImpl routeBuilder) {
        routeBuilder.favouritesRoutes.remove(route);
    }

    public void viewDetailedRoute(Route route) {
        System.out.println(route.id);
        System.out.println(route.TransportTypes);
        System.out.println(route.departureStoppingPoint);
        System.out.println(route.arrivalStoppingPoint);
        for (String stops : route.stops) {
            System.out.println(stops);
        }
    }

    public void selectRouteForBuilding(Route route) {

    }
}
