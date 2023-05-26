public class Main {
    public static void main(String[] args) {

        // Факультет Гриффиндор
        Griffindor harri = new Griffindor("Гарри","Поттер", 46,57,68, 39);
        Griffindor germiona = new Griffindor("Гермиона","Грейнджер", 34,78,54, 73);
        Griffindor ron = new Griffindor("Рон","Уизли", 23,31,58, 17);

        // Факультет Пуфендуй
        Puffenduy smit = new Puffenduy ("Захария","Смит", 15,23,64, 76);
            Puffenduy Diggori =  new Puffenduy ("Седрик","Диггори", 11,37,57, 12);
                Puffenduy Finch = new Puffenduy ("Джастин","Финч-Флетчли", 9,29,17, 57);

                        // Факультет Когтевран
        Cogtevran chang = new Cogtevran ("Чжоу","Чанг", 14,67,34, 22, 38);
        Cogtevran patil = new Cogtevran ("Падма","Патил", 17,57,87, 13, 65);
        Cogtevran belbi = new Cogtevran ("Маркус","Белби", 4,67,33, 21, 50);


                        // Факультет Слизерин
        Slizerin  malfoy =  new Slizerin ("Драко","Малфой", 45,33,45, 57, 34, 56);
                Slizerin monteg =  new Slizerin ("Грэхэм","Монтегю", 37,46,73, 43, 22, 34);
                Slizerin goyl = new Slizerin ("Грегори","Гойл", 25,26,26, 57, 56, 64);

        Slizerin.print(malfoy,monteg, goyl);
        Slizerin.scoringPoints(malfoy,monteg, goyl);
        Slizerin.summ(malfoy,monteg);
        Griffindor.print(germiona, harri, ron);
        Griffindor.scoringPoints(germiona, harri, ron);
        Griffindor.summ(germiona, harri);
        Puffenduy.print(smit, Diggori, Finch);
        Puffenduy.scoringPoints(smit, Diggori, Finch);
        Puffenduy.summ(smit, Diggori);
        Cogtevran.print(chang, patil, belbi);
        Cogtevran.scoringPoints(chang, patil, belbi);
        Cogtevran.summ(chang, patil);
        Hogwarts.summ(harri, malfoy);


    }
}