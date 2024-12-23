import java.util.*;
import java.util.stream.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Member
{
    int age;
    String name;
    
    public Member(int age, String name)
    {
        this.age = age;
        this.name = name;
    } 
}
class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Member> info = new ArrayList<>();
        int total = Integer.parseInt(br.readLine());

        for(int i = 0; i < total; i++)
        {
            String[] people = br.readLine().split(" ");
            int age = Integer.parseInt(people[0]);
            String name = people[1];
            info.add(new Member(age, name));
        }
        
        info = info.stream()
                     .sorted(Comparator.comparingInt(member -> member.age))
                     .collect(Collectors.toList());

        for(Member member : info)
        {
            System.out.println(member.age + " " + member.name);
        }
    }
}