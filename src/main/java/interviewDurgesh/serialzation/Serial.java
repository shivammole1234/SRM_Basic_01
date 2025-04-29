package interviewDurgesh.serialzation;
import java.io.*;

public class Serial   {

    public static void main(String[] args) throws IOException {

       try{
           Student student=new Student("shivam","shivam@gmail.com",123);

           // creating the file to write the object in it
           FileOutputStream fileOutputStream=new FileOutputStream("ob.txt");

           ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);


           objectOutputStream.writeObject(student);

           // for reading the object from file
           FileInputStream fileInputStream=new FileInputStream("ob.txt");

           ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);

           Student s1=(Student) objectInputStream.readObject();
           System.out.println(s1);
           System.out.println(s1.getName());


 
       }catch (IOException ioException){
           ioException.printStackTrace();
       } catch (ClassNotFoundException e) {
           throw new RuntimeException(e);
       }
    }
}
