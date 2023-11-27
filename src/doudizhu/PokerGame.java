package doudizhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerGame {
    static ArrayList<Integer> list = new ArrayList<>();
    static HashMap<Integer, String> hm = new HashMap<>();
    static {
        String[] color={"♥","♠","♦","♣"};
        int index=1;
        String[] number ={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};


        for (String n : number) {
            for (String c : color) {
                list.add(index);
                hm.put(index++,c+n);
            }
        }
        list.add(index);
        hm.put(index++,"小王");
        list.add(index);
        hm.put(index,"大王");
    }


    public PokerGame(){
        //洗牌
        Collections.shuffle(list);
        //System.out.println(list);
        //发牌
        TreeSet<Integer> lord = new TreeSet<>();
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();
        for (int i = 0; i < list.size(); i++) {
            if (i<=2){
                lord.add(list.get(i));
                continue;
            }
            if (i%3==0)
                player1.add(list.get(i));
            else if (i%3==1)
                player2.add(list.get(i));
            else
                player3.add(list.get(i));
        }
        lookPoker("lord",lord);
        lookPoker("p1",player1);
        lookPoker("p2",player2);
        lookPoker("p3",player3);
    }
    public void lookPoker(String name, TreeSet<Integer> list){
        System.out.print(name+":");
        for (Integer i : list) {
            System.out.print(hm.get(i)+" ");
        }
        System.out.println();
    }
}
