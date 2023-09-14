class Solution {
    public int solution(int a, int b, int c, int d) {
       // 각 숫자의 갯수를 센다
        int[] counts = new int[7];
        for (int x : new int[]{a, b, c, d}) {
            counts[x]++;
            System.out.println(counts[x]);
        }

        for (int i = 1; i <= 6; i++) {
            if (counts[i] == 4) {
                return 1111 * i;
            }
        }


        for (int i = 1; i <= 6; i++) {
            if (counts[i] == 3) {
                for (int j = 1; j <= 6; j++) {
                    if (i != j && counts[j] == 1) {
                        return (10 * i + j) * (10 * i + j);
                    }
                }
            }
        }


        for (int i = 1; i <= 6; i++) {
            if (counts[i] == 2) {
                for (int j = i + 1; j <= 6; j++) {
                    if (counts[j] == 2) {
                        return (i + j) * Math.abs(i - j);
                    }
                }
            }
        }

        for (int i = 1; i <= 6; i++) {
            if (counts[i] == 2) {
                int[] others = new int[2];
                int index = 0;
                for (int j = 1; j <= 6; j++) {
                    if (i != j && counts[j] == 1) {
                        others[index++] = j;
                    }
                }
                return others[0] * others[1];
            }
        }

        for (int i = 1; i <= 6; i++) {
            if (counts[i] == 1) {
                return i;
            }
        }

        return 0;
    }
}