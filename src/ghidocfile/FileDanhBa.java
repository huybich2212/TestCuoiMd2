package ghidocfile;

import neww.DanhBa;

import java.io.*;
import java.util.List;

public class FileDanhBa{
    public static void writeToFile(String path,List<DanhBa>danhBaList) throws IOException {
        FileWriter fw=new FileWriter(path);
        BufferedWriter bw=new BufferedWriter(fw);
        String str="soDt,nam,address,dateOfBritd(),email";
        for (DanhBa db:
                danhBaList) {
            str+=db.getSoDt()+" "+ db.getName()+" "+db.getAddress()+" "+db.getDateOfBritd()+" "+db.getEmail()+"\n";
        }
        bw.write(str);
        bw.close();
        fw.close();
    }
    public static List<DanhBa>list(String path) throws IOException {
        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);
        String count= br.readLine();
        while ((count= br.readLine())!=null){
            System.out.println(count);
        }
        return null;
    }
}