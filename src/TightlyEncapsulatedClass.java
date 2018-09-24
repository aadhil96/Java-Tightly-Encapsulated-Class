class student {
    private String Stdname;
    private String StdId;
 
    public String getStdname(){
        return Stdname;
    }
    public void setStdname(String Stdname){
        this.Stdname = Stdname;
    }
}

public class TightlyEncapsulatedClass {

    public static void main(String[] args) {
        student std1 = new student();
        std1.setStdname("Aadhil");
        System.out.println("Student name is:"+std1.getStdname());
    }
}
