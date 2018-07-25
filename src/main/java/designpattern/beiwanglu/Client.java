package designpattern.beiwanglu;

import org.junit.Test;

public class Client {

    @Test
    public void client() {
        RoleStateCaretaker caretaker = new RoleStateCaretaker();

        GameRoleOriginator originator = new GameRoleOriginator(100, 50, 50);
        System.out.println("角色初始状态: " + originator);

        // 保存进度
        caretaker.save(originator.save());

        System.out.println("fight boss...");
        originator.fight();
        System.out.println("阻击Boss后的状态: " + originator);

        originator.recover(caretaker.checkout());
        System.out.println("恢复后的状态: " + originator);
    }
}