package 第二节课;

public class Pratice1 {
    //lib 中
    public  static int f1(){
        return (int)(Math.random()*5) + 1;
    }

    //随机只能用f1 等概率返回0和1
    public  static int f2(){
         int ans = 0;
         do{
             ans = f1();
         }while (ans == 3);
         return ans < 3 ? 0 : 1;
    }

    //得到000~111做到等概率 做到等概率7返回一个
    public  static int f3(){
       return  (f2() << 2)+(f2() << 1)+(f2() << 0);
    }

    public static int f4(){
        int ans = 0;
        do {
            ans = f3();
        }while (ans ==7 );
        return ans;
    }

    public static int g(){
        return f4()+1;
    }

    public static void main(String[] args) {
        int count = 0;
        int testNum = 100000;
        //
        for (int i = 0; i <testNum ; i++) {
            if (f2() == 0){
                count++;
            }

        }
        System.out.println((double)count/(double)testNum);

        System.out.println("=======================");


        int[] count1 = new int[8];
        for (int i = 0; i < testNum; i++) {
            int num = g();
            count1[num]++;
        }
        for (int i = 0; i < 8; i++) {
            System.out.println(i+"这个数出现了"+count1[i]+"次");
        }
    }

    //2
    //x会以固定概率返回1，x内容看不到
    public static int x(){
        return Math.random()<0.84 ? 0:1;
    }
    //等概率返回1
    //如果ans返回值相等重做y，直到不相同返回ans。
    public static int y(){
        int ans = 0;
        do{
            ans = x();
        }while (ans == x());
        return ans;
    }

}