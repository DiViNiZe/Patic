/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author INT105
 */
public class Adress {
    private String buildNumber ;
    private String village;
    private String street;
    private String district;
    private String province;
    private int zipcode;
    private String country;
  
    public Adress(String buildNumber,String village,String street ,String district,String province,int zipcode,String country){
        this.buildNumber = buildNumber;
        this.village = village;
        this.street = street;
        this.district = district;
        this.province = province;
        this.zipcode= zipcode;
        this.country = country;
    }
    
    public void setAdress(String buildNumber,String village,String street ,String district,String province,int zipcode,String country){
        this.buildNumber = buildNumber;
        this.village = village;
        this.street = street;
        this.district = district;
        this.province = province;
        this.zipcode= zipcode;
        this.country = country;
    }

    public void removeAdress(){
        this.buildNumber = "removed";
    }
    
    public String getBuildNumber() {
        return buildNumber;
    }

    public void setBuildNumber(String buildNumber) {
        this.buildNumber = buildNumber;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        if(buildNumber.equals("removed")){
             return "--Removed--";
           }else{
        return "Adress{" + "buildNumber=" + buildNumber + ", village=" + village + ", street=" + street + ", district=" + district + ", province=" + province + ", zipcode=" + zipcode + ", country=" + country + '}';
     }  
       
    }
    
    
}

