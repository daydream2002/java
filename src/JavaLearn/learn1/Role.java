package JavaLearn.learn1;

import java.util.Random;

public class Role {
   private String name;
   private int blood;
   private char gender;
   private String face;
   String[] boyFaces={"男1","男2","男3","男4"};
   String[] girlFaces={"女1","女2","女3","女4"};
   String[] attack={"%sa1%s","%sa2%s","%sa3%s"};
   String[] injure={"%si1%s","%si2%s","%si3%s"};

   public Role(String name,int blood,char gender){
      this.name=name;
      this.blood=blood;
      this.gender=gender;
      setFace(gender);
   }
   public void showinfom(){
      System.out.println(this.name);
      System.out.println(this.blood);
      System.out.println(this.gender);
      System.out.println(this.face);
   }
  public char getGender() {
     return gender;
   }

   public void setGender(char gender) {
      this.gender = gender;
   }

   public String getFace() {
      return face;
   }

   public void setFace(char gender) {
     Random r = new Random();
     if (gender=='男'){
         int index = r.nextInt(boyFaces.length);
         this.face=boyFaces[index];
     }else if (gender=='女'){
         int index = r.nextInt(girlFaces.length);
         this.face=girlFaces[index];
     }else {
        this.face="不男不女";
     }
   }



   public void setBlood(int blood) {
      this.blood = blood;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getBlood() {
      return blood;
   }

   public String getName() {
      return name;
   }
   public void attack(Role r){
      Random random=new Random();
      int index=random.nextInt(attack.length);
      System.out.printf(attack[index],this.name,r.name);
      System.out.println();
      int hurt = random.nextInt(20)+1;
      int remianblood=r.getBlood()-hurt;
      remianblood= Math.max(remianblood, 0);
      r.setBlood(remianblood);
      System.out.println(this.name+"打了"+r.getName()+"造成伤害"+hurt+"剩余血量"+r.getBlood());
   }
}
