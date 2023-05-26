import java.util.Objects;

class Puffenduy extends Hogwarts{
    private int diligence; // трудолюбие
    private int loyalty; // верность
    private int honesty; // честность

    public Puffenduy(String name, String surName,int magic, int diligence, int loyalty, int honesty) {
        super(magic, name, surName);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Puffenduy puffenduy = (Puffenduy) o;
        return diligence == puffenduy.diligence && loyalty == puffenduy.loyalty && honesty == puffenduy.honesty;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), diligence, loyalty, honesty);
    }

    public static void print(Puffenduy smit, Puffenduy Diggori, Puffenduy Finch) {
        System.out.println("Факультет Пуффендуй");
            System.out.println("Имя - " + smit.getName() + ". Фамилия - " + smit.getSurName() + ". Сила магии и расстояние трансгресии - "
                    + smit.getMagic() + ". Трудолюбие - " + smit.getDiligence() + ". Верность - " +
                    smit.getLoyalty() + ". Честность - "
                    + smit.getHonesty());

        System.out.println("Имя - " + Diggori.getName() + ". Фамилия - " + Diggori.getSurName() + ". Сила магии и расстояние трансгресии - "
                + Diggori.getMagic() + ". Трудолюбие - " + Diggori.getDiligence() + ". Верность - " +
                Diggori.getLoyalty() + ". Честность - "
                + Diggori.getHonesty());

        System.out.println("Имя - " + Finch.getName() + ". Фамилия - " + Finch.getSurName() + ". Сила магии и расстояние трансгресии - "
                + Finch.getMagic() + ". Трудолюбие - " + Finch.getDiligence() + ". Верность - " +
                Finch.getLoyalty() + ". Честность - "
                + Finch.getHonesty());

        System.out.println("");
    }
    public static void scoringPoints(Puffenduy smit, Puffenduy Diggori, Puffenduy Finch) {

            int summ = smit.getMagic() + smit.getDiligence() + smit.getLoyalty() + smit.getHonesty();
            System.out.println("Сумма балов у ученика " + smit.getName() + " " + smit.getSurName() + " равна - " + summ);

        int summ2 = Diggori.getMagic() + Diggori.getDiligence() + Diggori.getLoyalty() + Diggori.getHonesty();
        System.out.println("Сумма балов у ученика " + Diggori.getName() + " " + Diggori.getSurName() + " равна - " + summ2);

        int summ3 = Finch.getMagic() + Finch.getDiligence() + Finch.getLoyalty() + Finch.getHonesty();
        System.out.println("Сумма балов у ученика " + Finch.getName() + " " + Finch.getSurName() + " равна - " + summ3);

        System.out.println("");
    }
    public static void summ(Puffenduy smit, Puffenduy Diggori) {
        int summSmit = smit.getMagic() + smit.getDiligence() + smit.getLoyalty() + smit.getHonesty();
        int summDiggori = Diggori.getMagic() + Diggori.getDiligence() + Diggori.getLoyalty() + Diggori.getHonesty();
        if (summSmit > summDiggori) {
            System.out.println("У " + smit.getName() + " " + smit.getSurName() + " " + summSmit + " баллов. "
                    + smit.getName() + " " + smit.getSurName() + " Лучший Пуфендуец на факультете.");
        } else {
            System.out.println("У " + Diggori.getName() + " " + Diggori.getSurName() + " " + summDiggori + " баллов. "
                    + Diggori.getName() + " " + Diggori.getSurName() + " Лучший Пуфендуец на факультете.");
        }
        System.out.println("");
    }
}
