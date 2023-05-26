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

    public static void print(Cogtevran chang, Cogtevran patil, Cogtevran belbi) {
        System.out.println("Факультет Когтевран");
            System.out.println("Имя - " + chang.getName() + ". Фамилия - " + chang.getSurName() + ". Сила магии и расстояние трансгресии - "
                    + chang.getMagic() + ". Ум - " + chang.getMind() + ". Мудрость - " +
                    chang.getWisdom() + ". Остроумие - "
                    + chang.getWit() + ". Творческий подход - " + chang.getCreativeApproach());

        System.out.println("Имя - " + patil.getName() + ". Фамилия - " + patil.getSurName() + ". Сила магии и расстояние трансгресии - "
                + patil.getMagic() + ". Ум - " + patil.getMind() + ". Мудрость - " +
                patil.getWisdom() + ". Остроумие - "
                + patil.getWit() + ". Творческий подход - " + patil.getCreativeApproach());

        System.out.println("Имя - " + belbi.getName() + ". Фамилия - " + belbi.getSurName() + ". Сила магии и расстояние трансгресии - "
                + belbi.getMagic() + ". Ум - " + belbi.getMind() + ". Мудрость - " +
                belbi.getWisdom() + ". Остроумие - "
                + belbi.getWit() + ". Творческий подход - " + belbi.getCreativeApproach());

        System.out.println("");
    }
    public static void scoringPoints(Cogtevran chang, Cogtevran patil, Cogtevran belbi) {

            int summ = chang.getMagic() + chang.getMind() + chang.getWisdom() + chang.getWit()
                    + chang.getCreativeApproach();
            System.out.println("Сумма балов у ученика " + chang.getName() + " " + chang.getSurName() + " равна - " + summ);

        int summ2 = patil.getMagic() + patil.getMind() + patil.getWisdom() + patil.getWit()
                + patil.getCreativeApproach();
        System.out.println("Сумма балов у ученика " + patil.getName() + " " + patil.getSurName() + " равна - " + summ2);

        int summ3 = belbi.getMagic() + belbi.getMind() + belbi.getWisdom() + belbi.getWit()
                + belbi.getCreativeApproach();
        System.out.println("Сумма балов у ученика " + belbi.getName() + " " + belbi.getSurName() + " равна - " + summ3);

        System.out.println("");
    }
    public static void summ(Cogtevran chang, Cogtevran patil) {
        int summChang = chang.getMagic() + chang.getMind() + chang.getWisdom() + chang.getWit()
                + chang.getCreativeApproach();
        int summPatil = patil.getMagic() + patil.getMind() + patil.getWisdom() + patil.getWit()
                + patil.getCreativeApproach();
        if (summChang > summPatil) {
            System.out.println("У " + chang.getName() + " " + chang.getSurName() + " " + summChang + " баллов. "
                    + chang.getName() + " " + chang.getSurName() + " Лучший Когтевранец на факультете.");
        } else {
            System.out.println("У " + patil.getName() + " " + patil.getSurName() + " " + summPatil + " баллов. "
                    + patil.getName() + " " + patil.getSurName() + " Лучший Когтевранец на факультете.");
        }
        System.out.println("");
    }
}
