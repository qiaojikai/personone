package designpattern.beiwanglu;

public class GameRoleOriginator {

    private int vit;    // 生命值
    private int atk;    // 攻击力
    private int def;    // 防御力

    public GameRoleOriginator(int vit, int atk, int def) {
        this.vit = vit;
        this.atk = atk;
        this.def = def;
    }

    public void fight() {
        vit -= 10;
        atk -= 8;
        def += 10;
    }

    public RoleStateMemento save() {
        return new RoleStateMemento(vit, atk, def);
    }

    public void recover(RoleStateMemento memento) {
        this.setVit(memento.getVit());
        this.setAtk(memento.getAtk());
        this.setDef(memento.getDef());
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    @Override
    public String toString() {
        return "GameRoleOriginator{" +
                "vit=" + vit +
                ", atk=" + atk +
                ", def=" + def +
                '}';
    }
}