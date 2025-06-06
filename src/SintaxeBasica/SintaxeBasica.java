package SintaxeBasica;

public class SintaxeBasica {
    public static void main(String[] args) {

        //Ninja 1
        String nameNinja1 = "Naruto";
        String nameMission1 = "Derrotar o Obito";
        boolean statusMissionNinja1 = false;
        int ageNinja1 = 15;
        char difficultyNinja1 = 'A';


        System.out.println("Nome do Ninja: " + nameNinja1);
        System.out.println("Idade: " + ageNinja1);
        System.out.println("Missão: " + nameMission1);
        System.out.println("Dificuldade: " + difficultyNinja1);


        if(ageNinja1 >= 15){
            System.out.println("Parabéns " + nameNinja1 + ". Missão concluída!");
        } else if (difficultyNinja1 == 'C' && difficultyNinja1 == 'D') {
            System.out.println("Parabéns " + nameNinja1 + ". Missão concluída!");
        } else {
            System.out.println("Você não pode realizar está missão.");
        }

        System.out.println("---------------------------------------------------");
        //Ninja 2
        String nameNinja2 = "Sasuke";
        String nameMission2 = "Derrotar o Orochimaru";
        boolean statusMissionNinja2 = true;
        int ageNinja2 = 16;
        char difficultyNinja2 = 'A';

        System.out.println("Nome do Ninja: " + nameNinja2);
        System.out.println("Idade: " + ageNinja2);
        System.out.println("Missão: " + nameMission2);
        System.out.println("Dificuldade: " + difficultyNinja2);


        if(ageNinja2 >= 15){
            System.out.println("Parabéns " + nameNinja2 + ". Missão concluída!");
        } else if (difficultyNinja2 == 'C' && difficultyNinja2 == 'D') {
            System.out.println("Parabéns " + nameNinja2 + ". Missão concluída!");
        } else {
            System.out.println("Você não pode realizar está missão.");
        }

        System.out.println("---------------------------------------------------");
        //Ninja 3
        String nameNinja3 = "Kakashi";
        String nameMission3 = "Derrotar o Madara";
        boolean statusMissionNinja3 = false;
        int ageNinja3 = 25;
        char difficultyNinja3 = 'S';

        System.out.println("Nome do Ninja: " + nameNinja3);
        System.out.println("Idade: " + ageNinja3);
        System.out.println("Missão: " + nameMission3);
        System.out.println("Dificuldade: " + difficultyNinja3);


        if(ageNinja3 >= 15){
            System.out.println("Parabéns " + nameNinja3 + ". Missão concluída!");
        } else if (difficultyNinja3 == 'C' && difficultyNinja3 == 'D') {
            System.out.println("Parabéns " + nameNinja3 + ". Missão concluída!");
        } else {
            System.out.println("Você não pode realizar está missão.");
        }

    }
}
