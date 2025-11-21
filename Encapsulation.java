public class PerfumeManager {
    private String[] perfumes;

    public PerfumeManager(String[] perfumes) {
        this.perfumes = perfumes;
    }

    public String[] getPerfumes() {
        return perfumes;
    }

    public void setPerfume(int index, String perfumeName) {
        if (index >= 0 && index < perfumes.length) {
            perfumes[index] = perfumeName;
        } else {
            System.out.println("Invalid index!");
        }
    }

    public void displayPerfumes() {
        System.out.println("List of Perfumes:");
        for (int i = 0; i < perfumes.length; i++) {
            System.out.println((i + 1) + ". " + perfumes[i]);
        }
    }

    public String getFirstPerfume() {
        return perfumes[0];
    }

    public String getLastPerfume() {
        return perfumes[perfumes.length - 1];
    }

    public static void main(String[] args) {
        String[] myPerfumes = {"Chanel No. 5", "Dior Sauvage", "Gucci Bloom", "Yves Saint Laurent Black Opium", "Creed Aventus"};

        PerfumeManager manager = new PerfumeManager(myPerfumes);

        manager.displayPerfumes();

        System.out.println("\nFirst perfume: " + manager.getFirstPerfume());
        System.out.println("Last perfume: " + manager.getLastPerfume());

        manager.setPerfume(2, "Tom Ford Noir");
        System.out.println("\nAfter modifying the 3rd perfume:");
        manager.displayPerfumes();
    }
}
