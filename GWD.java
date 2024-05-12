package Game;

import java.util.*;

public class GWD extends GameWorking{
    ArrayList <playerdetails> n=new ArrayList<>();
    int toals=0;
    int balls2=0;
    int k=0;
    public void playerlist(ArrayList<playerdetails> n){
        this.n=n;
        for(playerdetails pg:n){
            System.out.println();
            System.out.println("PLAYER'S OF "+pg.teamname+ "'s team:");
            System.out.println();
            for(String nm:pg.Name){
                System.out.println(nm);
            }
        }
        System.out.println("if you want to check player's name in team enter yes/no");
        System.out.println("enter yes or no  ,  any another word will be accept automatically no");
        String nm=sd.next().toLowerCase();
       // System.out.println("enter the name of which player'name you want to change in team and after all changes if you have done to end then entry -end");
        if (nm.equalsIgnoreCase("yes")) {
        while(true) {
            System.out.println("enter the name of which player'name you want to change in team and after all changes if you have done to end then entry -end");
            String nm2=sd.next().toLowerCase();
             if(nm2.equalsIgnoreCase("end")){
                break;
            }
            for(playerdetails pg:n){
                for(String nm3:pg.Name){
                    if(nm3.equalsIgnoreCase(nm2)){
                        System.out.println("enter the new name of player");
                        String nm6=sd.next().toLowerCase();
                        nm3.replaceFirst(nm3,nm6);
                    }
                    else{
                        k++;
                    }
                }
            }
            if(k==22){
                System.out.println("entered player name is wrong ..enter properly");
            }

            }
        }

            System.out.println("Game is loading ...");

    }
    public void battinglist(ArrayList<playerdetails> n,int k){
        this.n=n;
       /* Iterator<playerdetails> hm=n.iterator();
        while(hm.hasNext()){
            System.out.println(hm.next().teamname);
            System.out.println("Player's name:   "+Arrays.toString(hm.next().Name));
            System.out.println("Player's run:     "+Arrays.toString(hm.next().runs));
            System.out.println("Player's balls:   "+Arrays.toString(hm.next().balls));
        }*/
        System.out.println("the team :"+ n.get(k).teamname);
        System.out.println("PLAYER's Name    Runs  Balls");
        for(int i=0;i<11;i++){
            System.out.println(n.get(k).Name[i]+"             "+ n.get(k).runs[i]+ "       "+ n.get(k).balls[i]);
        }
    }
    public void ballinglist(ArrayList<playerdetails> n,int k){
        this.n=n;
        /*Iterator<playerdetails> hm=n.iterator();
        while(hm.hasNext()){
            System.out.println(hm.next().teamname);
            System.out.println("Player's name:   "+Arrays.toString(hm.next().Name));
            System.out.println("Player's run:     "+Arrays.toString(hm.next().wickets));
            System.out.println("Player's balls:   "+Arrays.toString(hm.next().balls));
        }*/
        System.out.println("the team :"+ n.get(k).teamname);
        System.out.println("PLAYER's Name    Wickets     Balls");
        for(int i=0;i<11;i++){
            System.out.println(n.get(k).Name[i]+"             "+ n.get(k).wickets[i]+ "              "+ n.get(k).balls[i]);
        }
    }
    public void controldisplaybatting(){
        System.out.println("       LOFT       ");
        System.out.println(" LEAVE      ADVANCE");
        System.out.println("       PUSH        ");
        System.out.println("enter any control:");
    }
    public void controldisplaybowling() {
        System.out.println("          SPIN       ");
        System.out.println(" STRAIGHT      YORKER");
        System.out.println("         BOUNCER      ");
        System.out.println("enter any control:");
    }
    public void opossballing(ArrayList<playerdetails> n,int toals){
        this.n=n;
        int n1;
        int k=0;
        int t=0;
        this.toals=toals;
        int totals6=0;
        System.out.println(" Scorecard of bowling :"+n.get(1).teamname +" :");
        for(int i=0;i<11;i++){
            n.get(1).wickets[i]=rd.nextInt(0,11-k);
            k=k+n.get(1).wickets[i];
            if(toals-t>=6) {
                n.get(1).runs[i] = rd.nextInt(6, toals - t);
            }
            else{
                n.get(1).runs[i]=6;
            }
            t = t + n.get(1).runs[i];
        }
        this.ballinglist(n,1);

    }
    public void oursballing(ArrayList<playerdetails> n,int toals){
        this.n=n;
        int n1;
        int k=0;
        int t=0;
        this.toals=toals;
        int totals6=0;
        System.out.println(" Scorecard of bowling :"+n.get(0).teamname +" :");
        for(int i=0;i<11;i++){
            n.get(0).wickets[i]=rd.nextInt(0,11-k);
            k=k+n.get(0).wickets[i];
            if(toals-t>=6) {
                n.get(1).runs[i] = rd.nextInt(6, toals - t);
            }
            else{
                n.get(1).runs[i]=6;
            }
            t = t + n.get(1).runs[i];
        }
        this.ballinglist(n,0);

    }
}
