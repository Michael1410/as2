import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;



public class CircuitFileReader {
	
	public double StringToDouble(String str){
		return Double.parseDouble(str);
	}
	public static void main(String[] args) {  
		
		Scanner console = new Scanner(System.in);
		 System.out.print("Input file: ");
		 String inputFileName = console.next();
		 System.out.print("Output file: ");
		 String outputFileName = console.next();
		 System.out.println("Good designs saved to: " +outputFileName);
		 
		try {
			File file = new File(inputFileName);
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			StringBuffer stringBuffer = new StringBuffer();
			Writer output;
			System.out.println("The following bad designs are:");
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				stringBuffer.append(line);
				stringBuffer.append("\n");
				String[] vals = line.split("	");
				double[] dvals = new double[vals.length];
				for (int i = 0; i<vals.length; i++) dvals[i] = Double.valueOf(vals[i]);
				Double answer = ((dvals[0]+dvals[1])*dvals[3]*dvals[5])/((dvals[2]+dvals[3])*dvals[0]*dvals[4]);
				
				if (answer== 7.5){
					output = new BufferedWriter(new FileWriter(outputFileName, true));
					output.append(line+ System.lineSeparator());
					output.close();	
				}else{
					System.out.println(line);
				}
			
			
			}
			fileReader.close();
			

		} catch (IOException e) {
			e.printStackTrace();
		}
	}}
		 
		 
	
	
