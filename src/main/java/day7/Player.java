package day7;

public class Player {

    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static final int PLACES = 6;

    private static int countPlayers;

    public Player() {
        if (countPlayers < 6) {
            countPlayers++;
        } else if (countPlayers > 6) {
            countPlayers--;
        }
    }

    public Player(int stamina) {
        if (countPlayers < 6) {
            countPlayers++;
        } else if (countPlayers > 6) {
            countPlayers--;
        }
        this.stamina = stamina;
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run () {

        if (this.stamina > 0 && this.stamina - 1 <= 0) {
            countPlayers--;
        }
        if (this.stamina > 0){
            this.stamina--;
        }
    }

    public static String setEndingPlaces(int countPlayers) {

        String ending = "";
        if (PLACES - countPlayers == 0 || PLACES - countPlayers >= 5 && PLACES - countPlayers <= 9) {
            ending = "";
        } else if (PLACES - countPlayers >= 2 && PLACES - countPlayers <= 4) {
            ending = "а";
        } else if (PLACES - countPlayers == 1) {
            ending = "о";
        }
        return ending;
    }

    public static String setEndingFree(int countPlayers) {

        String ending;
        if (PLACES - countPlayers == 1) {
            ending = "оe";
        } else {
            ending = "ых";
        }
        return ending;
    }

    public static void info() {

        int numFreePlaces = PLACES - countPlayers;
        String endingPlaces = Player.setEndingPlaces(countPlayers);
        String endingFree = Player.setEndingFree(countPlayers);

        if (countPlayers == 6) {
            System.out.println("На поле нет свободных мест");
        } else if (countPlayers < 6) {
            System.out.printf("Команды неполные. На поле еще есть %d свободн%s мест%s\n",
                    numFreePlaces, endingFree, endingPlaces);
        }
    }
}
