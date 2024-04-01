public class Main {
    public static void main(String[] args) {


        /* Parašykite programą, kuri pagal gimimo metus (sveikas skaičius) patikrintų,
        ar žmogus yra pilnametis (18 metų arba vyresnis). Atpausdinti Vyrensis arba
        Jaunesnis ir šalia atspaudinti amžių - panaudojant pasirinktą ciklą, su
        kiekviena iteracija iki dabar (2024)
         */

        // Nesupratau salygos del cilko ir iteraciju
        int gimimoMetai = 2007;
        int dabartiniaiMetai = 2024;
        System.out.println("Gimimo metai: " + gimimoMetai);
        if (dabartiniaiMetai - gimimoMetai < 18){
            System.out.println("Jaunesnis, " + (dabartiniaiMetai - gimimoMetai) + " metu amziaus.");
        } else {
            System.out.println("Vyresnis, " + (dabartiniaiMetai - gimimoMetai) + " metu amziaus.");
        }
        System.out.println();

        /* Parašykite programą, kuri išspaudintų visus skaičius nuo 1 iki 10 000
        kurie dalinasi be liekanos iš (skirtingi variantai): 2, 5, 7, 8, 12, 16, 42, 103, 111, 223, 250.
        Jeigu skaičius nesidalina, nei iš vieno iš išvardintų - atspausdinti skaičių ir prierašą - nesidalina.
         */

        int manoSkaiciai[] = {2, 5, 7, 8, 12, 16, 42, 103, 111, 223, 250};
        int suKiekSkaiciu; //Su kiek skaiciu dalinasi be liekanos
        for(int i = 1; i < 10000; i++){
            suKiekSkaiciu = 0;
            for(int j = 0; j < manoSkaiciai.length; j++){
                if (i % manoSkaiciai[j] == 0) {
                    System.out.println("Skaicius " + i + " dalinasi is " + manoSkaiciai[j] + " be liekanos");
                    suKiekSkaiciu++;
                }
            }
            if(suKiekSkaiciu == 0){
                System.out.println("Skaicius " + i + " nesidalina be liekanos nei is vieno is pateiktu skaiciu ");
            }
        }
    }
}