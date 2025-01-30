/*Status column refers to the status with respect to Harry Potter.
1.	Write a function that will create these data into array of objects.
2.	Write a function that will return the list of names of all characters who belonged to the Gryffindor house
3.	Write a function that will return the details of all the characters who are alive
4.	Write a function that will return all the details of the family members of Harry Potter
*/
package com.classWork;
class Details{
	String name;
	String house;
	String Role;
	String status;
	String dies;
	
	Details(String name,String house,String Role,String status,String dies ){
		this.name=name;
		this.house=house;
		this.Role=Role;
		this.status=status;
		this.dies=dies;
	}
	public String toString() {
		return " "+name+ " "+house +" "+Role+" "+status+" "+dies;
	}
}
public class HarryPotter {
 
	public static void main(String[] args) {
		Details[] obj=new Details[30];
		obj[0]=new Details("HarryPotter","Gryffindor","Student","Self","No");
		obj[1]=new Details("Ginny Weasley","Gryffindor","Student","Friend","No");
		obj[2]=new Details("Ron Weasley","Gryffindor","Student","Friend","No");
		obj[3]=new Details("Hermione Granger ","Gryffindor","Student","Friend","No");
		obj[4]=new Details("Neville Longbottom ","Gryffindor","Student","Friend","No");
		obj[5]=new Details("Oliver Wood","Gryffindor","Student","Friend","No");
		obj[6]=new Details("Luna Lovegood","Ravenclaw","Student","Friend","No");
		obj[7]=new Details("Cho Chang","Ravenclaw","Student","Friend","No");
		obj[8]=new Details("Cedric Diggory","Hufflepuff","Student","Friend","Yes");
		obj[9]=new Details("Hannah Abbot","Hufflepuff","Student","Friend","No");
		obj[10]=new Details("Draco Malfoy","Slytherin","Student","Enemy","No");
		obj[11]=new Details("Vincent Crabbe","Slytherin","Student","Enemy","Yes");
		obj[12]=new Details("Gregory Goyle","Slytherin","Student","Enemy","No");
		obj[13]=new Details("Penelope Clearwater","Slytherin","Student","Enemy","No");
		obj[14]=new Details("Albus Dumbledore","Gryffindor","Faculty","Friend","Yes");
		obj[15]=new Details("Severus Snape","Slytherin","Faculty","Enemy","Yes");
		obj[16]=new Details("Remus Lupin","Gryffindor","Faculty","Friend","Yes");
		obj[17]=new Details("Horace Slughorn","Slytherin","Faculty","Friend","No");
		obj[18]=new Details("Rubeus Hagrid","Gryffindor","Faculty","Friend","No");
		obj[19]=new Details("Minerva McGonagall","Gryffindor","Faculty","Friend","No");
		obj[20]=new Details("James Potter","Gryffindor","Student","Family","Yes");
		obj[21]=new Details("Sirius Black","Gryffindor","Student","Friend","Yes");
		obj[22]=new Details("Lily Potter","Gryffindor","Student","Family","Yes");
		obj[23]=new Details("Peter Pettigrew","Gryffindor","Student","Enemy","Yes");
		obj[24]=new Details("Tom Marvolo Riddle","Slytherin","Student","Enemy","Yes");
		
		printDetails(obj);	
		}
 
	private static void printDetails(Details[] obj) {
		System.out.println("Names of characters belonged to Gryffindor house:");
		for(int i=0;i<25;i++) {
			if(obj[i].house=="Gryffindor")
				System.out.println(obj[i].name);
		}
		System.out.println("Characters that are alive:");
		for(int i=0;i<25;i++)
		{
			if(obj[i].dies=="No")
				System.out.println(obj[i].name);
		}
		System.out.println("Family members of Harry Potter:");
		for(int i=0;i<25;i++)
		{
			if(obj[i].status=="Family")
				System.out.println(obj[i].name);
		}
	}
 
	
}
