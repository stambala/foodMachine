package com.food.machine.practices;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JsonToJavaObject {

    private int id;

    private String name;

    private String address;

    private String country;

    private long mobileNumber;

    private String gender;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String adddress) {
        this.address = adddress;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "JsonToJavaObject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", country='" + country + '\'' +
                ", mobileNumber=" + mobileNumber +
                ", gender='" + gender + '\'' +
                '}';
    }
}
