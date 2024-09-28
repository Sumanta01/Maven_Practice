package com.sumanta.student;

public class Address {

    private String city;
    private String state;
    private String country;
    private String zipCode;

    public Address(String city, String state, String country, String zipCode) {
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipCode = zipCode;

    }

    
    /**
     * @return String return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return String return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return String return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return String return the zipCode
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * @param zipCode the zipCode to set
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }


    @Override
    public String toString() {
        return "Address [city=" + city + ", state=" + state + ", country=" + country + ", zipCode=" + zipCode + "]";
    }

    

}
