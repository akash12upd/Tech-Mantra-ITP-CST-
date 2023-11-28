import java.util.*;
class Quiz_Management{
    public static void main(String args[])
    {
        String answer1="";
        String answer2="";
        String answer3="";
        String answer4="";
        String answer5="";
        String opinion;


        Scanner in=new Scanner(System.in);
        int answerCorrect=0;
        int questions=10;
        System.out.println("\nWhat is the capital of Jharkhand ?");
        System.out.println("a. Ranchi");
        System.out.println("b. Mumbai");
        System.out.println("c. Bihar");
        System.out.println("d. Patna");

        System.out.println("\nWhat's your Stake ?\t");
        answer1=in.nextLine();

        if(answer1.equals("a"))
        {
            System.out.println("\nThat's correct !!");
            answerCorrect++;
        }
        else
        {
            System.out.println("\nThat's Wrong mate !! The right answer would be : a");
        }
        System.out.println("\nDo You want to Continue ? ");
        opinion=in.nextLine();

        if(opinion.equals("yes"))
        {
            System.out.println("\nWho is the current Chief Minister of Jharkhand ?");
        System.out.println("a. Narendra Modi");
        System.out.println("b. Rahul Gandhi");
        System.out.println("c. Hemant Soren");
        System.out.println("d. Nitish Kumar ");

        System.out.println("\nWhat's your Stake ?\t");
        answer2=in.nextLine();

        if(answer2.equals("c"))
        {
            System.out.println("\nThat's correct !!");
            answerCorrect++;
        }
        else
        {
            System.out.println("\nThat's Wrong mate !! The right answer would be : c");
        }



        }
        
        else{
            System.out.println("\nYour Total Score is :\t"+answerCorrect);
        }

        System.out.println("\nDo you want to continue ? ");
        opinion=in.nextLine();

        if(opinion.equals("yes"))
        {
            System.out.println("\nWhat is the name of the portal launched with the aim of employeement for Jharkhand ?");
        System.out.println("a. Jharkhand Darbar");
        System.out.println("b. Jharkhand Rojgar");
        System.out.println("c. Jharkhand Employeement");
        System.out.println("d. Jharkhand Coorperation");

        System.out.println("\nWhat's your Stake ?\t");
        answer3=in.nextLine();

        if(answer3.equals("b"))
        {
            System.out.println("\nThat's correct !!");
            answerCorrect++;
        }
        else
        {
            System.out.println("\nThat's Wrong mate !! The right answer would be : b");
        }

        }
        else{
            System.out.println("\nYour Total Score is :\t"+answerCorrect);
        }


        System.out.println("\nDo you want to continue ?");
        opinion=in.nextLine();

        if(opinion.equals("yes"))
        {
            System.out.println("\nName a famous river flowing through Jharkhand !!");
        System.out.println("a. Swarnarekha Nadi");
        System.out.println("b. Satluj");
        System.out.println("c. Ganga River");
        System.out.println("d. Gomti River");

        System.out.println("\nWhat's your Stake ?\t");
        answer4=in.nextLine();

        if(answer4.equals("a"))
        {
            System.out.println("\nThat's correct !!");
            answerCorrect++;
        }
        else
        {
            System.out.println("\nThat's Wrong mate !! The right answer would be : a");
        }


        }
        else{
            System.out.println("\nYour Total Score is :\t"+answerCorrect);
        }


        



        System.out.println("\nDo you want to continue ?");
        opinion=in.nextLine();
        if(opinion.equals("yes"))
        {
            System.out.println("\nWhen was Jharkhand formed ?");
        System.out.println("a. 15th November, 2004");
        System.out.println("b. 20th December, 1993");
        System.out.println("c. 15th November, 2000");
        System.out.println("d. 23rd January, 2000");

        System.out.println("\nWhat's your Stake ?\t");
        answer4=in.nextLine();

        if(answer5.equals("c"))
        {
            System.out.println("\nThat's correct !!");
            answerCorrect++;
        }
        else
        {
            System.out.println("\nThat's Wrong mate !! The right answer would be : c");
        }

        }
        else
        {
            System.out.println("\nYour Total Score is :\t"+answerCorrect);
        }

        System.out.println("\nThanks for tunning !!");

        

        


       


    }
}