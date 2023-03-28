package javaStudying;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class enumeration {
    public static void main(String[] args) {
        // 230328

        // Enumeration 학습

        List<String> lists = new ArrayList<>();
        lists.add("iPhone");
        lists.add("iMac");
        lists.add("iPad");
        lists.add("applWatch");

        System.out.println("for구문 사용");
        for (int i = 0; i < lists.size(); i++) {
            System.out.println("lists " + i + "번째 요소 : " + lists.get(i));
        }

        System.out.println("=============================");

        System.out.println("Enumeration 사용");
        Enumeration<String> en = Collections.enumeration(lists);

        while(en.hasMoreElements()){
            System.out.println("en의 요소 : " + en.nextElement());
        }





    }
}
