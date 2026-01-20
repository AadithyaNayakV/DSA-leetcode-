package Stack;

public class TwoStackqueue {
  
    void insert(int data1){
        for(int i=top1;i>-1;i++){
          int data=  pop(first,top1);
            insert(data,second,top2);
        }
        first[++top]=data;
         for(int i=top2;i>-1;i++){
          int data=  pop(second,top2);
            insert(data,first,top1);
        }

    }
    void insert(int a[],int data,top){
        a[++top]=data;
    }
    int pop(int a,int top){
        return a[top--];
    }
   public static void main(String[] args) {
    
   } 
}
