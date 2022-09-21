class ClearScreen {
    static void cls() {
        try {
          new ProcessBuilder("clear","cmd","cls","/c").inheritIO().start().waitFor();
        } catch (Exception E) {
          E.printStackTrace();
        }
      }
}
