class hello{
public int sum(int a,int b);
public int diff(int a,int b);
}
class Studentimp implements Student{
    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
}
class StudentMain extends Studentimp{
    public static void main(String[] args){
Studentimp s=new Studentimp();
Scanner sc=new Scanner(System.in);
System.out.println("enter 1st num");
int a=sc.nextInt();
System.out.println("enter 2nd num");
int b=sc.nextInt();
System.out.println("sum:"+s.add(a,b));
System.out.println("diff:"+s.sub(a,b));

    }

    

}
