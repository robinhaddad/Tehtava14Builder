/*
director
 */
public class Director {
    private Builder builder;

    public void setBuilder(Builder b){builder = b;}

    public void constructBurger(){
        builder.buildBurger();
        builder.buildSalaatti();
        builder.buildJuusto();
        builder.buildPihvi();
        builder.buildKastike();
        builder.buildTomaatti();
    }
}
