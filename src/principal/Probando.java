package principal;

public class Probando {

    public static void main(String[] args) {
        System.out.println("PROBANDO");
                try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
                  System.out.println("PROBANDO 1");
    }
    
}
