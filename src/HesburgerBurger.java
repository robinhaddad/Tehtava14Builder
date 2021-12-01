import java.util.ArrayList;
/*
product
 */
public class HesburgerBurger {

    private ArrayList<Object> objectList;

    public HesburgerBurger(){
        this.objectList = new ArrayList<>();
    }

    public void addSalaatti(HesburgerSalaatti hesburgerSalaatti){
        this.objectList.add(hesburgerSalaatti);
    }

    public void addJuusto(HesburgerJuusto hesburgerJuusto) {
        this.objectList.add(hesburgerJuusto);
    }

    public void addPihvi(HesburgerPihvi hesburgerPihvi) {
        this.objectList.add(hesburgerPihvi);
    }

    public void addKastike(HesburgerKastike hesburgerKastike) {
        this.objectList.add(hesburgerKastike);
    }

    public void addTomaatti(HesburgerTomaatti hesburgerTomaatti) {
        this.objectList.add(hesburgerTomaatti);
    }

    @Override
    public String toString() {
        return "hampurilainen sisältää:" + objectList;
    }
}
