public class MainClass {

    public static void main(String[] args){
        Avtomobil def = new Avtomobil();
        Avtomobil din = new Avtomobil("Renault", "Clio", 174632);
        def.marka = "Peugeot";
        def.model = "207";
        def.km = 233445;

        System.out.println("-Avtomobil 1 \nMarka: " + def.marka + "\nModel: " + def.model + "\nKilometri: " + def.km +
                "\n-Avtomobil 2 \nMarka: " + din.marka + "\nModel: " + din.model + "\nKilometri: " + din.km);
    }
}
