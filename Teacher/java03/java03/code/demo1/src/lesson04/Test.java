package lesson04;

import java.util.Random;

/**
 * 作者: jack
 * 时间: 2021-04-16 0016 13:36
 * 描述: Test
 */
public class Test {
    public static void main(String[] args) {
//        Utils utils = new Utils();
//        double[] vals = {10, 30};
//        double val = utils.getValue(vals);
//        System.out.println(val);


//        boolean flag = utils.isDo(0.5);
//        System.out.println(flag);

        Kill k1 = new Kill();
        k1.name = "攻杀剑法";
        k1.probability = 0.5;
        k1.harms = new double[2];
        k1.harms[0] = 1.3;
        k1.harms[1] = 1.5;

        Kill k2 = new Kill();
        k2.name = "刺杀剑法";
        k2.probability = 0.4;
        k2.harms = new double[2];
        k2.harms[0] = 1;
        k2.harms[1] = 1;
        k2.kill = "破防";

        Kill k3 = new Kill();
        k3.name = "烈火剑法";
        k3.probability = 0.3;
        k3.harms = new double[2];
        k3.harms[0] = 3.0;
        k3.harms[1] = 3.0;

        Kill[] kills = {k1, k2, k3};

        // 测试普通攻击
        Player a = new Player();
        a.name = "关羽";
        a.kills = kills;

        Player b = new Player();
        b.name = "张飞";
        b.kills = kills;


        Fighting fighting = new Fighting();

        fighting.playerA = a;
        fighting.playerB = b;

//        double val1 = fighting.baseAttack(0);
//        System.out.println(val1);
//        double val2 = fighting.baseAttack(0);
//        System.out.println(val2);

//        double val = fighting.killAttack(a, b, a.kills[2]);
//        System.out.println(val);

        fighting.fight();

    }

}
