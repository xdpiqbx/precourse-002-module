package ua.goit.HomeWork.models;

public class UserModel {
    private final int id;
    private final String name;
    private final String username;
    private final String email;
    private final Address address;
    private final String phone;
    private final String website;
    private final Company company;

    public UserModel() {
        this.id = 1;
        this.name = "Bill";
        this.username = "BigBossBilly";
        this.email = "bos.billy@mail.com";
        this.address = new Address();
        this.phone = "987-2134-23-23";
        this.website = "bill.com";
        this.company = new Company();
    }

    public UserModel(int id, String name, String username, String email, Address address, String phone, String website, Company company) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.website = website;
        this.company = company;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", address=" + address +
                ", phone='" + phone + '\'' +
                ", website='" + website + '\'' +
                ", company=" + company +
                '}';
    }

    class Address{
        private final String street;
        private final String suite;
        private final String city;
        private final String zipcode;
        private final Geo geo;

        public Address() {
            this.street = "Edgar st.";
            this.suite = "Apt. 5";
            this.city = "San Antonio";
            this.zipcode = "78201-66";
            this.geo = new Geo();
        }

        public Address(String street, String suite, String city, String zipcode, Geo geo) {
            this.street = street;
            this.suite = suite;
            this.city = city;
            this.zipcode = zipcode;
            this.geo = geo;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "street='" + street + '\'' +
                    ", suite='" + suite + '\'' +
                    ", city='" + city + '\'' +
                    ", zipcode='" + zipcode + '\'' +
                    ", geo=" + geo +
                    '}';
        }

        class Geo{
            private final String lat;
            private final String lng;

            public Geo() {
                this.lat = "-37.3159";
                this.lng = "81.1496";
            }
            public Geo(String lat, String lng) {
                this.lat = lat;
                this.lng = lng;
            }

            @Override
            public String toString() {
                return "Geo{" +
                        "lat='" + lat + '\'' +
                        ", lng='" + lng + '\'' +
                        '}';
            }
        } // ================ Geo ENDS
    } // ================ Address ENDS
    class Company{
        private final String name;
        private final String catchPhrase;
        private final String bs;

        public Company() {
            this.name = "TopGun";
            this.catchPhrase = "Multi-layered client-server neural-net";
            this.bs = "harness real-time e-markets";
        }
        public Company(String name, String catchPhrase, String bs) {
            this.name = name;
            this.catchPhrase = catchPhrase;
            this.bs = bs;
        }

        @Override
        public String toString() {
            return "Company{" +
                    "name='" + name + '\'' +
                    ", catchPhrase='" + catchPhrase + '\'' +
                    ", bs='" + bs + '\'' +
                    '}';
        }
    } // ================ Company ENDS
} // ================ UserModel ENDS

// JSON example
/*
  {
    "id": 1,
    "name": "Leanne Graham",
    "username": "Bret",
    "email": "Sincere@april.biz",
    "address": {
      "street": "Kulas Light",
      "suite": "Apt. 556",
      "city": "Gwenborough",
      "zipcode": "92998-3874",
      "geo": {
        "lat": "-37.3159",
        "lng": "81.1496"
      }
    },
    "phone": "1-770-736-8031 x56442",
    "website": "hildegard.org",
    "company": {
      "name": "Romaguera-Crona",
      "catchPhrase": "Multi-layered client-server neural-net",
      "bs": "harness real-time e-markets"
    }
  },
*/