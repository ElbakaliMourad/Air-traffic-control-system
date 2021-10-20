package com.mourad.main.services;

import com.mourad.main.model.AC;

public interface QueueServices {

	public void enqueue(AC airCraft);
	public AC dequeue();
	public void showQueue();
}
