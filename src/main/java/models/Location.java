package models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Location {

    //Actually the field name returned by the api is "post code", so we need to bind it
    String postCode;
    String country;
    // this happens with this field name too "country abbreviation
    String countryAbbreviation;

    // Array of objects called places
     List<Place> places;

     // we have to bind all fields of the response where we have 2 words separately by with spaces
    // with jackson bind, so java can understand what that fields means and associate that with variables

    // to do that we will put an annotation. So we use @JsonProperty and put inside that the field name
    // of the response api
    @JsonProperty("post code")
    public String getPostCode() {
        return postCode;
    }

    @JsonProperty("post code")
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("country abbreviation")
    public String getCountryAbbreviation() {
        return countryAbbreviation;
    }

    @JsonProperty("country abbreviation")
    public void setCountryAbbreviation(String countryAbbreviation) {
        this.countryAbbreviation = countryAbbreviation;
    }

    public List<Place> getPlaces() {
        return places;
    }

    public void setPlaces(List<Place> places) {
        this.places = places;
    }
}
