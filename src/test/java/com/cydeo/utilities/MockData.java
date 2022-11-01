package com.cydeo.utilities;

import com.github.javafaker.Faker;

import java.util.Locale;

public class MockData {

    static Faker faker = new Faker(Locale.US);

    public static String firstName() {
        return faker.name().firstName();
    }

    public static String fullName() {
        return faker.name().fullName();
    }

    public static String phoneNumber() {
        return faker.phoneNumber().phoneNumber();
    }

    public static int randomNum(int num) {
       return faker.number().numberBetween(1, num);
    }

}
