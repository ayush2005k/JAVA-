class emoloye {
    int salary;
    String name;
    public int getsalary(){
        return salary;
    }
    public String getname(){
        return name;
    }  
}
public class worker {
    public static void main(String[] args) {
        emoloye work = new emoloye();
        work.name = "ayush";
        work.salary = 10000;
        System.out.println(work.getname());
        System.out.println(work.getsalary());
    }
    
}
