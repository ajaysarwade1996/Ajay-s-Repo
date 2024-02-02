public class MethodExample {

    public static void main(String[] args){

      MethodExample obj = new MethodExample();
      obj.playMusic();
      String str = obj.playGames(88000);
        System.out.println(str);

    }

        public void playMusic()
        {
            System.out.println("Music is playing...");
        }

        public String playGames(int price)

        {

                return "Games";

        }

}
