import javax.swing.JOptionPane;

public class Horoscope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sign = JOptionPane.showInputDialog("Enter a Zodiac sign.");
		if(sign.equalsIgnoreCase("aquarius")||sign.equalsIgnoreCase("Pisces")){
			JOptionPane.showMessageDialog(null, "you will burn");
	}
		else if(sign.equalsIgnoreCase("Aries")||sign.equalsIgnoreCase("Taurus")){
			JOptionPane.showMessageDialog(null, "you will be successful");
		}
		else if(sign.equalsIgnoreCase("gemini")||sign.equalsIgnoreCase("cancer")){
			JOptionPane.showMessageDialog(null, "you will not be successful");
		}
		else if(sign.equalsIgnoreCase("leo")||sign.equalsIgnoreCase("Virgo")){
			JOptionPane.showMessageDialog(null, "you will not burn");
		}
		else if(sign.equalsIgnoreCase("libra")||sign.equalsIgnoreCase("scorpio")){
			JOptionPane.showMessageDialog(null, "you will live forever");
		}
		else if(sign.equalsIgnoreCase("Sagittarius")||sign.equalsIgnoreCase("Capricorn")){
			JOptionPane.showMessageDialog(null, "you will die soon");
		}
		else {
			JOptionPane.showMessageDialog(null, "You're and idiot. That isn't a Zodiac sign.");
		}
		}
		
	}
	

