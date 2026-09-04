import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class syntaxPrac {
    public static void main(String[] args) {
//         int a=10;
//         System.out.println(String.valueOf(a));

//         String s="10";
        // System.out.println(Integer.parseInt);

//         char c='1';
//         int ss=c-'0';
//         System.out.println(ss);
// int i=10;
//     char cc=(char)(i+'0');
//     // char ccc=Character.valueOf();

//     // System.out.println(ccc);
//     char v='a';
//     String sh=v+"";

    // char nn='a';
    // int nnn=nn;
    // System.out.println(nnn);
//     System.out.println((char)(nn+1));
//     System.out.println((nn+1));

//   int  a=Integer.MIN_VALUE;
//   int  i=Integer.MAX_VALUE;

//   String a="aa";
//   String b="as";

//     System.out.println();

//     int aa=2;
//     System.out.println((char)(aa+'a'));

// String s="hshsdd";
// System.out.println(s.trim());
// String c[]=s.trim().split("\\s+");
// for(String ss:c)System.out.println(ss);

// System.out.println(s.contains("d"));

// StringBuilder sb=new StringBuilder(s);
// sb.setCharAt(1,'c');

// System.out.println(sb.toString());


// ArrayList<Integer>list=new ArrayList<>();
// list.add(100);
// list.add(10);

// list.add(1080);

// list.remove(1);
// // list.clear();
// System.out.println(list.indexOf(100));



// ArrayList<List<Integer>>list=new ArrayList<>();

// // list.add(0,new ArrayList<>());
// // list.get(0).add(9);
// // list.get(0).add(9);


// int a[][]={
//     {2,3},{8,9}
// };

// for(int i=0;i<a.length;i++)
//     {if(list.size()<=i)list.add(new ArrayList<>());
// list.get(i).add(a[i][0]);
// list.get(i).add(a[i][1]);}

// System.out.println(list.get(0).get(0));


// System.out.println(list);


// List<int[]>graph=new ArrayList(5);

// graph[0].add(0);



HashMap<Integer,Integer>map=new HashMap<>();

map.put(0,map.getOrDefault(0,0)+1);

   
System.out.println(map.values());


    }
}


helper(){

    if(root==null)return;

    helper(root.left);
    helper(root);
    helper(root.right);


}
