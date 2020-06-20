public boolean hasTwoConsecutive()
	{
		if(front == null)
			return false;
		
		ListNode current = front;
		while(current.next != null)
		{
			if(current.data == current.next.data - 1)
				return true;
			
			current = current.next;
		}

		return false;
	}
