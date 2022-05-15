package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class person {
        String Surname_Ruth56300;
        String Name_Ruth56300;
        String Street_Ruth56300;
        String Zipcode_Ruth56300;
        String City_Ruth56300;

        public void initialize() throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Person's Data collecting");
            System.out.println("Enter Surname");
            Surname_Ruth56300 = br.readLine();
            System.out.println("Enter Name");
            Name_Ruth56300 = br.readLine();
            System.out.println("Enter Street");
            Street_Ruth56300 = br.readLine();
            System.out.println("Enter Zip code");
            Zipcode_Ruth56300  = br.readLine();
            System.out.println("Enter city");
            City_Ruth56300 = br.readLine();
        }

        public void print() {
            System.out.println("Person's data Display");
            System.out.println("********************");
            System.out.println("Surname:" + Surname_Ruth56300 );
            System.out.println("Name:" + Name_Ruth56300  );
            System.out.println("Street:" + Street_Ruth56300);
            System.out.println("Zipcode:" + Zipcode_Ruth56300);
            System.out.println("City:" + City_Ruth56300  );
        }
    }
    class Staff extends person {
        String education;
        String position;

        public void initialize() throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            initialize();
            System.out.println("Enter your Education");
            education = br.readLine();
            System.out.println("Enter Your position ");
            position = br.readLine();
        }

        public void print() {
            print();
            System.out.println("Education" + education);
            System.out.println("Position" + position);
        }
    }

    class HR {
        public static void main(String[] args) throws IOException {
            Staff employee = new Staff();

            employee.initialize();
            employee.print();

        }

    }
}
