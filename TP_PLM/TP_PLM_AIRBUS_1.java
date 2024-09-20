import java.util.Scanner;

public class TP_PLM_AIRBUS_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[][] plane = {
            {"Boeing", "A300", "Etude de faisabilité", "Transport Passager"},
            {"Beligan", "A400M", "En service", "Fret"},
            {"Concorde", "A390", "Clôturé", "Militaire"},
            {"Naval", "A320", "Définition", "Clôturé"}
        };

        // 1 - Application permettant d'afficher tous les avions 
        String inputUser = "";
        while (!inputUser.equals("y") && !inputUser.equals("n")) {
            System.out.println("Voulez-vous voir tous les avions ? y/n ");
            inputUser = scan.nextLine();
            if (inputUser.equals("y")) {
                for (int i = 0; i < plane.length; i++) {
                    for (int j = 0; j < plane[i].length; j++) {
                        System.out.print(plane[i][j] + " ");
                    }
                    System.out.println();
                }
            } else if (inputUser.equals("n")) {
                System.out.println("Au revoir !");
            } else {
                System.out.println("Entrée non valide !");
            }
        }

        // 2 - Rechercher une liste d'avions a partir d'un mot clé(A,320, 320) 
        System.out.println("Entrez un mot clé pour rechercher des avions : ");
        String inputPlaneResearch = scan.nextLine();
        boolean found = false;

        for (int i = 0; i < plane.length; i++) {
            for (int j = 0; j < plane[i].length; j++) {
                if (plane[i][j].contains(inputPlaneResearch)) {
                    for (int k = 0; k < plane[i].length; k++) {
                        System.out.print(plane[i][k] + " ");
                    }
                    System.out.println();
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("Aucun avion trouvé avec le mot clé : " + inputPlaneResearch);
        }

        scan.close();
    }
}
