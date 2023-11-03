import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String args[]) throws Exception {
       //System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int cnt = 1;
        while (true){
            if(cnt == 11) break;
            int testCase = sc.nextInt();
            System.out.print("#" + testCase + " ");
            ArrayList<Integer> list = new ArrayList<>();
            if(cnt == testCase){
                for (int i = 0; i < 8; i++) {
                    list.add(sc.nextInt());
                }
                cnt++;
            }
            int cnt2= 1;
            while(true){
                if(Collections.min(list) >= 0){
                    if(cnt2 == 1){
                        list.add(list.size(), list.get(0)-1);
                        list.remove(0);
                        cnt2++;
                    } else if (cnt2 == 2) {
                        list.add(list.size(), list.get(0)-2);
                        list.remove(0);
                        cnt2++;
                    } else if (cnt2 == 3) {
                        list.add(list.size(), list.get(0)-3);
                        list.remove(0);
                        cnt2++;
                    } else if (cnt2 == 4) {
                        list.add(list.size(), list.get(0)-4);
                        list.remove(0);
                        cnt2++;
                    } else if (cnt2 == 5) {
                        list.add(list.size(), list.get(0)-5);
                        list.remove(0);
                        cnt2 = 1;
                    }else{
                        break;
                    }
                    if(Collections.min(list)<=0){
                        list.remove(list.size()-1);
                        list.add(list.size(), 0);
                        break;
                    }
                }else{
                    System.out.println("Error zone");
                    break;
                }
            }
            for (int i = 0; i < 8; i++) {
                System.out.print(list.get(i) + " ");
            }
            System.out.println();
            list.clear();
        }
    }
}
