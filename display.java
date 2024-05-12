package Game;

import java.util.*;

public class display extends GWD {
    playerdetails pds;
    GameWorking Gw=new GWD();
    Scanner sc=new Scanner(System.in);
    Random rd=new Random();
    int[] runs=new int[11];
    int[] balls=new int[11];
    int[] wickets=new int[11];
    public void title(){
        System.out.println("                                                  REAL CRICKET  SINCE-1990             ");
        System.out.println("                                                 --------------------------              ");
        System.out.println();
        System.out.println("                                                            PLAY      ");
        System.out.println("                                                            QUIZ      ");
        System.out.println("                                                         INSTRUCTION  ");
        System.out.println("                                                            QUIT");
    }
    public void instruction(){
        System.out.println("how to play:");
        System.out.print(" @BATTING:");
        System.out.println("we have 4 controls in batting: LEAVE ,LOFT,ADVANCE,PUSH ( enter any controls for following ) ");
        System.out.println("          LOFT : used for strike the bat for 6,4");
        System.out.println("          LEAVE : used for to leave the ball");
        System.out.println("          PUSH : used to push the ball to singles, 2 runs");
        System.out.println("          Advance : it is used to make player come front and hit 6 runs");
        System.out.print(" @BALLING:");
        System.out.println("we have 4 controls in batting: STRAIGHT ,SPIN,YORKER,BOUNCER  (enter any controls for following) ");
        System.out.println("          STRAIGHT : used for throwing a straight ball");
        System.out.println("          SPIN : used for throwing a spin ");
        System.out.println("          YORKER : used for throwing a yorker");
        System.out.println("          Bouncer : it is used for throwing a bouncer");
    }
    public void operate(String[] names,String[] oopnames){
        System.out.println("enter the option:");
        String option=sc.next();
        option=option.toUpperCase();
        switch (option){
            case "PLAY" :{
                System.out.println("enter your team name:");
                String nm=sc.next();
                System.out.println("enter the opposite team name:");
                String nm1=sc.next();
                ArrayList <playerdetails> n=new ArrayList<>();
                n.add(new playerdetails(nm,names,runs,balls,wickets));
                n.add(new playerdetails(nm1,oopnames,runs,balls,wickets));
               Gw.playerlist(n);
                boolean m=Gw.selectionbb(Gw.toss());
                if(m){
                    int total4=Gw.Batting(n);
                    Gw.opossballing(n,total4);
                    System.out.println(" Now "+n.get(1).teamname +" is batting and they require "+ total4 +" runs ");
                    int total5=Gw.Bowling(n,1);
                    Gw.oursballing(n,total5);
                    if(total5>total4){
                        System.out.println("you lost the match by "+ (total5-total4) +" runs");
                    }
                    else{
                        System.out.println("you won the match by "+(total4-total5)+" runs");
                    }

                }
                else{
                    int total5=Gw.Bowling(n,1);
                    Gw.oursballing(n,total5);
                    System.out.println(" Now "+n.get(0).teamname +" is batting and they require "+ total5 +" runs ");
                    int total4=Gw.Batting(n);
                    Gw.opossballing(n,total4);
                    if(total5>total4){
                        System.out.println("you lost the match by "+ (total5-total4) +" runs");
                    }
                    else{
                        System.out.println("you won the match by "+(total4-total5)+" runs");
                    }
                }

                break;

            }
            case "QUIZ" :{
                Quiz qz=new Quiz();
                Questions[] qr=qz.getarr();
                qz.takeTest(qr);
                break;

            }
            case "INSTRUCTION" : {
                this.instruction();
                break ;
            }
            case "QUIT" :{
                System.out.println("you have exit the game successfully!!!");
                System.exit(0);
                break ;
            }
            default :{
                System.out.println(" the enterred option is wrong please enter again!!!!!");
                this.operate(names,oopnames);
            }
        }
    }

}
