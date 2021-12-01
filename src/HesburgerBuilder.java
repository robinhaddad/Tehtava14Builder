
/*
  concrete builder
 */
public class HesburgerBuilder implements Builder {

    private HesburgerBurger hesburgerBurger;

    @Override
    public void buildBurger() {hesburgerBurger = new HesburgerBurger();}

    @Override
    public void buildSalaatti() {hesburgerBurger.addSalaatti(new HesburgerSalaatti());}

    @Override
    public void buildJuusto() {hesburgerBurger.addJuusto(new HesburgerJuusto());}

    @Override
    public void buildPihvi() {hesburgerBurger.addPihvi(new HesburgerPihvi());}

    @Override
    public void buildKastike() {hesburgerBurger.addKastike(new HesburgerKastike());}

    @Override
    public void buildTomaatti() {hesburgerBurger.addTomaatti(new HesburgerTomaatti());}

    @Override
    public HesburgerBurger getBurger() {return hesburgerBurger;}
}
