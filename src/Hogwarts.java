import java.util.Objects;

public class Hogwarts {
    private String name; // Имя
    private  String surName; // Фамилия
    private int magic; // Сила магии и расстояние трансгресии


    public Hogwarts(int magic, String name, String surName) {
        this.magic = magic;
        this.name = name;
        this.surName = surName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hogwarts hogwarts = (Hogwarts) o;
        return magic == hogwarts.magic && Objects.equals(name, hogwarts.name) && Objects.equals(surName, hogwarts.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName, magic);
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public static void summ(Cogtevran [] cogtevrans, Griffindor [] griffindors, Puffenduy [] puffenduys, Slizerin [] slizerins) {
        int summ1 = griffindors[0].getMagic();
        int summ2 = slizerins[1].getMagic();
        if (summ1 > summ2) {

            System.out.println(griffindors[0].getName() + " " + griffindors[0].getSurName() + " лучший ученик в Хогвартсе. У него " + summ1 + " баллов" +
                    " по силе магии и расстоянию трансгрессии. ");
        } else {
            System.out.println(slizerins[1].getName() + " " + slizerins[1].getSurName() + " лучший ученик в Хогвартсе. У него " + summ2 + " баллов" +
                    " по силе магии и расстоянию трансгрессии. ");

        }
        System.out.println("");
    }
}
