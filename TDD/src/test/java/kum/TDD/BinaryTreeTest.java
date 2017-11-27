package kum.TDD;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BinaryTreeTest {

	
	private BinaryTree binaryTree;
	
	@Before
	public void setUp(){
		binaryTree = new BinaryTree();
	}
	
	@Test
	public void testBinaryIsNotEmpty(){
		BinaryTree binaryTree = new BinaryTree();
		assertEquals("5", binaryTree.getValue());
	}
	
	@Test
	public void testLeftIsNull(){
		assertEquals(null, binaryTree.getLeft());
	}
	
	@Test
	public void testRightIsNull(){
		assertEquals(null, binaryTree.getRight());
	}
	
	@Test
	public void testAddElementBiggerThanRoot(){
		binaryTree.addElement("7");
		assertNotNull(binaryTree.getRight());
	}
	
	
	@Test
	public void testAddElementLessThanRoot(){
		binaryTree.addElement("3");
		assertNotNull(binaryTree.getLeft());
	}
	
//	@Test
//	public void testAddElementInTheNextLeftBranch(){
//		binaryTree.addElement(3);
//		binaryTree.addElement(2);
//		assertTrue(binaryTree.getLeft().);
//	}

	
	@Test 
	public void testGetHeightWhanBinaryIsEmpty(){
		assertEquals(1, binaryTree.getHight());
	}
	
	@Test 
	public void testGetHeightIfMaxDepthInRight(){
		binaryTree.addElement("7");
		binaryTree.addElement("9");
		binaryTree.addElement("11");
		assertEquals(3, binaryTree.getHight());
	}
	@Test 
	public void testGetHeightIfMaxDepthInLeft(){
		binaryTree.addElement("3");
		binaryTree.addElement("2");
		binaryTree.addElement("1");
		assertEquals(4, binaryTree.getHight());
	}
	
	
	@Test 
	public void testGetHeight(){
		binaryTree.addElement("3");
		binaryTree.addElement("7");
		binaryTree.addElement("9");
		assertEquals(3, binaryTree.getHight());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
