package ViewStyle;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class Style {

	public static Color defaultColor;
	public static Color shadow = new Color(20,20,20);
    public static Color highlight = new Color(70,70,70);
    public static Icon searchIcon = new ImageIcon("sunshineImg/s1.png");
    public static Dimension textFieldDimension = new Dimension(100,20);
    public static Font smallerFont = new JLabel().getFont().deriveFont(10f);

    public static Font getSmallerFont() {
        return smallerFont;
    }
    public static Color getDefaultColor(){
		defaultColor = new Color(32, 32, 32);
		return defaultColor;
	}
	public static Border getDefaultBorder(){
		Border defaultBorder = BorderFactory.createEtchedBorder(EtchedBorder.RAISED, shadow, highlight);
		return defaultBorder;
		
	}
    public static Border getDefaultBorder2(String title){
        Border defaultBorder = BorderFactory.createTitledBorder(Style.getDefaultBorder(), title, TitledBorder.LEFT, TitledBorder.TOP,null,Color.GRAY);
        return defaultBorder;
    }
}
