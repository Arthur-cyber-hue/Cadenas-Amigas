import java.util.Scanner;

public class CadenasAmigas {

    /**
   Presentado por :
     Luis Arturo Diaz Torres
     Carlos Andrés Reyes Figueredo
     */
    public static boolean sonAmigas(String s, String t) {

        if (s.length() != t.length() || s.length() < 2) {
            return false;
        }

        int longitud = s.length();

        for (int i = 1; i < longitud; i++) {
            String u = s.substring(0, i);
            String v = s.substring(i);

            String combinacion = v + u;
            if (combinacion.equals(t)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== PROGRAMA: CADENAS AMIGAS ===");
        System.out.print("Ingrese la primera cadena (S): ");
        String s = scanner.nextLine();

        System.out.print("Ingrese la segunda cadena (T): ");
        String t = scanner.nextLine();

        boolean amigas = sonAmigas(s, t);

        System.out.println("\n--- RESULTADO ---");
        if (amigas) {
            System.out.println("Las cadenas \"" + s + "\" y \"" + t + "\" SÍ son amigas.");

            for (int i = 1; i < s.length(); i++) {
                String u = s.substring(0, i);
                String v = s.substring(i);
                if ((v + u).equals(t)) {
                    System.out.println("\nExplicación:");
                    System.out.println("u = \"" + u + "\"");
                    System.out.println("v = \"" + v + "\"");
                    System.out.println("S = u + v -> \"" + u + "\" + \"" + v + "\" = \"" + s + "\"");
                    System.out.println("T = v + u -> \"" + v + "\" + \"" + u + "\" = \"" + t + "\"");
                    break;
                }
            }
        } else {
            System.out.println("Las cadenas \"" + s + "\" y \"" + t + "\" NO son amigas.");
        }

        scanner.close();
    }
}