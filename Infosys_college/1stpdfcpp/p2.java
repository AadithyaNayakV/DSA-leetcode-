// for(int i=0;i<m;i++){
//             int no=1;
//             for(int j=0;j<n;j++){
//                 int mis=0;

//                 if(in[i].length()!=s[j].length())continue;
//                 for(int k=0;k<s[j].length();k++){
//                 if(in[i].charAt(k)!=s[j].charAt(k))mis++;
//                 if(mis>1)break;
//                 }

//             if(mis==1){System.out.println("yes");no=0;break;}

//             }
//             if(no==1)System.out.println("No");

//         }

import java.util.HashSet;

public class p2 {
    public static void main(String[] args) {
        String s[] = { "abc", "acc" };
        String in[] = { "abb" };
        int n = 2, m = 1, count = 0;
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < s.length; i++)
            set.add(s[i]);

        for (int i = 0; i < in.length; i++) {
            StringBuilder b = new StringBuilder(in[i]);
            int h = 1;
            for (int j = 0; j < in[i].length(); j++) {
                char original = b.charAt(j);
                if (in[i].charAt(j) == 'a') {
                    b.replace(j, j + 1, "b");
                    if (set.contains(b.toString())) {
                        System.out.println("yes");
                         h=0;
                        break;
                    }
                    b.replace(j, j + 1, "c");
                    if (set.contains(b.toString())) {
                        System.out.println("yes");
                         h=0;
                        break;
                    }
                }

                else if (in[i].charAt(j) == 'b') {
                    b.replace(j, j + 1, "a");
                    if (set.contains(b.toString())) {
                        System.out.println("yes");
                         h=0;
                        break;
                    }
                    b.replace(j, j + 1, "c");
                    if (set.contains(b.toString())) {
                        System.out.println("yes");
                        h=0;
                        break;
                    }
                } else if (in[i].charAt(j) == 'c') {
                    b.replace(j, j + 1, "b");
                    if (set.contains(b.toString())) {
                        System.out.println("yes");
                         h=0;
                        break;
                    }
                    b.replace(j, j + 1, "a");
                    if (set.contains(b.toString())) {
                        System.out.println("yes");
                         h=0;
                        break;
                    }
                }
                    b.setCharAt(j, original);
            }
            if (h == 1)
                System.out.println("No");

        }

    }
}
