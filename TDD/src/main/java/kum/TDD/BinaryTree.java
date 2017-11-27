package kum.TDD;

public class BinaryTree implements Binary {

	private String value;
	
	private Binary left;
	
	private Binary right;
	
	public BinaryTree() {
		this.value = "5";
	}

	
	public BinaryTree(String myValue) {
		this.value = myValue;
	}

	public void addElement(String myValue) {
		if(myValue.compareToIgnoreCase(value)>0){
			if(right==null){
				right = new BinaryTree(myValue);
			}else{
				right.addElement(myValue);
			}
		}else{
			if(left==null){
				left = new BinaryTree(myValue);
			}else{
				left.addElement(myValue);
			}
		}
		
	}
	
	public int getHight() {
		int depth = 1;
		if(left==null&&right==null){
			
		}else if(left==null){
			depth=depth+right.getHight();
		}else if(right==null){
			depth = depth + left.getHight();
		}else {
			depth = depth + Math.max(right.getHight(), left.getHight());
			}
		
		return depth;
	}
	
	
	public String getValue() {
		return value;
	}

	public Binary getLeft() {
		return left;
	}

	public Binary getRight() {
		return right;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((left == null) ? 0 : left.hashCode());
		result = prime * result + ((right == null) ? 0 : right.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BinaryTree other = (BinaryTree) obj;
		if (left == null) {
			if (other.left != null)
				return false;
		} else if (!left.equals(other.left))
			return false;
		if (right == null) {
			if (other.right != null)
				return false;
		} else if (!right.equals(other.right))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return  value + " , " + left + " , " + right;
	}


	

	

}
