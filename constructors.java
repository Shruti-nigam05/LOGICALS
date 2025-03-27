class LearnConstructor{
    int id;
    String name;
    String result;

    public void setId(int i){
        id = i;
    }

    public void setName(String n){
         name = n;
    }

    public void setResult(String n){
        result = n;
   }

   public String getResult(){
    return result;
}

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public LearnConstructor(int new_id,String new_n){
        id = new_id;
        name = new_n;
        //int y = new_id;
    }
}

public class constructors {
    public static void main(String[] args) {
        LearnConstructor obj1 = new LearnConstructor(54,"harry");
        LearnConstructor obj2 = new LearnConstructor(54,"Shruti");

        

obj1.result = "pass";
obj2.result = "fail";


        System.out.println(obj1.getId());
        System.out.println(obj1.getName());
        System.out.println(obj1.getResult());
        System.out.println(obj2.getId());
        System.out.println(obj2.getName());
        System.out.println(obj2.getResult());


//obj.setId();
    }
}
