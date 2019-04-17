import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String iniziale, parola;
        int caratteri, scelta=0;
        char risp=' ';
        String[] nazioni =
                           {"Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Anguilla", "Antigua & Barbuda", "Argentina",
                                   "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh",
                                   "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bermuda", "Bhutan", "Bolivia",
                                   "Bosnia &amp; Herzegovina", "Botswana", "Brazil", "British Virgin Islands", "Brunei", "Bulgaria",
                                   "Burkina Faso", "Burundi", "Cambodia", "Cameroon", "Canada", "Cape Verde", "Cayman Islands", "Chad",
                                   "Chile", "China", "Colombia", "Congo", "Cook Islands", "Costa Rica", "Cote D Ivoire", "Croatia",
                                   "Cruise Ship", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica",
                                   "Dominican Republic", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Estonia", "Ethiopia",
                                   "Falkland Islands", "Faroe Islands", "Fiji", "Finland", "France", "French Polynesia",
                                   "French West Indies", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Gibraltar", "Greece",
                                   "Greenland", "Grenada", "Guam", "Guatemala", "Guernsey", "Guinea", "Guinea Bissau", "Guyana", "Haiti",
                                   "Honduras", "Hong Kong", "Hungary", "Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland",
                                   "Isle of Man", "Israel", "Italy", "Jamaica", "Japan", "Jersey", "Jordan", "Kazakhstan", "Kenya",
                                   "Kuwait", "Kyrgyz Republic", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya",
                                   "Liechtenstein", "Lithuania", "Luxembourg", "Macau", "Macedonia", "Madagascar", "Malawi", "Malaysia",
                                   "Maldives", "Mali", "Malta", "Mauritania", "Mauritius", "Mexico", "Moldova", "Monaco", "Mongolia",
                                   "Montenegro", "Montserrat", "Morocco", "Mozambique", "Namibia", "Nepal", "Netherlands",
                                   "Netherlands Antilles", "New Caledonia", "New Zealand", "Nicaragua", "Niger", "Nigeria", "Norway",
                                   "Oman", "Pakistan", "Palestine", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines",
                                   "Poland", "Portugal", "Puerto Rico", "Qatar", "Reunion", "Romania", "Russia", "Rwanda",
                                   "Saint Pierre &amp; Miquelon", "Samoa", "San Marino", "Satellite", "Saudi Arabia", "Senegal", "Serbia",
                                   "Seychelles", "Sierra Leone", "Singapore", "Slovakia", "Slovenia", "South Africa", "South Korea",
                                   "Spain", "Sri Lanka", "St Kitts &amp; Nevis", "St Lucia", "St Vincent", "St. Lucia", "Sudan",
                                   "Suriname", "Swaziland", "Sweden", "Switzerland", "Syria", "Taiwan", "Tajikistan", "Tanzania",
                                   "Thailand", "Timor L'Este", "Togo", "Tonga", "Trinidad &amp; Tobago", "Tunisia", "Turkey",
                                   "Turkmenistan", "Turks &amp; Caicos", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom",
                                   "United States", "Uruguay", "Uzbekistan", "Venezuela", "Vietnam", "Virgin Islands (US)", "Yemen",
                                   "Zambia", "Zimbabwe"};
        do
        {
            
            System.out.println("1) Numero di nazioni presenti nell'array \n2) Nazioni il cui nome inizia con una certa lettera \n3) Nazioni nel cui nome compare una certa stringa \n4) Nazioni il cui nome è lungo un certo numero di caratteri \n5) Elenco delle nazioni dalla A alla Z \n6) Elenco delle nazioni dalla Z alla A");
            scelta = scan.nextInt();
            
            switch(scelta)
            {
                case 1:
                    System.out.println("L'array contiene " + nazioni.length + " elementi");
                    break;
                    
                case 2:
                    System.out.println("Inserisci una lettera");
                    iniziale = scan.nextLine();
                    iniziale = iniziale.toUpperCase();
                    System.out.println("NAZIONI TROVATE:");
                    for (int i = 0; i < nazioni.length; i++) {
                        if (nazioni[i].substring(0, 1).matches(iniziale) == true) {
                            System.out.println(nazioni[i]);
                        }
                    }
                    break;
                    
                case 3:
                    System.out.println("Inserisci una stringa (fai attenzione alle maiuscole!)");
                    parola = scan.nextLine();
                    System.out.println("NAZIONI TROVATE:");
                    for (int i = 0; i < nazioni.length; i++) {
                        if (nazioni[i].contains(parola) == true) {
                            System.out.println(nazioni[i]);
                        }
                    }
                    break;
                    
                case 4:
                    System.out.println("Inserisci un numero");
                    caratteri = scan.nextInt();
                    System.out.println("NAZIONI TROVATE:");
                    for (int i = 0; i < nazioni.length; i++) {
                        if (nazioni[i].length() == caratteri) {
                            System.out.println(nazioni[i]);
                        }
                    }
                    break;
                    
                case 5:
                    System.out.println("NAZIONI DALLA A ALLA Z");
                    Arrays.sort(nazioni);
                    for (int i = 0; i < nazioni.length; i++) {
                        System.out.println(nazioni[i]);
                    }
                    break;
                    
                case 6:
                    System.out.println("NAZIONI DALLA Z ALLA A");
                    for (int i = nazioni.length-1; i>=0; i--) {
                        System.out.println(nazioni[i]);
                    }
                    break;
                    
                default: System.out.println("Ciao!");
            }
            
            System.out.println("Vuoi eseguire un'altra operazione? (S/N)");
            risp = scan.next().charAt(0);
        }while(risp == 'S' || risp == 's');
        
        scan.close();
    }
}
