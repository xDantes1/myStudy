package 第二节课;

import firstStudy.P1;

import java.util.Random;

public class P2 {
    public static void main(String[] args) {
        System.out.println("测试开始");
        //Math.random -> double -> [0,1)
        double ans  = Math.random();
        int testTimes = 1000000;
        int count = 0;

//        for (int i = 0; i < testTimes; i++) {
//            if(Math.random()<0.3) {
//                count++;
//            }
//        }
//        System.out.println((double) count / (double)testTimes);
        //[0,9)上随机出现的次数
//        int K = 9;
//        int [] count1 = new int[9];
//        for (int i = 0; i < testTimes; i++) {
//            int ans1 = (int)(Math.random() * K );
//                count1[ans1]++;
//            }
//        for (int i =0; i < K;i++)
//        {
//            System.out.println(i+ "这个数出现了" + count1[i]);



//-----------------------------------------------------------
//          返回[0,1)
//          任意x x属于[0,1),[0,x)范围上的数字出现概率原来的x调整至x平方
//         count = 0;
         int count1= 0;
          double x  =0.18;
//        for (int i = 0; i < testTimes; i++) {
//            if(xToXPower2()<x) {
//                count++;
//            }
//        }
//        System.out.println(Math.pow(x,2));
//        System.out.println((double)count / (double)testTimes);

        System.out.println("===============================用最小数求===============================");

        for (int i = 0; i < testTimes; i++) {
            if(xToXPower2()<x){
                count1++;
            }
        }
        System.out.println((double) 1 - Math.pow((double) 1 -x,2));
        System.out.println((double)count1 / (double)testTimes);

        System.out.println("==============================分割线===============================");

    }




    public static double xToXPower3(){
        return Math.max(Math.random(),Math.random());
    }

    public static double xToXPower2(){
        return Math.min(Math.random(),Math.random());

    }

 }



