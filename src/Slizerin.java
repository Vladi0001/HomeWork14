import java.util.Arrays;
import java.util.Objects;

class Slizerin extends Hogwarts {
    private int cunning; // хитрость
    private int determination; // решительность
    private int ambition; //амбициозность
    private int resourcefulness; // находчивость
    private int thirstForPower; //  жажда власти

    public Slizerin(String name, String surName, int magic, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(magic, name, surName);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Slizerin slizerin = (Slizerin) o;
        return cunning == slizerin.cunning && determination == slizerin.determination && ambition == slizerin.ambition && resourcefulness == slizerin.resourcefulness && thirstForPower == slizerin.thirstForPower;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cunning, determination, ambition, resourcefulness, thirstForPower);

    }

    public static void print(Slizerin[] slizerins) {
        System.out.println("Учеников на факультете Слизерин - " + slizerins.length + " человека.");
        for (int i = 0; i < slizerins.length; i++) {
            Slizerin slizerin = slizerins[i];
            System.out.println("Имя - " + slizerin.getName() + ". Фамилия - " + slizerin.getSurName() + ". Сила магии и расстояние трансгресии - "
                    + slizerin.getMagic() + ". Хитрость - " + slizerin.getCunning() + ". Решительность - " + slizerin.getDetermination() +
                    ". Амбициозность - " + slizerin.getAmbition() + ". Находчивость - " +
                    slizerin.getResourcefulness() + ". Жажда власти - "
                    + slizerin.getThirstForPower());
        }
        System.out.println("");

    }

    public static void scoringPoints(Slizerin[] slizerins) {
        for (int i = 0; i < slizerins.length; i++) {
            int summ = slizerins[i].getMagic() + slizerins[i].getCunning() + slizerins[i].getDetermination() +
                    slizerins[i].getAmbition() + slizerins[i].getResourcefulness() + slizerins[i].getThirstForPower();
            System.out.println("Сумма балов у ученика " + slizerins[i].getName() + " " + slizerins[i].getSurName() + " равна - " + summ);


        }
        System.out.println("");
    }

    public static void summ(Slizerin[] slizerins) {
        int summ1 = slizerins[0].getMagic() + slizerins[0].getCunning() + slizerins[0].getDetermination() +
                slizerins[0].getAmbition() + slizerins[0].getResourcefulness() + slizerins[0].getThirstForPower();
        int summ2 = slizerins[1].getMagic() + slizerins[1].getCunning() + slizerins[1].getDetermination() +
                slizerins[1].getAmbition() + slizerins[1].getResourcefulness() + slizerins[1].getThirstForPower();
        if (summ1 > summ2) {
            System.out.println("У " + slizerins[0].getName() + " " + slizerins[0].getSurName() + " " + summ1 + " баллов. "
                    + slizerins[0].getName() + " " + slizerins[0].getSurName() + " Лучший Слизеринец на факультете.");
        } else {
            System.out.println("У " + slizerins[1].getName() + " " + slizerins[1].getSurName() + " " + summ2 + " баллов. "
                    + slizerins[1].getName() + " " + slizerins[1].getSurName() + " Лучший Слизеринец на факультете.");
        }
        System.out.println("");
    }


    }




