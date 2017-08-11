import java.util.Random;
import java.util.Scanner;

public class ProcessControl {

    public static void main(String[] args) {
        ProcessControl processControl = new ProcessControl();
//        processControl.practiceOne();
//        processControl.practiceTwo();
//        processControl.practiceThree();
//        processControl.practiceFour();
//        processControl.practiceFive();
//        int a = 0xAAAA;
//        int b = 0x5555;
//        System.out.println(Integer.toBinaryString(a));
//        System.out.println(Integer.toBinaryString(b));
//        int c;
//        c = a & b;
//        processControl.practiceSix(c);
//        c = a | b;
//        processControl.practiceSix(c);
//        c = a ^ b;
//        processControl.practiceSix(c);
//        c = ~a;
//        processControl.practiceSix(c);
        processControl.practiceSeven();
    }

    /**
     * TODO 4-1
     * @param
     * @return void
     * @author 张铭敏 1906636405@qq.com
     * @version V1.0
     * @since 2017-08-08
     */
    public void practiceOne(){
        for (int i = 1; i <= 100; i++) {
            System.out.print(i+" ");
        }
    }

    /**
     * TODO 4-2
     * @param
     * @return void
     * @author 张铭敏 1906636405@qq.com
     * @version V1.0
     * @since 2017-08-08
     */
    public void practiceTwo(){
        Random random = new Random();
        int[] ints = new int[25];
        for (int i = 0; i < 25; i++) {
            ints[i] = random.nextInt(100);
        }
        String str = "";
        for (int i = 0; i < ints.length; i++) {
            if (i < ints.length - 1) {
                if (str.equals("")) {
                    if (ints[i] < ints[i+1]) {
                        str += ints[i] +" < "+ ints[i+1];
                    } else if (ints[i] == ints[i+1]) {
                        str += ints[i] +" = "+ ints[i+1];
                    } else {
                        str += ints[i] +" > "+ ints[i+1];
                    }
                } else {
                    if (ints[i] < ints[i+1]) {
                        str += " < "+ ints[i+1];
                    } else if (ints[i] == ints[i+1]) {
                        str += " = "+ ints[i+1];
                    } else {
                        str += " > "+ ints[i+1];
                    }
                }
            }
        }
        System.out.println(str);
    }

    /**
     * TODO 4-3
     * @param
     * @return void
     * @author 张铭敏 1906636405@qq.com
     * @version V1.0
     * @since 2017-08-08
     */
    public void practiceThree(){
        while (true) System.out.println("nice");
    }

    /**
     * TODO 3-10
     * @param
     * @return void
     * @author 张铭敏 1906636405@qq.com
     * @version V1.0
     * @since 2017-08-08
     */
    public void practiceFour(){
        int li1 = 0xaaaaaaaa;
        int li2 = 0x55555555;
        System.out.println(Integer.toBinaryString(li1));
        System.out.println(Integer.toBinaryString(li2));
    }

    /**
     * TODO 4-4
     * @param
     * @return void
     * @author 张铭敏 1906636405@qq.com
     * @version V1.0
     * @since 2017-08-08
     */
    public void practiceFive(){
        for (int i = 2; i < 100; i++) {
            boolean a = false;
            for (int j = 2; j < i; j++) {
                if (i%j == 0) {
                    a = true;
                    break;
                }
            }
            if (a) {
                System.out.println(i);
            }
        }
    }

    /**
     * TODO 4-5
     * @param c
     * @return void
     * @author 张铭敏 1906636405@qq.com
     * @version V1.0
     * @since 2017-08-09
     */
    private void practiceSix(int c) {
        int d = 0x8000;
        for (int i = 0; i < 16; i++) {
            int out = (c | d) == c ? 1 : 0;//循环比较得出每一位
            System.out.print(out);
            d>>>=1;
        }
        System.out.println();
    }

    private void practiceSeven() {
        Scanner sc = new Scanner(System.in);
        int rank = sc.nextInt();
        if (rank < 1) {
            System.out.println("给定参数不能小于1");
        } else {
            int[] res = new int[rank];
            res[0] = 1;
            if (rank > 1) {
                res[1] = 1;
                for (int i = 2; i < rank; i++) {
                    res[i] = res[i-1] + res[i-2];
                }
            }
            for (int re : res) {
                System.out.print(re + " ");
            }
        }
    }
}
