package apis;

import models.Location;
import models.Place;
import org.junit.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class ZipCodeTests {

    @Test
    public void testBeverlyHills() {

        // create an object that represent Location class. This will be used to store the returned
        // values we need to expect, and then we can compare with the return of the api

        Location location = given()
                .get("http://api.zippopotam.us/us/90210")
                .as(Location.class);

        String country = location.getCountry();
        System.out.println(country);

        List<Place> placesValues = location.getPlaces();
        System.out.println(placesValues.get(0).getPlaceName());


    }
}
