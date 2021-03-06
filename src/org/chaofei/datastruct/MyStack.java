package org.chaofei.datastruct;

public interface MyStack<T> {
	/**
	 * 栈是否为空
	 * */
	boolean isEmpty();
	
	/**
	 * data元素入栈
	 * @param data
	 * @throws Exception 
	 */
	void push(T data) throws Exception;
	
	/**
	 * 返回栈顶元素,未出栈
	 * @return
	 */
	T peek();
	
	/**
	 * 出栈,返回栈顶元素,同时从栈中移除该元素
	 * @return
	 */
	T pop();
}
