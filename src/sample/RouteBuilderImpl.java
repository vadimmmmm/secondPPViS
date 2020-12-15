package sample;

import javax.lang.model.type.NullType;
import java.util.ArrayList;
import java.util.List;

public class RouteBuilderImpl implements RouteBuilder {
    ArrayList<Route> favouritesRoutes;

    @Override
    public ArrayList<Route> BuildRouteByParams(String params,ArrayList<Route> routes) {
        ArrayList<Route> result = new ArrayList<>();
        ArrayList<Route> temp = new ArrayList<>();
        String[] words = params.split(" ");
        for(int i = 0; i < temp.size(); ++i){
            if (routes.get(i).arrivalStoppingPoint.equals(words[i])){
                result.add(routes.get(i));
            }
        }
        return result;
    }

    public List<Route> divideRoutesByCategories(List<Route> route){
            return route;
    }

    public void viewDetailedRoute(Route route){
        System.out.println(route.id);
        System.out.println(route.arrivalStoppingPoint);
        System.out.println(route.arrivaTime);
        System.out.println(route.departureStoppingPoint);
        System.out.println(route.TransportTypes);

    }

    public void addRouteToFavourites(Route route){
        this.favouritesRoutes.add(route);
    }
}
