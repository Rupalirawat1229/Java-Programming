package CONCATINATE_NO;

public class format_a_multi_line_address {

        public static void main(String[] args) {



            System.out.print("Enter the street: ");
            String street = "landmark hotel" ;


            System.out.print("Enter the city: ");
            String city = "ranchi";


            System.out.print("Enter the zip code: ");
            String zipCode ="834001" ;


            String formattedAddress = street + "\n" + city + "\n" + zipCode;
            System.out.println("Formatted Address:\n" + formattedAddress);
        }
    }

