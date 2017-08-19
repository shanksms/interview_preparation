/**
 * 
 */
package com.epi.heap;

/**
 * @author Shashank
 *
 */
class Entry {
	Integer value;
	Integer listId;
	
	 Entry(Integer value , Integer listId) {
		this.value = value;
		this.listId = listId;
	}
	
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	public Integer getListId() {
		return listId;
	}
	public void setListId(Integer listId) {
		this.listId = listId;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.value + " " + this.listId;
	}
	
}