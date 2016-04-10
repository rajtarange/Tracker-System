package com.tracker.dao;

public interface BaseDAO<T>
{
	public boolean add(T object);
	public boolean update(T object);
	public boolean remove(T object);
}
