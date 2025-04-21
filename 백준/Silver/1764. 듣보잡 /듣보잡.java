import java.util.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" "); //듣도 3 보도 4 n m
        int n = Integer.parseInt(temp[0]);
        int m = Integer.parseInt(temp[1]);

        HashSet<String> name1 = new HashSet<>();
        HashSet<String> name2 = new HashSet<>();
        
        for(int i = 0; i < n; i++) //3줄동안 듣x 목록
        {
            String name = br.readLine();
            name1.add(name);
        }

        for(int i = 0; i < m; i++) //m줄동안 보x 목록
        {
            String name = br.readLine();
            name2.add(name);
        }

        List<String> ans = new ArrayList<>();
        for(String a : name1)
        {
            if(name2.contains(a))
            {
                ans.add(a);
            }
        }

        Collections.sort(ans);

        System.out.println(ans.size());
        for(String b : ans)
        {
            System.out.println(b);
        }
    }
}

///////더 쉬운방법 retainAll함수 사용
//// 교집합 구하기
name1.retainAll(name2); // 교집합 계산
List<String> ans = new ArrayList<>(name1); // 교집합을 리스트로 변환

Collections.sort(ans); // 정렬
