/*
concrete builder
 */
public class McDonaldsBuilder implements Builder {
    private McDonaldsBurger mcDonaldsBurger;
    @Override
    public void buildBurger() {mcDonaldsBurger = new McDonaldsBurger();}

    @Override
    public void buildSalaatti() {
        mcDonaldsBurger.addSalaatti("mäkkärin salaatti, ");
    }

    @Override
    public void buildJuusto() {
        mcDonaldsBurger.addJuusto("mäkkärin juusto, ");
    }

    @Override
    public void buildPihvi() {
        mcDonaldsBurger.addPihvi("mäkkärin pihvi, ");
    }

    @Override
    public void buildKastike() {
        mcDonaldsBurger.addPihvi("mäkkärin kastike, ");
    }

    @Override
    public void buildTomaatti() {
        mcDonaldsBurger.addTomaatti("mäkkärin tomaatti, ");
    }

    @Override
    public McDonaldsBurger getBurger() {
        return mcDonaldsBurger;
    }
}
