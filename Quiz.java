package Game;
import java.util.*;
class Questions{
    String prompt;
    String answer;
    Questions(String prompt,String answer){
        this.prompt=prompt;
        this.answer=answer;
    }
}

public class Quiz {
    public Questions[] getarr() {
        String q1 = """
                When was the Ashes first played?
                a) 1872
                b) 1877
                c) 1882
                d) 1887""";
        String q2 = """
                 Who won the first ever Cricket World Cup in 1975?
                a) Australia
                b) England
                c) India
                d) West Indies""";
        String q3 = """
                 What is the largest cricket stadium in the world?
                a) Eden Gardens
                b) Melbourne Cricket Club
                c) Lords
                d) Narendra Modi Stadium""";
        String q4 = """
                 How many ways are there of getting out?
                a) 7
                b) 8
                c) 9
                d) 10""";
        String q5 = """
                 How long is the wicket on a cricket pitch?
                a) 18 yards
                b) 20 yards
                c) 22 yards
                d) 24 yards""";
        String q6 = """
                 What is the largest cricket stadium in the world?
                a) Eden Gardens
                b) Melbourne Cricket Club
                c) Lords
                d) Narendra Modi Stadium""";
        String q7 = """
                 Who did England beat in the final of the 2019 Cricket World Cup?
                a) Australia
                b) India
                c) New Zealand
                d) South Africa""";
        String q8 = """
                  Which fast bowler has taken the most test wickets?
                a) Stuart Broad
                b) Dale Steyn
                c) Glenn McGrath
                d)  James Anderson""";
        String q9 = """
                Who is the first batsman to cross 10,000 runs in tests?
                a) Sunil Gavaskar
                b) Sachin Tendulkar
                c) Allan Border
                d) Brian Lara""";
        String q10 = """
                What is the highest first innings score in test cricket?
                a) 703
                b) 803
                c) 903
                d) 1,003""";

        Questions[] questions = {
                new Questions(q1, "b"),
                new Questions(q2, "d"),
                new Questions(q3, "d"),
                new Questions(q4, "d"),
                new Questions(q5, "c"),
                new Questions(q6, "d"),
                new Questions(q7, "c"),
                new Questions(q8, "d"),
                new Questions(q9, "a"),
                new Questions(q10, "c")};
        return questions;
    }
    //b,d,d,d,c,d,c,d,a,c
    public  void takeTest(Questions[] q1) {
        int score=0;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<q1.length;i++){
            System.out.println(q1[i].prompt);
            String answer=sc.next();
            if(answer.equalsIgnoreCase(q1[i].answer)){
                score++;
            }
        }
        System.out.println(" your score is "+ score +"/"+q1.length);

    }


}


