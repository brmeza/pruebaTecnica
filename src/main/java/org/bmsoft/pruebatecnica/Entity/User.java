package org.bmsoft.pruebatecnica.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Long id;
    private String name;
    private String username;
    private String email;
    private Address address;
    private String phone;
    private String website;
    private Company company;

    @Setter
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Address {
        private String street;
        private String suite;
        private String city;
        private String zipcode;
        private Geo geo;

        @Setter
        @Getter
        @NoArgsConstructor
        @AllArgsConstructor
        public static class Geo {
            private String lat;
            private String lng;
        }
    }


    @Setter
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Company {
        private String name;
        private String catchPhrase;
        private String bs;
    }
}


