import java.util.Objects;

class Griffindor extends Hogwarts{
    private int nobility; // благородство
    private int honor; // честь
    private int bravery; // храбрость

    public Griffindor(String name, String surName,int magic, int nobility, int honor, int bravery) {
        super(magic, name, surName);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Griffindor that = (Griffindor) o;
        return nobility == that.nobility && honor == that.honor && bravery == that.bravery;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nobility, honor, bravery);
    }

    public static void print(Griffindor[] griffindors) {
        System.out.println("Учеников на факультете Пуфендуй - " + griffindors.length + " человека.");
        for (int i = 0; i < griffindors.length; i++) {
            Griffindor griffindor = griffindors[i];
            System.out.println("Имя - " + griffindor.getName() + ". Фамилия - " + griffindor.getSurName() + ". Сила магии и расстояние трансгресии - "
                    + griffindor.getMagic() + ". Благородство - " + griffindor.getNobility() + ". Честь - " +
                    griffindor.getHonor() + ". Храбрость - "
                    + griffindor.getBravery());
        }
        System.out.println("");
    }
    public static void scoringPoints(Griffindor[] griffindors) {
        for (int i = 0; i < griffindors.length; i++) {
            int summ = griffindors[i].getMagic() + griffindors[i].getNobility() + griffindors[i].getHonor() + griffindors[i].getBravery();
            System.out.println("Сумма балов у ученика " + griffindors[i].getName() + " " + griffindors[i].getSurName() + " равна - " + summ);
        }
        System.out.println("");
    }
    public static void summ(Griffindor[] griffindors) {
        int summ1 = griffindors[0].getMagic() + griffindors[0].getNobility() + griffindors[0].getHonor() + griffindors[0].getBravery();
        int summ2 = griffindors[1].getMagic() + griffindors[1].getNobility() + griffindors[1].getHonor() + griffindors[1].getBravery();
        if (summ1 > summ2) {
            System.out.println("У " + griffindors[0].getName() + " " + griffindors[0].getSurName() + " " + summ1 + " баллов. "
                    + griffindors[0].getName() + " " + griffindors[0].getSurName() + " Лучший Грифендорец на факультете.");
        } else {
            System.out.println("У " + griffindors[1].getName() + " " + griffindors[1].getSurName() + " " + summ2 + " баллов. "
                    + griffindors[1].getName() + " " + griffindors[1].getSurName() + " Лучший Грифендорец на факультете.");
        }
        System.out.println("");
    }
}
