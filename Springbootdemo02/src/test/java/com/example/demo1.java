package com.example;

import java.util.*;

public class demo1 {
    public static void main(String[] args) {
        String[] strings ={"20th Oct 2051","20th Oct 2051","29th Feb 2004","2nd Jan 2022"};
        System.out.println(getDay(strings));
    }
     static   int  getDay(String[] date){
        int count = date.length;
         LinkedHashMap<String,Integer> maps=new  LinkedHashMap<String, Integer>();
         List list=new ArrayList();
         list.add("Jan");
         list.add("Feb");
         list.add("Mar");
         list.add("Apr");
         list.add("May");
         list.add("Jun");
         list.add("Jul");
         list.add("Aug");
         list.add("Sep");
         list.add("Oct");
         list.add("Nov");
         list.add("Dec");
         System.out.println(list);
         HashMap<String,Integer> hashMap=new HashMap();
         int num =0;
         for(int i=0;i<count;i++){
            String s = date[i];
            String[] line = s.split(" ");
            boolean k1 = hashMap.containsKey(line[2]);
            //存在不执行工作
             if (k1 == true) {

             }else{
                 hashMap.put(line[2],0);
            int[] data1={31,29,31,30,31,30,31,31,30,31,30,31};
            int[] data2={31,28,31,30,31,30,31,31,30,31,30,31};
            if(Integer.valueOf(line[2])%4==0|| Integer.valueOf(line[2])%400==0&& Integer.valueOf(line[2])%100!=0){
                int length =  list.indexOf(line[1])-1;

                for(int k=0;k<length;k++){
                     num =num+data1[k];
                     System.out.println(num+" "+data1[k]);
                }
                int flag= line[0].length();
                char[] chars = line[0].toCharArray();
                if(flag==3){

                    num+=Integer.valueOf(chars[0]+chars[1]);
                }else{
                    if(Integer.valueOf(chars[0])<1){
                        num=num;
                    }
                    num=20;
                }


            }else{
                int length =  list.indexOf(line[1])-1;

                for(int k=0;k<length;k++){
                    num =num+data2[k];
                }
                int flag= line[0].length();
                char[] chars = line[0].toCharArray();
                if(flag==3){

                    num+=Integer.valueOf(chars[0]+chars[1]);
                }else{
                    num+=Integer.valueOf(chars[0]);
                }



            }
         }}



         return num;


    }
}
