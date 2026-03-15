class Cstudent{
    String name;
    int rollno;
    Cstudent(String name, int rollno){
    this.name = name;
    this.rollno = rollno;
    }
    void display(){
    System.out.println(" name :"+ name);
    System.out.println(" rollno :" + rollno);
    }
  public static void main(String args[] ){
     Cstudent[]Cstudent = new Cstudent[3];
     Cstudent[0] = new Cstudent("Aman", 25);
     Cstudent[1] = new Cstudent("Rohit", 24);   
    Cstudent[2] = new Cstudent("Neha", 23);


    for (int i= 0;i<Cstudent.length;i++){
        Cstudent[i].display();
    }

    }
}
   