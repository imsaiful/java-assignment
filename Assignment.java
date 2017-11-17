import java.util.*;
class Assignment
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		//HashMap data structure which is going to store the Random value and to store the frequency of the random number generated    
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();  
		System.out.println("Enter the lower limit");
		int min=in.nextInt();
		System.out.println("Enter the upper limit");
		int max=in.nextInt();
		if(min>=max)
		{
			System.out.println("Maximum value shoul be greater then minimum");
			System.exit(0);

		}

		Random r=new Random();
		System.out.println("Enter how many time you want to generate Random Number");
		int n=in.nextInt();
		if(n<=0)
		{
			System.out.println("You should generate the random number at least one time");
			System.exit(0);
		}
		int i=0;
		while(i<n)
		{
			
			boolean flag=false;
			//Random function to generate the random value
			int randomNum=r.nextInt((max - min) + 1) + min;
			//check whether the random value is already exist in the hashmap or not
			for(Map.Entry m:map.entrySet())
				{  
					//if random number exist we will increase the vaalue of the key by one
					if(randomNum==(int)m.getKey())
					{
						map.put(randomNum, map.get(randomNum) + 1);
						flag=true;
					}  
					
  				}
  				//if value does not exist then we will put the value in hashmap along with the initial key value one.
  			if(flag==false)
  			{
  				map.put(randomNum,1);
  			} 
  			i++;
  		}
  		//print the random number and how many times a random number is generated within the range.
  		System.out.println("Random Number"+"     "+"Frequency");  
  		for(Map.Entry m:map.entrySet())
  		{  
   			System.out.println(m.getKey()+"                 "+m.getValue());  
  		}  	
	}
}