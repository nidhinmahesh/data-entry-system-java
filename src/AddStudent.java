import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class AddStudent{

    public void newStudent()
    {

        String query;
            String[] get = new String[20];
            int i=0;
            int k=0;

            Scanner scan = new Scanner(System.in);

        try{
            
            BufferedReader reader = new BufferedReader(new FileReader("bio.txt"));
            
            while((query = reader.readLine())!= null)
            {
                System.out.println(query);
                get[i] = scan.nextLine();
                i++;


            }
            reader.close();
            scan.close();
        }
        catch(Exception e){
            System.out.println("Cannot read bio: "+e);
        }



        try{

            FileWriter fw = new FileWriter("students.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw);
            
                out.print("\n");

                while(i>=0)
                {
                    out.print(get[k]+"\t");
                    
                    k++;
                    i--;
                }
                
                out.close();
                
                System.out.println("done.|/");
            }
            catch(Exception e)
            {
                System.out.println("Cannot add student: "+e);
            }
    }
    
}
