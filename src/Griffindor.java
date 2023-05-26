import java.util.Objects;

class Griffindor extends Hogwarts {
    private int nobility; // благородство
    private int honor; // честь
    private int bravery; // храбрость

    public Griffindor(String name, String surName, int magic, int nobility, int honor, int bravery) {
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

    public static void print(Griffindor germiona, Griffindor harri, Griffindor ron) {
        System.out.println("Факультет Гриффиндор");

        System.out.println("Имя - " + harri.getName() + ". Фамилия - " + harri.getSurName() + ". Сила магии и расстояние трансгресии - "
                    + harri.getMagic() + ". Благородство - " + harri.getNobility() + ". Честь - " +
                    harri.getHonor() + ". Храбрость - "
                    + harri.getBravery());

        System.out.println("Имя - " + germiona.getName() + ". Фамилия - " + germiona.getSurName() + ". Сила магии и расстояние трансгресии - "
                + germiona.getMagic() + ". Благородство - " + germiona.getNobility() + ". Честь - " +
                germiona.getHonor() + ". Храбрость - "
                + germiona.getBravery());

        System.out.println("Имя - " + ron.getName() + ". Фамилия - " + ron.getSurName() + ". Сила магии и расстояние трансгресии - "
                + ron.getMagic() + ". Благородство - " + ron.getNobility() + ". Честь - " +
                ron.getHonor() + ". Храбрость - "
                + ron.getBravery());

        System.out.println("");
    }

    public static void scoringPoints(Griffindor germiona, Griffindor harri, Griffindor ron) {

            int harriSumm = harri.getMagic() + harri.getNobility() + harri.getHonor() + harri.getBravery();
            System.out.println("Сумма балов у ученика " + harri.getName() + " " + harri.getSurName() + " равна - " + harriSumm);

        int germionaSumm = germiona.getMagic() + germiona.getNobility() + germiona.getHonor() + germiona.getBravery();
        System.out.println("Сумма балов у ученика " + germiona.getName() + " " + germiona.getSurName() + " равна - " + germionaSumm);

        int ronSumm = ron.getMagic() + ron.getNobility() + ron.getHonor() + ron.getBravery();
        System.out.println("Сумма балов у ученика " + ron.getName() + " " + ron.getSurName() + " равна - " + ronSumm);

        System.out.println("");
    }

    public static void summ(Griffindor germiona, Griffindor harri) {
        int summHarri = harri.getMagic() + harri.getNobility() + harri.getHonor() + harri.getBravery();
        int summGermiona = germiona.getMagic() + germiona.getNobility() + germiona.getHonor() + germiona.getBravery();
        if (summHarri > summGermiona) {
            System.out.println("У " + harri.getName() + " " + harri.getSurName() + " " + summHarri + " баллов. "
                    + harri.getName() + " " + harri.getSurName() + " Лучший Грифендорец на факультете.");
        } else {
            System.out.println("У " + germiona.getName() + " " + germiona.getSurName() + " " + summGermiona + " баллов. "
                    + germiona.getName() + " " + germiona.getSurName() + " Лучший Грифендорец на факультете.");
        }
        System.out.println("");

    }
}
