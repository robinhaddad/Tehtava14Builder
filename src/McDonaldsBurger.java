/*
product
 */
public class McDonaldsBurger {
    private StringBuilder stringBuilder;
    public McDonaldsBurger(){
        this.stringBuilder = new StringBuilder();
    }

    public void addSalaatti(String s){
        this.stringBuilder.append(s);
    }

    public void addJuusto(String s) {
        this.stringBuilder.append(s);
    }

    public void addPihvi(String s) {
        this.stringBuilder.append(s);
    }

    public void addTomaatti(String s) {
        this.stringBuilder.append(s);
    }

    @Override
    public String toString() {
        return "hampurilainen sisältää: "+stringBuilder;
    }
}
