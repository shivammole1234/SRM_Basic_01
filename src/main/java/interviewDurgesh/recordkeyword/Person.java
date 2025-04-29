package interviewDurgesh.recordkeyword;

public record Person(int id,String name,String address,String phoneNumber){
    // getters
    // hashcode
    // equal
    //toString

    public void displayName(){
        System.out.println("hello i am "+name);
    }

    public static void staticMethod(){
        System.out.println("this is static method ");
    }

}