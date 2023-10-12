public class PirateCrewApp {
    public static void main(String[] args) {
        PirateCrew crew = new PirateCrew();

        Captain captain = new Captain("Monkey D. Luffy", 1500000000, true, "Thousand Sunny");
        Swordsman swordsman = new Swordsman("Roronoa Zoro", 320000000, false, "Three-sword Style");
        Navigator navigator = new Navigator("Nami", 66000000, false);

        crew.addPirate(captain);
        crew.addPirate(swordsman);
        crew.addPirate(navigator);

        crew.introduceCrew();
    }
} {
    
}
