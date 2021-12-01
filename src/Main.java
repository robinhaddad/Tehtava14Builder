public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        McDonaldsBuilder mcDonaldsBuilder = new McDonaldsBuilder();

        director.setBuilder(mcDonaldsBuilder);
        director.constructBurger();

        McDonaldsBurger mcDonalds = mcDonaldsBuilder.getBurger();

        System.out.println(mcDonalds);

        HesburgerBuilder hesburgerBuilder = new HesburgerBuilder();

        director.setBuilder(hesburgerBuilder);
        director.constructBurger();

        HesburgerBurger hesburgerBurger = hesburgerBuilder.getBurger();

        System.out.println(hesburgerBurger);
    }
}
