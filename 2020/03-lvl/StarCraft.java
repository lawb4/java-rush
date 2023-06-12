package lvl3;

/*
Привет StarCraft!
*/

public class StarCraft {
    public static void main(String[] args) {


        Zerg zerg1 = new Zerg();
        zerg1.name = "Vasya";
        Zerg zerg2 = new Zerg();
        zerg2.name = "Egor";
        Zerg zerg3 = new Zerg();
        zerg3.name = "Andrei";
        Zerg zerg4 = new Zerg();
        zerg4.name = "Alex";
        Zerg zerg5 = new Zerg();
        zerg5.name = "Vika";

        Protoss pr1 = new Protoss();
        pr1.name = "Kiril";
        Protoss pr2 = new Protoss();
        pr2.name = "Antoxa";
        Protoss pr3 = new Protoss();
        pr3.name = "Batya";

        Terran t1 = new Terran();
        t1.name = "Bodya";
        Terran t2 = new Terran();
        t2.name = "Zarya";
        Terran t3 = new Terran();
        t3.name = "Augustin";
        Terran t4 = new Terran();
        t4.name = "Jake";

        System.out.println(zerg1.name + ", " + pr1.name + ", " + t1.name);
    }

    public static class Zerg {
        public String name;   // в мейне мы обращаемся сюда, к нейму
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}