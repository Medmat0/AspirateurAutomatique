 public class AspirateurAutomatique {
    private int x;
    private int y;
    private char orientation;

    public AspirateurAutomatique(int x, int y, char orientation) {
        this.x = x;
        this.y = y;
        this.orientation = orientation;
    }

    public void executerInstructions(String instructions) {

        for (char instruction : instructions.toCharArray()) {
            if (instruction == 'D') {
                tournerDroite();
            } else if (instruction == 'G') {
                tournerGauche();
            } else if (instruction == 'A') {
                avancer();
            }
        }
    }

    private void tournerDroite() {
        switch (orientation) {
            case 'N':
                orientation = 'E';
                break;
            case 'E':
                orientation = 'S';
                break;
            case 'S':
                orientation = 'W';
                break;
            case 'W':
                orientation = 'N';
                break;
        }
    }

    private void tournerGauche() {
        switch (orientation) {
            case 'N':
                orientation = 'W';
                break;
            case 'W':
                orientation = 'S';
                break;
            case 'S':
                orientation = 'E';
                break;
            case 'E':
                orientation = 'N';
                break;
        }
    }

    private void avancer() {
        switch (orientation) {
            case 'N':
                y++;
                break;
            case 'E':
                x++;
                break;
            case 'S':
                y--;
                break;
            case 'W':
                x--;
                break;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public char getOrientation() {
        return orientation;
    }

    public static void main(String[] args) {
        int dimensionX = 10;
        int dimensionY = 10;
        int positionX = 5;
        int positionY = 5;
        char orientation = 'N';
        String instructions = "DADADADAA";

        AspirateurAutomatique aspirateur = new AspirateurAutomatique(positionX, positionY, orientation);
        aspirateur.executerInstructions(instructions);

        System.out.println("Position finale : x=" + aspirateur.getX() + " y=" + aspirateur.getY() + " orientation=" + aspirateur.getOrientation());
    }
}

