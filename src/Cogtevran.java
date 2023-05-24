import java.util.Objects;

class Cogtevran extends Hogwarts{
    private int mind; // УМ
    private int wisdom; // мудрость
    private int wit; // остроумие
    private int creativeApproach; // творческий подход

    public Cogtevran(String name, String surName,int magic, int mind, int wisdom, int wit, int creativeApproach) {
        super(magic, name, surName);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativeApproach = creativeApproach;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativeApproach() {
        return creativeApproach;
    }

    public void setCreativeApproach(int creativeApproach) {
        this.creativeApproach = creativeApproach;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cogtevran cogtevran = (Cogtevran) o;
        return mind == cogtevran.mind && wisdom == cogtevran.wisdom && wit == cogtevran.wit && creativeApproach == cogtevran.creativeApproach;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), mind, wisdom, wit, creativeApproach);
    }

    public static void print(Cogtevran [] cogtevrans) {
        System.out.println("Учеников на факультете Когтевран - " + cogtevrans.length + " человека.");
        for (int i = 0; i < cogtevrans.length; i++) {
            Cogtevran cogtevran = cogtevrans[i];
            System.out.println("Имя - " + cogtevran.getName() + ". Фамилия - " + cogtevran.getSurName() + ". Сила магии и расстояние трансгресии - "
                    + cogtevran.getMagic() + ". Ум - " + cogtevran.getMind() + ". Мудрость - " +
                    cogtevran.getWisdom() + ". Остроумие - "
                    + cogtevran.getWit() + ". Творческий подход - " + cogtevran.getCreativeApproach());
        }
        System.out.println("");
    }
    public static void scoringPoints(Cogtevran [] cogtevrans) {
        for (int i = 0; i < cogtevrans.length; i++) {
            int summ = cogtevrans[i].getMagic() + cogtevrans[i].getMind() + cogtevrans[i].getWisdom() + cogtevrans[i].getWit()
                    + cogtevrans[i].getCreativeApproach();
            System.out.println("Сумма балов у ученика " + cogtevrans[i].getName() + " " + cogtevrans[i].getSurName() + " равна - " + summ);
        }
        System.out.println("");
    }
    public static void summ(Cogtevran [] cogtevrans) {
        int summ1 = cogtevrans[0].getMagic() + cogtevrans[0].getMind() + cogtevrans[0].getWisdom() + cogtevrans[0].getWit()
                + cogtevrans[0].getCreativeApproach();
        int summ2 = cogtevrans[1].getMagic() + cogtevrans[1].getMind() + cogtevrans[1].getWisdom() + cogtevrans[1].getWit()
                + cogtevrans[1].getCreativeApproach();
        if (summ1 > summ2) {
            System.out.println("У " + cogtevrans[0].getName() + " " + cogtevrans[0].getSurName() + " " + summ1 + " баллов. "
                    + cogtevrans[0].getName() + " " + cogtevrans[0].getSurName() + " Лучший Когтевранец на факультете.");
        } else {
            System.out.println("У " + cogtevrans[1].getName() + " " + cogtevrans[1].getSurName() + " " + summ2 + " баллов. "
                    + cogtevrans[1].getName() + " " + cogtevrans[1].getSurName() + " Лучший Когтевранец на факультете.");
        }
        System.out.println("");
    }
}
