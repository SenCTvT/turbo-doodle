import java.util.*;
import java.io.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
public class Test3
{
	static String output = "";
	static int arr2[] = new int[10];
	static int min,max;
	static int arr[]=new int[10];
	static Scanner sc=new Scanner(System.in);
	public static void input()
	{
		min=0;
		max=9;
	}
	public static int genRandom() {
		int range = (max - min) + 1;     
		int random= (int)(Math.random() * range);
		return random;
	}

		public static boolean containsDuplicates(int k) 
		{
		
			for (int i = 0; i < k; i++) 
				{ 
				for (int j = i + 1 ; j < k; j++) 
				{ 
					if (arr[i]==arr[j]) 
					{ 
						shuffle(k);
						return true;
					}
				}
			
		}
	//	int n = arr.length;
		/*for (int i = 0; i < arr.length; i++) {
			int random = i + (int) (Math.random() * (n - i));
			int randomElement = arr[random];
			arr[random] = arr[i];
			arr[i] = randomElement;
		}*/
		
		return false;
	}

	public static void shuffle(int k) {
		arr[0]=min;
		arr[1]=1;
		
		
		
		for (int i = 2; i < k; i++) {
			arr[i] = genRandom();
		}
		containsDuplicates(k);
	}
  public static void clearTheFile()throws Exception {
        FileWriter fwOb = new FileWriter("filename.java", false); 
        PrintWriter pwOb = new PrintWriter(fwOb, false);
        pwOb.flush();
        pwOb.close();
        fwOb.close();
    }


 private static String printLines(String cmd, InputStream ins) throws Exception {
        String line = null;
        BufferedReader in = new BufferedReader(new InputStreamReader(ins));
        //while ((line = in.readLine()) != null) {
          //  System.out.println(cmd + " " + line);
        //}
        if(cmd == "error"){
			if((line = in.readLine())==null){
				return "1";
			}
			else
				return "0";
		}
		if(cmd == "output")
		{
			return in.readLine();
		}
		else
			return "0";
		}
  

      private static int runProcess1(String command) throws Exception {
        Process pro = Runtime.getRuntime().exec(command);
        int test2=99; 
		String err =printLines("error", pro.getErrorStream());
        String opt = printLines("output", pro.getInputStream());
       // System.out.println("test2 value = "+test2);
        pro.waitFor();
		if(err == "1")
			return 1;
		else
			return 0;
		}
		private static int runProcess2(String command) throws Exception {
        Process pro = Runtime.getRuntime().exec(command);
        int test2=99; 
		String err =printLines("error", pro.getErrorStream());
        String opt = printLines("output", pro.getInputStream());
        //System.out.println("test2 value = "+test2);
        pro.waitFor();
     //   System.out.println(opt+"  "+err);
     
     try{
		if(err.equals("1")==true&&opt.equals(output)==true)
		{
			System.out.println("bc");
			return 1;}
		else{
			System.out.println("dasd");
			return 0;
		}
	}
	catch(NullPointerException e)
	{
		String s=e.toString();
		System.out.println("########### E X C E P T I O N #########################");
		System.out.println("		Exception");
		System.out.println("		Exception");
		System.out.println("		Exception");
			
      }
return 0;
}

	public static void main(String args[])throws Exception
		{
			System.out.println("Enter the input");
			int inp = sc.nextInt();
				
			System.out.println("Enter the output");
			sc=new Scanner(System.in);
			output = sc.nextLine();
			File f= new File("Name.java");
			if(f.exists())
				clearTheFile();
			FileWriter out=new FileWriter(f);
			String arr1[]= {"class Name","{","public static void main(String args[])","int n = "+inp+";","if(n%2==0)","","{","System.out.println(\""+output+"\");","}","}"};
        	int n = arr1.length;
			int arr2[] = new int[n];
			int test=99;
			int test3=232;
			int cscounter=0;
			//int k=6;
			outer:
			for(int k=7;k<10;k++){
			int counter = 0;
			while(true){
				Scanner input = new Scanner(new File("Name.java"));
				
				System.out.println("counter =" +counter);
				
					Test3 ob = new Test3();
					ob.input();
					shuffle(k);
					PrintWriter writer = new PrintWriter("Name.java");
					for(int i =0;i<k;i++)
					{
						
						//writer.println("The first line");
						writer.println(arr1[arr[i]]);
						arr2[arr[i]]=1;
					}
					writer.close();
		
					
					
					try{
						test = runProcess1("javac Name.java");
					} catch (Exception e) {
							e.printStackTrace();
						}
					System.out.println(test);
					System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
					while (input.hasNextLine())
					{
						System.out.println(input.nextLine());
					}
					System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
					if(test == 1)
					{
						test3 = runProcess2("java Name");
						//System.out.println(test3);
						if(test3 == 1)
						{
							for(int i =0 ;i<arr1.length;i++){
								System.out.println(arr2[i]);
							}
						//	System.out.println("4");
							break outer;
						}
					}
					for(int i =0;i<k;i++){
						arr2[i]=0;
					}
					counter++;
					if(counter > 1000)
					{
						break;
					}
				
				}
				
					
				
				
			}
			
		
		}
	}

	
			
			
