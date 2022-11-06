public class MainClass {

    public static void main(String[] args){
        Predmet oop = new Predmet();
        oop.ime = "Oop";
        oop.profesor = "Ilija Jolevski";
        oop.krediti = 6;
        oop.semestar = 3;
        Predmet algoritmi = new Predmet("Algoritmi");
        algoritmi.profesor = "Violeta Manevska";
        algoritmi.krediti = 6;
        algoritmi.semestar = 3;
        Predmet kio = new Predmet("Kio", "Mimoza Jovanovska", 6);

        System.out.println("-Predmet 1" +
                "\nPredmet: " + oop.ime + "\nProfesor: " + oop.profesor +
                "\nKrediti: " + oop.krediti + "\nSemestar: " + oop.semestar +
                "\n\n-Predmet 2" +
                "\nPredmet: " + algoritmi.ime + "\nProfesor: " + algoritmi.profesor +
                "\nKrediti: " + algoritmi.krediti + "\nSemestar: " + algoritmi.semestar +
                "\n\n-Predmet 3" +
                "\nPredmet: " + kio.ime + "\nProfesor: " + kio.profesor +
                "\nKrediti: " + kio.krediti);
        //Pecatenjeto go organizirame so nov red (\n)
        // potoa kazuvame sto sakame da ispecatime ("Predmet: ")
        // i na kraj go pecatime so povikuvanje na konstruktorot vo klasata Predmet,
        // so soodvetniot objekt oop, algoritmi ili kio i na krajot soodvetnata promenliva od objektot (oop.ime)
    }
}
