public class Student extends Observer{
    int id;
    public Student(CR cr,int id) {
        this.cr=cr;
        this.id=id;
    }
    
    @Override
    public void subscribe(){
        this.cr.attach(this);
    }
    @Override
    public void unsubscribe(){
        this.cr.remove(this);
    }
    
    @Override
    public void update() {
        System.out.println("Student "+id+" got a message from CR: "+this.cr.getMsg());
    }
    
}
