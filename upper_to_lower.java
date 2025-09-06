public class upper_to_lower {
    

public static void main(String[] args) {
String a="AADI";
char c;
StringBuilder s=new StringBuilder();
for(int i=0;i<a.length();i++){
    char ch = a.charAt(i);
if(ch>='A'&&ch<='Z'){
 ch=(char)(ch+32);
  

}
s.append(ch);
}
System.out.println(s.toString());
}}

