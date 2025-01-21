import java.util.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int[] num = new int[cnt];
        //산술평균 : N개의 수들의 합을 N으로 나눈 값
        //중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
        //최빈값 : N개의 수들 중 가장 많이 나타나는 값
        //범위 : N개의 수들 중 최댓값과 최솟값의 차이

        for(int i = 0; i < cnt; i++)
        {
            num[i] = Integer.parseInt(br.readLine());        
        }

        Arrays.sort(num); // 배열을 오름차순으로 정렬
        double sum = Arrays.stream(num).sum() / (double)cnt; // 산술평균 계산
        int mid = num[cnt / 2]; // 중앙값은 정렬된 배열에서 가운데 값
        int range = num[cnt - 1] - num[0]; // 범위는 최댓값과 최솟값의 차이

        // HashMap을 이용해 각 숫자의 빈도를 세는 작업
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int n : num) {
            hash.put(n, hash.getOrDefault(n, 0) + 1);
        }

        // 최빈값을 구하는 과정
        int maxCount = 0;
        ArrayList<Integer> maxKeys = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : hash.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            if (value > maxCount) {
                maxCount = value;
                maxKeys.clear();
                maxKeys.add(key);
            } else if (value == maxCount) {
                maxKeys.add(key);
            }
        }

        // 최빈값이 여러 개라면, 그 중 두 번째로 작은 값 선택
        int maxKey = -1;
        if (maxKeys.size() > 1) {
            Collections.sort(maxKeys); // 두 번째로 작은 값 선택을 위해 정렬
            maxKey = maxKeys.get(1); // 두 번째 값
        } else {
            maxKey = maxKeys.get(0); // 한 개라면 그 값
        }

        // 출력
        System.out.println(Math.round(sum)); // 산술평균은 반올림해서 출력
        System.out.println(mid); // 중앙값 출력
        System.out.println(maxKey); // 최빈값 출력
        System.out.println(range); // 범위 출력
    }
}
