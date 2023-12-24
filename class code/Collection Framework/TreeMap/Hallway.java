import java.util.Scanner;

public class HallwayDoors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine(); // Consume the newline
        
        for (int t = 0; t < T; t++) {
            String hallway = scanner.nextLine();
            if (canReachKitchen(hallway)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
    
    public static boolean canReachKitchen(String hallway) {
        int[] keys = new int[3]; // To store the count of each type of key
        
        for (char c : hallway.toCharArray()) {
            switch (c) {
                case 'b':
                    keys[0]++;
                    break;
                case 's':
                    keys[1]++;
                    break;
                case 'g':
                    keys[2]++;
                    break;
                case 'B':
                    if (keys[0] <= 0) return false;
                    keys[0]--;
                    break;
                case 'S':
                    if (keys[1] <= 0) return false;
                    keys[1]--;
                    break;
                case 'G':
                    if (keys[2] <= 0) return false;
                    keys[2]--;
                    break;
            }
        }
        
        // Check if there are no remaining keys
        return keys[0] == 0 && keys[1] == 0 && keys[2] == 0;
    }
}