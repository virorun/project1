import javax.swing.JOptionPane;

public class jproject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name=JOptionPane.showInputDialog("enter your name");
		if(name.equals("majeed")||name.equals("Majeed")) {
			JOptionPane.showMessageDialog(null,"awfa "+name+ " no wear cap come school on monday o😂");
		}
		else if(name!="majeed"|| name!="Majeed")
		{
		JOptionPane.showMessageDialog(null,"howdy "+name);}
		int age=Integer.parseInt(JOptionPane.showInputDialog("how old are you?"));
		if(age<18)
		{		JOptionPane.showMessageDialog(null,"you're too young to be on this platform🔞");
		}
		else if(age>=18) {JOptionPane.showMessageDialog(null, "i guess you're okay for an "+age+" year old");}
		
		int height =Integer.parseInt(JOptionPane.showInputDialog("so, how tall are you?(cm)"));
		if(height<6) {JOptionPane.showMessageDialog(null, height+ "LMAO,you're short!!🤣");
				
		}
		else if(height>=160) {
		JOptionPane.showMessageDialog(null, "hmph,i see you're tall enough");}
		String country=JOptionPane.showInputDialog("state your nationality?");
		if(country.equals("nigeria")|| country.equals("Nigeria")|| country.equals("nigerian") || country.equals("Nigerian")&& height<160) {
		JOptionPane.showMessageDialog(null,"damn,you're Nigerian and short,bad combo!😂😂💔");}
		else if(country!="nigeria"&& country!="Nigeria") {
			JOptionPane.showMessageDialog(null,"stop denying your country,Nigerian boy😂😂");		
		}
	
			JOptionPane.showMessageDialog(null,"Thanks for your time, your information will be shown in the console interface below");
		
	System.out.println("NAME: "+name);	
	System.out.println("AGE: "+age+ "years");
	System.out.println("HEIGHT: "+height+"cm");
	System.out.println("NATIONALITY: "+country);
	System.out.println("Thank you!!");
	}
	
	}


