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

    public static void print(Slizerin malfoy, Slizerin monteg, Slizerin goyl) {
        System.out.println("Факультет Слизерин");
            System.out.println("Имя - " + malfoy.getName() + ". Фамилия - " + malfoy.getSurName() + ". Сила магии и расстояние трансгресии - "
                    + malfoy.getMagic() + ". Хитрость - " + malfoy.getCunning() + ". Решительность - " + malfoy.getDetermination() +
                    ". Амбициозность - " + malfoy.getAmbition() + ". Находчивость - " +
                    malfoy.getResourcefulness() + ". Жажда власти - "
                    + malfoy.getThirstForPower());

        System.out.println("Имя - " + monteg.getName() + ". Фамилия - " + monteg.getSurName() + ". Сила магии и расстояние трансгресии - "
                + monteg.getMagic() + ". Хитрость - " + monteg.getCunning() + ". Решительность - " + monteg.getDetermination() +
                ". Амбициозность - " + monteg.getAmbition() + ". Находчивость - " +
                monteg.getResourcefulness() + ". Жажда власти - "
                + monteg.getThirstForPower());

        System.out.println("Имя - " + goyl.getName() + ". Фамилия - " + goyl.getSurName() + ". Сила магии и расстояние трансгресии - "
                + goyl.getMagic() + ". Хитрость - " + goyl.getCunning() + ". Решительность - " + goyl.getDetermination() +
                ". Амбициозность - " + goyl.getAmbition() + ". Находчивость - " +
                goyl.getResourcefulness() + ". Жажда власти - "
                + goyl.getThirstForPower());

        System.out.println("");

    }

    public static void scoringPoints(Slizerin malfoy, Slizerin monteg, Slizerin goyl) {

            int summ = malfoy.getMagic() + malfoy.getCunning() + malfoy.getDetermination() +
                    malfoy.getAmbition() + malfoy.getResourcefulness() + malfoy.getThirstForPower();
            System.out.println("Сумма балов у ученика " + malfoy.getName() + " " + malfoy.getSurName() + " равна - " + summ);

        int summ1 = monteg.getMagic() + monteg.getCunning() + monteg.getDetermination() +
                monteg.getAmbition() + monteg.getResourcefulness() + monteg.getThirstForPower();
        System.out.println("Сумма балов у ученика " + monteg.getName() + " " + monteg.getSurName() + " равна - " + summ1);

        int summ2 = goyl.getMagic() + goyl.getCunning() + goyl.getDetermination() +
                goyl.getAmbition() + goyl.getResourcefulness() + goyl.getThirstForPower();
        System.out.println("Сумма балов у ученика " + goyl.getName() + " " + goyl.getSurName() + " равна - " + summ2);



        System.out.println("");
    }

    public static void summ(Slizerin malfoy, Slizerin monteg) {
        int summMalfoy = malfoy.getMagic() + malfoy.getCunning() + malfoy.getDetermination() +
                malfoy.getAmbition() + malfoy.getResourcefulness() + malfoy.getThirstForPower();
        int summMonteg = monteg.getMagic() + monteg.getCunning() + monteg.getDetermination() +
                monteg.getAmbition() + monteg.getResourcefulness() + monteg.getThirstForPower();
        if (summMalfoy > summMonteg) {
            System.out.println("У " + malfoy.getName() + " " + malfoy.getSurName() + " " + summMalfoy + " баллов. "
                    + malfoy.getName() + " " + malfoy.getSurName() + " Лучший Слизеринец на факультете.");
        } else {
            System.out.println("У " + monteg.getName() + " " + monteg.getSurName() + " " + summMonteg + " баллов. "
                    + monteg.getName() + " " + monteg.getSurName() + " Лучший Слизеринец на факультете.");
        }
        System.out.println("");
    }


    }




