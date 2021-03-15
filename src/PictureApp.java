import java.net.*;
import java.io.*;
public class PictureApp {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
       URL url=new URL("https://e.ecimg.tw/items/DAAK011900B646S/000001_1614906715.jpg");
       URLConnection cn=url.openConnection();
       System.out.println("size:"+cn.getContentLength());
       InputStream in=cn.getInputStream();
       byte[] bt=new byte[1024];
       OutputStream out=new FileOutputStream("c:/A/demo.jpg");
       int size=0;
       while( (size=in.read(bt, 0, 1024))>0){
    	   out.write(bt, 0, size);
       }
       out.close();
       in.close();
       System.out.println("picture saved");
	}

}
