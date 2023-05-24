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

    public static void print(Puffenduy [] puffenduys) {
        System.out.println("Учеников на факультете Пуфендуй - " + puffenduys.length + " человека.");
        for (int i = 0; i < puffenduys.length; i++) {
            Puffenduy puffenduy = puffenduys[i];
            System.out.println("Имя - " + puffenduy.getName() + ". Фамилия - " + puffenduy.getSurName() + ". Сила магии и расстояние трансгресии - "
                    + puffenduy.getMagic() + ". Трудолюбие - " + puffenduy.getDiligence() + ". Верность - " +
                    puffenduy.getLoyalty() + ". Честность - "
                    + puffenduy.getHonesty());
        }
        System.out.println("");
    }
    public static void scoringPoints(Puffenduy [] puffenduys) {
        for (int i = 0; i < puffenduys.length; i++) {
            int summ = puffenduys[i].getMagic() + puffenduys[i].getDiligence() + puffenduys[i].getLoyalty() + puffenduys[i].getHonesty();
            System.out.println("Сумма балов у ученика " + puffenduys[i].getName() + " " + puffenduys[i].getSurName() + " равна - " + summ);
        }
        System.out.println("");
    }
    public static void summ(Puffenduy [] puffenduys) {
        int summ1 = puffenduys[0].getMagic() + puffenduys[0].getDiligence() + puffenduys[0].getLoyalty() + puffenduys[0].getHonesty();
        int summ2 = puffenduys[1].getMagic() + puffenduys[1].getDiligence() + puffenduys[1].getLoyalty() + puffenduys[1].getHonesty();
        if (summ1 > summ2) {
            System.out.println("У " + puffenduys[0].getName() + " " + puffenduys[0].getSurName() + " " + summ1 + " баллов. "
                    + puffenduys[0].getName() + " " + puffenduys[0].getSurName() + " Лучший Пуфендуец на факультете.");
        } else {
            System.out.println("У " + puffenduys[1].getName() + " " + puffenduys[1].getSurName() + " " + summ2 + " баллов. "
                    + puffenduys[1].getName() + " " + puffenduys[1].getSurName() + " Лучший Пуфендуец на факультете.");
        }
        System.out.println("");
    }
}
