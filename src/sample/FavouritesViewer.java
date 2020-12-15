package sample;

import java.util.ArrayList;

public interface FavouritesViewer {
    public ArrayList<Route> showFavouriteRoutes(RouteBuilderImpl routeBuilder);
    public void unmarkFavourite(Route route, RouteBuilderImpl routeBuilder);
    public void viewDetailedRoute(Route route);
    public void selectRouteForBuilding(Route route);
}
