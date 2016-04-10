package com.tracker.service;

public interface BaseService<T>
{
	public boolean add(T object);
	public boolean update(T object);
	public boolean remove(T object);
}
