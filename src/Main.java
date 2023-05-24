public class Main {
    public static void main(String[] args) {
        Griffindor[] griffindors = {
            new Griffindor("Гарри","Поттер", 46,57,68, 39),
                new Griffindor("Гермиона","Грейнджер", 34,78,54, 73),
                new Griffindor("Рон","Уизли", 23,31,58, 17),
        };

        Puffenduy [] puffenduys = {
                new Puffenduy ("Захария","Смит", 15,23,64, 76),
                new Puffenduy ("Седрик","Диггори", 11,37,57, 12),
                new Puffenduy ("Джастин","Финч-Флетчли", 9,29,17, 57),
        };

        Cogtevran [] cogtevrans = {
                new Cogtevran ("Чжоу","Чанг", 14,67,34, 22, 38),
                new Cogtevran ("Падма","Патил", 17,57,87, 13, 65),
                new Cogtevran ("Маркус","Белби", 4,67,33, 21, 50),
        };

        Slizerin [] slizerins = {
                new Slizerin ("Драко","Малфой", 45,33,45, 57, 34, 56),
                new Slizerin ("Грэхэм","Монтегю", 37,46,73, 43, 22, 34),
                new Slizerin ("Грегори","Гойл", 25,26,26, 57, 56, 64),
        };
        Slizerin.print(slizerins);
        Slizerin.scoringPoints(slizerins);
        Slizerin.summ(slizerins);
        Griffindor.print(griffindors);
        Griffindor.scoringPoints(griffindors);
        Griffindor.summ(griffindors);
        Puffenduy.print(puffenduys);
        Puffenduy.scoringPoints(puffenduys);
        Puffenduy.summ(puffenduys);
        Cogtevran.print(cogtevrans);
        Cogtevran.scoringPoints(cogtevrans);
        Cogtevran.summ(cogtevrans);
        Hogwarts.summ(cogtevrans, griffindors, puffenduys, slizerins);


    }
}