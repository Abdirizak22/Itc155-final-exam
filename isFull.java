public boolean isFull()
	{
		if(overallRoot == null)
			return true;
		else
			return isFull(overallRoot);
	}

	private boolean isFull(IntTreeNode root) 
	{
		if(root == null)
		{
			return false;
		}
		else if(isFull(root.left) && isFull(root.right))
		{
			return true;
		}
		else if(root.left == null && root.right == null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
