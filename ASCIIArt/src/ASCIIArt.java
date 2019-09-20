/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using
 * ASCII (American Standard Code for Information Interchange). Using the already
 * created file named `ASCIIArt.java` write a program that outputs your artwork
 * to the console. The goal of this project is to use ONLY what we have learned
 * in Unit 1 to create anything you would like so be creative (and school
 * appropriate). Artwork must also have a caption describing what it's
 * depicting.
 * 
 * For those of you who have dabbled in coding before, try to contain your code
 * to just what we have discussed in this unit.
 * 
 * @author Mr. Rasmussen
 *
 */
// I had too much fun making one, so I made another one. 
public class ASCIIArt {
	public static void topBox() { // first method- creates the top of the box
		System.out.println("\t\t\t________________________");
	}

	public static void textBox() { // second method- adds the text
		System.out.println("\t\t\t|   \"Give me a 10!\"    |");
	}

	public static void middleBox() { // third method- writes the middle of the box
		System.out.println("\t\t\t|                      |");
		textBox();
		System.out.println("\t\t\t|______________________|");
	}

	public static void box() { // method for the whole box- calls on topBox method and middleBox method
		topBox();
		middleBox();
		System.out.println("\t\t\t\t\\/");
	}

	public static void gymnast() { // fifth method- writes the gymnast
		System.out.println("     _______________________");
		System.out.println("    /____________ \\/ ______ \\");
		System.out.println("                / ~ )      | |");
		System.out.println("               / ~ /       | |");
		System.out.println("               \\ ~ \\        \\/");
		System.out.println("                \\   )>");
		System.out.println("                 | |");
		System.out.println("                 | |");
		System.out.println("_________________|_|___________________________");
	}

	public static void beam() { // sixth method- writes the beam
		System.out.println(" \\   /                                   \\   /");
		System.out.println("  \\ /                                     \\ /");
		System.out.println("   /                                       \\");
		System.out.println("  /                                         \\");
	}

	public static void gymnast2() {//decided to add another gymnast
		System.out.println("            /\\ ");
		System.out.println("            \\ \\");
		System.out.println("             | |");
		System.out.println("             | | ");
		System.out.println("             | |           /| ");
		System.out.println("            (~~|           ||");
		System.out.println("             \\~\\           ||");
		System.out.println("            /~~|           ||");
		System.out.println("         __/~~/            ||");
		System.out.println("        (^_) /             ||");
		System.out.println("           //              ||");
		System.out.println("          //               ||");
		System.out.println("        _/_/               ||  ");
	}

	public static void verticalBar() {
		System.out.println("||                         ||");
	}

	public static void horizBar() {
		System.out.println("||_________________________||");
	}

	public static void bar() {
		System.out.println("|\\                         || ");
		verticalBar();
		horizBar();
		horizBar();
		verticalBar();
		verticalBar();
		verticalBar();
		verticalBar();
		verticalBar();
	}

	public static void main(String[] args) { // calls the methods to finish the picture
		box();
		gymnast();
		beam();
		System.out.println("\n  A gymnast desperately seeks the perfect 10.");
		System.out.println("\n");
		gymnast2();
		bar();
		System.out.println("\nA gymnast doing a Pak salto between the bars.");
	}
}
