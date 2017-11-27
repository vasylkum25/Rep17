package kum.TDD;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	BinaryTree binaryTree = new BinaryTree();
    	binaryTree.addElement("3");
    	binaryTree.addElement("7");
    	binaryTree.addElement("9");
    	binaryTree.addElement("11");
    	System.out.println(binaryTree);
    	System.out.println(binaryTree.getHight());
    	System.out.println("9".compareTo("11"));
    }
}
