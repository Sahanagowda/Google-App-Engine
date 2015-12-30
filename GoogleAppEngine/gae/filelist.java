
import java.io.*;
import java.util.*;

public class filelist 
{
public static void main(String[] args) 
{

String strname = "3A9BC5DE2FGHI8JKL4MN1OPQRST0UVWX7Y6Z";
Random rand = new Random();
String fnames[] = {"1KB-","10KB-","100KB-","1MB-","10MB-","100MB-"};
String dnames[] = {"1KB","10KB","100KB","1MB","10MB","100MB"};
int fsizes[] = { 1024,10240,102400, 1048576, 10485760, 104857600};
int fcount[] = {100,100,100,100,10,1};

try 
{
for (int c = 0; c < 6; c++)
{
boolean success = (new File(dnames[c])).mkdirs();
if (success) 
{
for (int i = 1; i <= fcount[c]; i++) 
{
FileWriter fstream = new FileWriter(dnames[c]+"/"+ fnames[c] + String.format("%03d", i));
BufferedWriter out = new BufferedWriter(fstream);
int q =98;
for (int j = 1; j <= fsizes[c]; j++) 
{
out.write(strname.charAt(rand.nextInt(strname.length())));
if (j % q == 0) 
{
j = j + 2;
q = q+100;
out.newLine();
}
}
out.close();
}
}
}
} 

catch (IOException e) 
{
e.printStackTrace();
}

}
}


———————————————
<script>
<form