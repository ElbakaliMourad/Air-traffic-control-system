package com.mourad.main.services;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.mourad.main.model.AC;

public class QueueServicesImpl implements QueueServices {
	
	private List<AC> acQueue = new LinkedList<AC>();
	
	@Override
	public void enqueue(AC airCraft) {
		acQueue.add(airCraft);
		System.out.println(acQueue);
	}
	
	@Override
	public AC dequeue() {
		AC airCraft = null;
		if(!acQueue.isEmpty()){
			Collections.sort(acQueue, new PriorityFilter());
			airCraft=acQueue.remove(0);
		}
		return airCraft;
	}

	@Override
	public void showQueue() {
		System.out.println(acQueue);		
	}

}
