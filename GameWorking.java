package Game;
import java.util.*;
 public abstract  class GameWorking {
     Scanner sd = new Scanner(System.in);
     Random rd = new Random();
     int[] arr1=new int[11];
     int[] arr2=new int[11];
     int[] arr3=new int[11];
     ArrayList <playerdetails> n=new ArrayList<>();

     abstract void playerlist(ArrayList<playerdetails> n);

     abstract void battinglist(ArrayList<playerdetails> n,int k);

     abstract void ballinglist(ArrayList<playerdetails> n,int k);
     abstract void opossballing(ArrayList<playerdetails> n,int toals);
     abstract public void oursballing(ArrayList<playerdetails> n,int toals);

     abstract void controldisplaybatting();

     abstract void controldisplaybowling();

     public int Batting(ArrayList<playerdetails> n) {
         this.n = n;
         int runs1=0,balls1=0,wickets1=0,total1=0;

         for (int i = 0; i < 11; i++) {
             System.out.println(" the batsman entering into ground: "+ n.get(0).Name[i] );
             while (true) {
                 this.controldisplaybatting();
                 String sk = sd.next();
                 if (sk.equalsIgnoreCase("loft")) {
                     balls1++;
                     int n1 = rd.nextInt(0, 3);
                     if (n1 == 0) {
                         System.out.println("it is 6,hurre");
                         runs1 = runs1 + 6;
                     } else if (n1 == 1) {
                         System.out.println("it is 4 runs");
                         runs1 = runs1 +4;
                     } else {
                         int n2 = rd.nextInt(0, 3);
                         String[] str2 = {"Run Out", "Bowled", "Caught out"};
                         System.out.println("it's out:" + str2[n2]);
                         break;
                     }

                 } else if (sk.equalsIgnoreCase("leave")) {
                     balls1++;
                     int n1 = rd.nextInt(0, 2);
                     if (n1 == 0) {
                         System.out.println("it is a dot ball");
                         runs1 = runs1 + 0;
                     } else if (n1 == 1) {
                         System.out.println("it's a wicket..");
                         break;
                     }
                 } else if (sk.equalsIgnoreCase("advance")) {
                     balls1++;
                     int n1 = rd.nextInt(0, 3);
                     if (n1 == 0) {
                         System.out.println("it is 6,hurre");
                         runs1 = runs1 + 6;
                     } else if (n1 == 1) {
                         System.out.println("it is 4 runs");
                         runs1 = runs1 + 4;
                     } else {
                         int n2 = rd.nextInt(0, 2);
                         String[] str2 = {"Run Out", "Caught out"};
                         System.out.println("it's out:" + str2[n2]);
                         break;
                     }
                 } else {
                     balls1++;
                     int n1 = rd.nextInt(0, 3);
                     if (n1 == 0) {
                         System.out.println("it is 1 runs");
                         runs1 = runs1 + 1;
                     } else if (n1 == 1) {
                         System.out.println("it is 2 runs");
                         runs1 = runs1 + 2;
                     } else {
                         int n2 = rd.nextInt(0, 1);
                         String[] str2 = {"Run Out"};
                         System.out.println("it's out:" + str2[n2]);
                         break;
                     }
                 }

             }
             arr1[i]=runs1;
             arr2[i]=balls1;
             total1=total1+runs1;
             runs1=0;
             balls1=0;
             System.out.println("the player scored: "+arr1[i]+"in "+arr2[i]);


         }
         n.get(0).runs=arr1;
         n.get(0).balls=arr2;
         System.out.println("total runs made by the team :"+total1);
         System.out.println();

         return total1;
     }

     public int Bowling(ArrayList<playerdetails> n,int k) {
         this.n = n;
         int runs1=0,balls1=0,wickets1=0,total1=0;
         for (int i = 0; i < 11; i++) {
             System.out.println(" the batsman entering into ground: "+ n.get(1).Name[i] );
             while (true) {
                 this.controldisplaybowling();
                 String sk = sd.next();
                 if (sk.equalsIgnoreCase("Straight")) {
                     balls1++;
                     int n1 = rd.nextInt(0, 3);
                     if (n1 == 0) {
                         System.out.println("it is 6,hurre");
                         runs1 = runs1 + 6;
                     } else if (n1 == 1) {
                         System.out.println("it is 4 runs");
                         runs1 = runs1 +4;
                     } else {
                         int n2 = rd.nextInt(0, 3);
                         String[] str2 = {"Run Out", "Bowled", "Caught out"};
                         System.out.println("it's out:" + str2[n2]);
                         break;
                     }

                 } else if (sk.equalsIgnoreCase("bouncer")) {
                     balls1++;
                     int n1 = rd.nextInt(0, 2);
                     if (n1 == 0) {
                         System.out.println("it is a dot ball");
                         runs1 = runs1 + 0;
                     } else if (n1 == 1) {
                         System.out.println("it's a wicket..");
                         break;
                     }
                 } else if (sk.equalsIgnoreCase("spin")) {
                     balls1++;
                     int n1 = rd.nextInt(0, 3);
                     if (n1 == 0) {
                         System.out.println("it is 6,hurre");
                         runs1 = runs1 + 6;
                     } else if (n1 == 1) {
                         System.out.println("it is 4 runs");
                         runs1 = runs1 + 4;
                     } else {
                         int n2 = rd.nextInt(0, 2);
                         String[] str2 = {"Run Out", "Caught out"};
                         System.out.println("it's out:" + str2[n2]);
                         break;
                     }
                 } else {
                     balls1++;
                     int n1 = rd.nextInt(0, 3);
                     if (n1 == 0) {
                         System.out.println("it is 1 runs");
                         runs1 = runs1 + 1;
                     } else if (n1 == 1) {
                         System.out.println("it is 2 runs");
                         runs1 = runs1 + 2;
                     } else {
                         int n2 = rd.nextInt(0, 1);
                         String[] str2 = {"Run Out"};
                         System.out.println("it's out:" + str2[n2]);
                         break;
                     }
                 }

             }
             arr1[i]=runs1;
             arr2[i]=balls1;
             total1=total1+runs1;
             runs1=0;
             balls1=0;
             System.out.println("the player scored: "+arr1[i]+"in "+arr2[i]);


         }
         n.get(1).runs=arr1;
         n.get(1).balls=arr2;
         System.out.println("total runs made by the team :"+total1);
         System.out.println();

         return total1;
     }

     public boolean toss() {
         int num = rd.nextInt(0, 2);
         String[] m={"head","tail"};
         if (num == 0) {
             System.out.println("choose head or tail..(write head or tail below)");
             String t = sd.next().toLowerCase();
             int num2 = rd.nextInt(0, 2);
             if(t.equals(m[num2])){
                 return true;
             }
             else if(!(t.equalsIgnoreCase("head") || t.equalsIgnoreCase("tail"))){
                 System.out.println("wrong input/choose");
                 System.out.println("as per instruction if speeling mistake or wrong input toss which done again:");
                 this.toss();
             }

         }
         else{
             System.out.println("oponent have chance for head or tail..");
             int num1 = rd.nextInt(0, 2);
             if(num1==0){
                 return true;
             }
             System.out.println("oponent lost the toss..");
         }
         return false;
     }
     public boolean selectionbb (boolean m){
         if(m){
             System.out.println(" your chance to choose for batting or balling: ");
             String st=sd.next().toLowerCase();
             if(st.equalsIgnoreCase("batting")){
                 return true;
             }
             else if (st.equalsIgnoreCase("balling")){
                 return false;
             }
             else{
                 System.out.println("choose is wrong ..");
                 this.selectionbb(true);
             }
         }
         else{
             boolean bm=rd.nextBoolean();
             if(bm){
                 System.out.println("oponent choose for bowling");
             }
             else{
                 System.out.println("oponent choose for batting");
                 return bm;
             }
         }
         return false;
     }
 }
