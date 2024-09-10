package CoreJavaPratices;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ReadFile{
    public static void main(String[] args){


        try (BufferedReader br=new BufferedReader(new FileReader("D:\\Java notes\\Annotaions.docx"))){
            String line;
            while((line= br.readLine())!=null){
                System.out.println(line);
            }

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}