package com.example.entity;

import com.example.validation.CourseCode;
import jakarta.validation.constraints.*;

public class Customer {
    private String firstName;
    @NotNull(message = "is required")
    @Size(min=1,message = "is required")
    private String lastName;
    @NotNull(message = "is required")
    @Min(value = 1,message = " must be greater than 0")
    @Max(value = 10,message = "must be less than or equal  10")
    private Integer num;
    @Pattern(regexp = "^[a-zA-Z0-9]{5}" ,message = "must be 5 char/digits")
    private String postalCode ;
    @CourseCode
    private String courseCode;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
}
